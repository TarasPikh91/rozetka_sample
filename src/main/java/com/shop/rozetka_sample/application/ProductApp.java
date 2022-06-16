package com.shop.rozetka_sample.application;

import com.shop.rozetka_sample.dto.ProductDto;
import com.shop.rozetka_sample.entity.Product;
import com.shop.rozetka_sample.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ProductApp {

    private final ProductRepository productRepository;

    public ProductApp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(final ProductDto productDto) {
        productRepository.save(new Product(productDto));
    }

    public void updateProduct(final ProductDto productDto) {
        productRepository.save(new Product(productDto));
    }

    public void deleteById(final UUID productId) {
        productRepository.deleteById(productId);
    }

    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(Product::toProductDto).collect(Collectors.toList());
    }
}
