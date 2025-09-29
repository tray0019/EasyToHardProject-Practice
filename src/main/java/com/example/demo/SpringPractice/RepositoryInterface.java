package com.example.demo.SpringPractice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryInterface extends JpaRepository<ModelClass, Long> {
    List<ModelClass> findByNameContainingIgnoreCase(String q);
}
