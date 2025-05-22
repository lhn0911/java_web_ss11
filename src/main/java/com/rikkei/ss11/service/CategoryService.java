package com.rikkei.ss11.service;

import com.rikkei.ss11.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(Category category);
    boolean existsByCategoryName(String name);
}
