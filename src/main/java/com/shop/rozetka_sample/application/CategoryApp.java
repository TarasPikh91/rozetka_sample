package com.shop.rozetka_sample.application;

import com.shop.rozetka_sample.dto.CategoryDto;
import com.shop.rozetka_sample.entity.Category;
import com.shop.rozetka_sample.repository.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryApp {

    private final CategoryRepository categoryRepository;

    public CategoryApp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void saveCategory(final CategoryDto categoryDto) {
        categoryRepository.save(new Category(categoryDto));
    }

    public void updateCategory(final CategoryDto categoryDto) {
        categoryRepository.save(new Category(categoryDto));
    }

    public List<CategoryDto> getCategories() {
        return categoryRepository.findAll().stream().map(Category::toCategoryDto).collect(Collectors.toList());
    }
}
