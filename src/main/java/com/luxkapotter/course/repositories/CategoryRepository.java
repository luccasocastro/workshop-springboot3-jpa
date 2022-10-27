package com.luxkapotter.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
