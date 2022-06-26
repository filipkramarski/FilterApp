package com.example.filterapp.repository;

import com.example.filterapp.data.DataHolder;
import com.example.filterapp.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewRepository{

    public List<Review> findAll(){
        return DataHolder.review;
    }

}
