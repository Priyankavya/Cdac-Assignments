package com.demo.SpringbootRestWebservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringbootRestWebservice.beans.Product;
import com.demo.SpringbootRestWebservice.dao.ProductDao;
import com.demo.SpringbootRestWebservice.dto.ProductDto;
import com.demo.SpringbootRestWebservice.mapper.ProductDtoMapper;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
ProductDao pdao;
	@Override
	public List<ProductDto> getAllProducts() {
		List<Product> plist=pdao.findAll();
		List<ProductDto> plist1 =plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
		
	}
	@Override
	public ProductDto getById(int pid) {
		Optional<Product> p=pdao.findById(pid);
		if(p.isPresent())
		{
			ProductDto prod=ProductDtoMapper.mapToProductDto(p.get());
			return prod;
		}
		return null;
		
	}
	@Override
	public boolean addproduct(ProductDto p) {
		Product prod=ProductDtoMapper.mapToProduct(p);
		Product p1=pdao.save(prod);
		return p1!=null;
	}
	
	@Override
	public boolean updateproduct(ProductDto p) {
		Product prod=ProductDtoMapper.mapToProduct(p);
		Optional<Product> op=pdao.findById(prod.getPid());
		if(op.isPresent()) {
			Product p2=op.get();
			p2.setPname(p.getPname());
			p2.setQty(p.getQty());
			p2.setPrice(p.getPrice());
			pdao.save(p2);
			return true;
		}
		return false;
	}
	@Override
	public boolean deletebyId(int pid) {
		Optional<Product> op=pdao.findById(pid);
		if(op.isPresent()) {
			pdao.delete(op.get());
			return true;
		}
		return false;
	}

}
