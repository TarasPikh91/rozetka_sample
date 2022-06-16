package com.shop.rozetka_sample.controller;

import com.shop.rozetka_sample.application.CategoryApp;
import com.shop.rozetka_sample.application.ProductApp;
import com.shop.rozetka_sample.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Controller
public class ProductController {

    private final ProductApp productApp;
    private final CategoryApp categoryApp;

    public ProductController(ProductApp productApp, CategoryApp categoryApp) {
        this.productApp = productApp;
        this.categoryApp = categoryApp;
    }

    @GetMapping("/add_product")
    public String addProduct(Model model) {
        model.addAttribute("product", new ProductDto());
        model.addAttribute("categories", categoryApp.getCategories());
        return "/createProduct";
    }


    @PostMapping("/save_product")
    public String saveProduct(@ModelAttribute ProductDto productDto) {
        productDto.setId(UUID.randomUUID());
        productApp.saveProduct(productDto);
        return "redirect:/";
    }

    @PostMapping("/update_product")
    public String updateProduct(@ModelAttribute ProductDto productDto) {
        productApp.updateProduct(productDto);
        return "/main";
    }

    @DeleteMapping("/delete_product/{id}")
    public String deleteProduct(@PathVariable UUID productId) {
        productApp.deleteById(productId);
        return "/main";
    }
}
