package com.luxkapotter.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
