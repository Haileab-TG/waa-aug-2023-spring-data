package org.haileab.waaaug2023springdata.repository;

import org.haileab.waaaug2023springdata.entity.Category;
import org.haileab.waaaug2023springdata.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
