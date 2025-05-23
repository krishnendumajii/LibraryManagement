package com.example.LibraryManagement.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
//    @CollectionTable(
//            name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id")
//    )
  //  @Column(name = "role")
    private Set<String> roles;
}

