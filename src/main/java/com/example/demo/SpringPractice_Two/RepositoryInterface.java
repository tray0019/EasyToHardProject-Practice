package com.example.demo.SpringPractice_Two;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RepositoryInterface extends JpaRepository<ModelClass,Long>{
}