package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	boolean save(Product prod);

	Product findById(int pid);


	boolean modifyProduct(Product p);

	boolean removeById(int pid);
}
