package com.example.demo.service;

import com.example.demo.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review saveReview(Review review);
    Optional<Review> getReviewById(Long reviewId);
    List<Review> getAllReviews();
    void deleteReview(Long reviewId);
}
