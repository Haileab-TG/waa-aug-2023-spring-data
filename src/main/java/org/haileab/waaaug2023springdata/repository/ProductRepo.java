package org.haileab.waaaug2023springdata.repository;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findProductsByPriceGreaterThan(double price);
    List<Product> findProductsByCategoryIdAndPriceLessThan(int catId, double price);
    List<Product> findProductsByNameContaining(String keyword);
}
