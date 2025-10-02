package com.example.demo.SpringPractice_Two;


import org.springframework.data.jpa.repository.JpaRepository;

interface InterfaceRepository extends JpaRepository<ModelClass, Long> {

}
