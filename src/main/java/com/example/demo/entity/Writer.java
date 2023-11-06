package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Writer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long writerId;
    private String name;
    private LocalDate birthdate;
}
