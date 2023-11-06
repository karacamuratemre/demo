package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    private Movie movie;

    @OneToOne
    private User user;

    private BigDecimal rating;
    private String reviewText;
}
