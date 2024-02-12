package com.marcus.awsWebServiceTest.repository;

import com.marcus.awsWebServiceTest.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlRepository extends JpaRepository<Book, Long> {
}
