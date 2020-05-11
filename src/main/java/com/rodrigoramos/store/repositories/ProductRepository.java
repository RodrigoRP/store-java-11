package com.rodrigoramos.store.repositories;

import com.rodrigoramos.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
