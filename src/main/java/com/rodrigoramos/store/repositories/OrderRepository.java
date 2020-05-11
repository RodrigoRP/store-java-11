package com.rodrigoramos.store.repositories;

import com.rodrigoramos.store.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
