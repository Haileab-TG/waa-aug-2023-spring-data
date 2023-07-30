package org.haileab.waaaug2023springdata.controller;

import org.haileab.waaaug2023springdata.entity.Product;
import org.haileab.waaaug2023springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories/{categoryId}/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product addOne(@PathVariable int categoryId, @RequestBody Product product){
        return productService.save(categoryId, product);
    }

    @GetMapping(path = "/{productId}")
    public Product getOne(@PathVariable int productId){
        return productService.getById(productId);
    }

    @GetMapping(path = "/filterByPrice")
    public List<Product> getByPriceGreaterThan(@RequestParam double price){
        return productService.getProductsByPriceGreaterThan(price);
    }

    @GetMapping(path = "/fiterByCatAndPrice")
    public List<Product> getProductsByCategoryAndPriceLessThan(@RequestParam int catID, @RequestParam double price){
        return productService.getProductsByCategoryAndPriceLessThan(catID, price);
    }

    @GetMapping(path = "/filterByNameKeyword")
    public List<Product> getProductsByNameContaining(@RequestParam String keyword){
       return productService.getProductsByNameContaining(keyword);
    }
}
