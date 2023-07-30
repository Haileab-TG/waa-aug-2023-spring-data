package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepo categoryRepo;
    @Autowired
    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category findById(int catID) {
        return categoryRepo.findById(catID).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void deleteOne(int categoryId) {
         categoryRepo.deleteById(categoryId);
    }
}
