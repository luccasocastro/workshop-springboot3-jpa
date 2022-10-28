package com.luxkapotter.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
