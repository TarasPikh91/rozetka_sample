package com.shop.rozetka_sample.entity;

import com.shop.rozetka_sample.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("category")
public class Category {

    @PrimaryKey
    private UUID id;
    private String name;

    public Category(final CategoryDto categoryDto) {
        this.id = categoryDto.getId();
        this.name = categoryDto.getName();
    }

    public CategoryDto toCategoryDto() {
        return new CategoryDto(this.id, this.name);
    }

}
