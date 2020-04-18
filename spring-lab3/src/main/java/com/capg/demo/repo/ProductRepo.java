package com.capg.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
