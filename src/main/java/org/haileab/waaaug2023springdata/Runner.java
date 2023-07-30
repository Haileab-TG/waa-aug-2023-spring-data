package org.haileab.waaaug2023springdata;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.entity.Product;
import org.haileab.waaaug2023springdata.repository.CategoryRepo;
import org.haileab.waaaug2023springdata.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;
    @Override
    public void run(String... args) throws Exception {
//        Category category = new Category();
//        List<Product> products = new ArrayList<>();
//        Product product = new Product();
//        Product product1 = new Product();
//        Product product2 = new Product();
//        products.add(product);
//        products.add(product1);
//        products.add(product2);
//        category.setProducts(products);
//        categoryRepo.save(category);
    }
}
