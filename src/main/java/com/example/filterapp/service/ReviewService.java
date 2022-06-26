package com.example.filterapp.service;

import com.example.filterapp.models.Review;

import java.util.List;

public interface ReviewService {

    List<Review> findAll();

    void sortRating(List<Review> r,String p);
}
