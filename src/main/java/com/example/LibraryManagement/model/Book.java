package com.example.LibraryManagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private Integer quantity;

    @Column(name = "is_available") // Optional: for clarity in DB schema
    private Boolean isAvailable;
}