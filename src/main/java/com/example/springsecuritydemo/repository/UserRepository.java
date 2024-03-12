package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Teacher,Long> {
    Teacher findByUsername(String username);
}
