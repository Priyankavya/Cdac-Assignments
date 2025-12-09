package com.demo.SpringbootRestWebservice.service;

import java.util.List;

import com.demo.SpringbootRestWebservice.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

}
