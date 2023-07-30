package org.haileab.waaaug2023springdata.controller;

import org.haileab.waaaug2023springdata.entity.Review;
import org.haileab.waaaug2023springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categories/{categoryId}/products/{productsId}/reviews")
public class ReviewController {
    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review addOne( @RequestBody Review review, @PathVariable int productsId){
        return reviewService.save(review, productsId);
    }

    @GetMapping()
    public List<Review> getAll(@PathVariable int productsId){
        return reviewService.getAll(productsId);
    }

}
