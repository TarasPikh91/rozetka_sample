package com.shop.rozetka_sample.controller;

import com.shop.rozetka_sample.application.CategoryApp;
import com.shop.rozetka_sample.dto.CategoryDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class CategoryController {


    private final CategoryApp categoryApp;

    public CategoryController(CategoryApp categoryApp) {
        this.categoryApp = categoryApp;
    }

    @GetMapping("/add_category")
    public String addCategory(Model model) {
        model.addAttribute("category", new CategoryDto());
        return "/createCategory";
    }

    @PostMapping("/save_category")
    public String saveCategory(@ModelAttribute CategoryDto categoryDto) {
        categoryDto.setId(UUID.randomUUID());
        categoryApp.saveCategory(categoryDto);
        return "/main";
    }

    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("categories", categoryApp.getCategories());
        return "/categories";
    }
}
