package org.haileab.waaaug2023springdata.controller;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categories")
public class CategoryController {
    private CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public Category addOne(@RequestBody Category category){
        return categoryService.save(category);
//        return category;
    }
    @GetMapping
    public List<Category> getAll(){
        List<Category> categories = categoryService.getAll();
        categories.forEach(System.out::println);
        return categories;
    }

    @DeleteMapping("/{categoryId}")
    public void deleteOne(@PathVariable int categoryId){
         categoryService.deleteOne(categoryId);
    }
}
