package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    Review save(Review review, int productId);

    List<Review> getAll(int productsId);
}
