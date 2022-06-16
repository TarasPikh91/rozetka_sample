package com.shop.rozetka_sample.entity;

import com.shop.rozetka_sample.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("product")
public class Product {

    @PrimaryKey
    private UUID id;
    private String name;
    private BigDecimal price;
    @Column("image_url")
    private String imageUrl;
    private List<UUID> categories;

    public Product(final ProductDto productDto) {
        this.id = productDto.getId();
        this.name = productDto.getName();
        this.price = productDto.getPrice();
        this.imageUrl = productDto.getImageUrl();
        this.categories = productDto.getCategories();
    }

    public ProductDto toProductDto() {
        return new ProductDto(this.id, this.name, this.price, this.imageUrl, this.categories);
    }
}
