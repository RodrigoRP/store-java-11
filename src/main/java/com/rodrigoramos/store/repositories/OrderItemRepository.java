package com.rodrigoramos.store.repositories;

import com.rodrigoramos.store.entities.OrderItem;
import com.rodrigoramos.store.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
