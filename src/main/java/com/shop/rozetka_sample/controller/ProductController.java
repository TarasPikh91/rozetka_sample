package com.shop.rozetka_sample.controller;

import com.shop.rozetka_sample.entity.Product;
import com.shop.rozetka_sample.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Controller
public class ProductController {


    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/save_product")
    public String saveProduct(@RequestBody Product product) {
        product.setId(UUID.randomUUID());
        productRepository.save(product);
        return "/main";
    }

    @PostMapping("/update_product")
    public String updateProduct(@RequestBody Product product) {
        productRepository.save(product);
        return "/main";
    }
}
