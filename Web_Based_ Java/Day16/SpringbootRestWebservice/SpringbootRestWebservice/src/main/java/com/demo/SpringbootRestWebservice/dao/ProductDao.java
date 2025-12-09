package com.demo.SpringbootRestWebservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringbootRestWebservice.beans.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

	

}
