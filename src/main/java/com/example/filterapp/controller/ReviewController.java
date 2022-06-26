package com.example.filterapp.controller;

import com.example.filterapp.models.Review;
import com.example.filterapp.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public String getReviewPage(@RequestParam(required = false) String error, Model model) {
        List<Review> review = this.reviewService.findAll();
        model.addAttribute("review", review);
        return "review";
    }
    List<Review> rat;
    @GetMapping("/filter")
    public String getReviewFilter(@RequestParam(required = false) String priority,@RequestParam(required = false) Integer rating, Model model) {
        List<Review> filter = this.reviewService.findAll();
        if(rating!=null && priority!=null){
            rat = this.reviewService.findAll().stream().filter(i->i.getRating()>=rating).collect(Collectors.toList());
            this.reviewService.sortRating(rat,priority);
        }
        else{
            rat = this.reviewService.findAll();
        }
        model.addAttribute("ra", rat);
        model.addAttribute("filter", filter);
        return "reviewFilter";
    }
}
