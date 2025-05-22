package com.rikkei.ss11.controller;

import com.rikkei.ss11.model.Category;
import com.rikkei.ss11.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class Bai8Controller {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showCategoryList(Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("categories", categoryList);
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("category", new Category());
        return "add";
    }

        @PostMapping("/add")
    public String addCategory(@Valid @ModelAttribute("category") Category category,
                              BindingResult result,
                              Model model) {
        if (categoryService.existsByCategoryName(category.getCategoryName())) {
            result.rejectValue("categoryName", "error.category", "Tên danh mục đã tồn tại");
        }

        if (result.hasErrors()) {
            return "add";
        }

        categoryService.save(category);
        return "redirect:/categories";
    }
}
