package com.marcus.awsWebServiceTest.models;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @MongoId
    private String id;
    private String title;

    private String author;
}
