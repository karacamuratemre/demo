package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreId;
    private String genreName;
}
