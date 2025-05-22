package com.rikkei.ss11.service;

import com.rikkei.ss11.model.Category;
import com.rikkei.ss11.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
@Autowired
private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public boolean existsByCategoryName(String name) {
        return categoryRepository.existsByCategoryName(name);
    }
}
