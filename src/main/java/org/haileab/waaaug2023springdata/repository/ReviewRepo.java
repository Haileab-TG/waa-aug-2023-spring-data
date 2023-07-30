package org.haileab.waaaug2023springdata.repository;

import org.haileab.waaaug2023springdata.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {
    List<Review> findReviewsByProductId(int productId);
}
