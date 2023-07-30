package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Product;
import org.haileab.waaaug2023springdata.entity.Review;
import org.haileab.waaaug2023springdata.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{
    private ReviewRepo reviewRepo;
    private ProductService productService;

    @Autowired
    public ReviewServiceImpl(ReviewRepo reviewRepo, ProductService productService) {
        this.reviewRepo = reviewRepo;
        this.productService = productService;
    }

    @Override
    public Review save(Review review, int productId) {
        Product product = productService.getById(productId);
        review.setProduct(product);
        reviewRepo.save(review);
        return review;
    }

    @Override
    public List<Review> getAll(int productsId) {
        return reviewRepo.findReviewsByProductId(productsId);
    }
}
