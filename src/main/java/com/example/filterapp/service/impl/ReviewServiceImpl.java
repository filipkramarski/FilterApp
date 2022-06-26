package com.example.filterapp.service.impl;

import com.example.filterapp.models.Review;
import com.example.filterapp.repository.ReviewRepository;
import com.example.filterapp.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return this.reviewRepository.findAll();
    }

    @Override
    public void sortRating(List<Review> review,String p) {
        if(p.equals("Lowest"))
        {
            Comparator<Review> byRating = Comparator.comparing(Review::getRating);
            Collections.sort(review, byRating);
        }
        else if (p.equals("Highest")){
            Comparator<Review> byRating = Comparator.comparing(Review::getRating);
            Comparator<Review> byRatingReversed
                    = byRating.reversed();
            Collections.sort(review, byRatingReversed);
        }
    }

}
