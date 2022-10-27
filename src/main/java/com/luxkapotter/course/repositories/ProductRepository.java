package com.luxkapotter.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
