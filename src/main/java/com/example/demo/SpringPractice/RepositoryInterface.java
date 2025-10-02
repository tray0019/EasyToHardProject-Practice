package com.example.demo.SpringPractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryInterface extends JpaRepository<ModelClass,Long>{

}
