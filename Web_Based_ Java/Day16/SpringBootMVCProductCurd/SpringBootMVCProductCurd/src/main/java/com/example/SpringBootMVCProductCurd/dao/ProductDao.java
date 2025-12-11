package com.example.SpringBootMVCProductCurd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootMVCProductCurd.beans.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
