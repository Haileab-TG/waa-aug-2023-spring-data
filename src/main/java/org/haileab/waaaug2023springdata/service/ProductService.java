package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(int catId, Product product);
    Product getById(int id);
    List<Product> getProductsByPriceGreaterThan(double price);
    List<Product> getProductsByCategoryAndPriceLessThan(int catId, double price);

    List<Product> getProductsByNameContaining(String keyword);
}
