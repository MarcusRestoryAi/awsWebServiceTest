package com.marcus.awsWebServiceTest.repository;

import com.marcus.awsWebServiceTest.models.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<Book, String> {
}
