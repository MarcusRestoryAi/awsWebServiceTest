package com.marcus.awsWebServiceTest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Document
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    //@MongoId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private String id;
    private Long id;
    private String title;

    private String author;
}
