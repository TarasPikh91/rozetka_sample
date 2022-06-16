package com.shop.rozetka_sample.dto;

import com.shop.rozetka_sample.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private UUID id;
    private String name;
    private BigDecimal price;
    private String imageUrl;
    private List<UUID> categories;
}
