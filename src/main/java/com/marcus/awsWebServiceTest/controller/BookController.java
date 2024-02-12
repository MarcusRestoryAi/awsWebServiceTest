package com.marcus.awsWebServiceTest.controller;

import com.marcus.awsWebServiceTest.models.Book;
import com.marcus.awsWebServiceTest.repository.MySqlRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
// @RequiredArgsConstructor
public class BookController {

    //private final MongoRepository mongoRepository;
    private final MySqlRepository mySqlRepository;

    public BookController(/*MongoRepository mongoRepository,*/ MySqlRepository mySqlRepository) {
        this.mySqlRepository = mySqlRepository;
        //this.mongoRepository = mongoRepository;
    }

    @PostMapping("")
    public ResponseEntity<Book> addBook (@RequestBody Book book) {
        //Spara book till DB, få den sparade boken tillbaka
        //Book respBook = mongoRepository.save(book);
        Book respBook = mySqlRepository.save(book);

        //Retunera book till avsändare
        return ResponseEntity.status(201).body(respBook);
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks () {
        //Hämta alla böcker från DB
        //List<Book> books = mongoRepository.findAll();
        List<Book> books = mySqlRepository.findAll();

        //Retuera alla böcker till avsändare
        return ResponseEntity.status(200).body(books);
    }
}
