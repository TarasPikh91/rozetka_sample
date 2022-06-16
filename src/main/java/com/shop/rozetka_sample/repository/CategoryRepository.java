package com.shop.rozetka_sample.repository;

import com.shop.rozetka_sample.entity.Category;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends CassandraRepository<Category, UUID> {
}
