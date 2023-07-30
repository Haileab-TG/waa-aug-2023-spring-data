package org.haileab.waaaug2023springdata.service;

import org.haileab.waaaug2023springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    Category findById(int catID);

    List<Category> getAll();

    void deleteOne(int categoryId);
}
