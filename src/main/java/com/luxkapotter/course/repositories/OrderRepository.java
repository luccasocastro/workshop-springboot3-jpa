package com.luxkapotter.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
