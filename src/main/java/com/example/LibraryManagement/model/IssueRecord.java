package com.example.LibraryManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "issuerecords")
public class IssueRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private Boolean isReturned;
}