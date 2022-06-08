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
    public Product saveProduct(@RequestBody Product product) {
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }
}
