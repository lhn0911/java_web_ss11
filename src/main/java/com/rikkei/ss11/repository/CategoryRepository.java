package com.rikkei.ss11.repository;

import com.rikkei.ss11.model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    void save(Category category);
    boolean existsByCategoryName(String name);
}
