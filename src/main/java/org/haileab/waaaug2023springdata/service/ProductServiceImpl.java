package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.entity.Product;
import org.haileab.waaaug2023springdata.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepo productRepo;
    private CategoryService categoryService;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo, CategoryService categoryService) {
        this.productRepo = productRepo;
        this.categoryService = categoryService;
    }

    @Override
    public Product save(int catId, Product product){
        Category category = categoryService.findById(catId);
        product.setCategory(category);
        category.getProducts().add(product);
        productRepo.save(product);
        return product;
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getProductsByPriceGreaterThan(double price) {
        return productRepo.findProductsByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getProductsByCategoryAndPriceLessThan(int catId, double price) {
        return productRepo.findProductsByCategoryIdAndPriceLessThan(catId, price);
    }

    @Override
    public List<Product> getProductsByNameContaining(String keyword) {
        return productRepo.findProductsByNameContaining(keyword);
    }

}
