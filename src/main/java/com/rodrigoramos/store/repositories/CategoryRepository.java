package com.rodrigoramos.store.repositories;

import com.rodrigoramos.store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
