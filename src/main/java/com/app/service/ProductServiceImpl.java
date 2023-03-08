package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Category;
import com.app.entities.ProductDetails;
import com.app.repository.ProductDetailsRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDetailsRepository productRepo;
	
	@Override
	public List<ProductDetails>getAllProductsByCategory(Category category) {
		
		return productRepo.findAllByCategory(category);
	}

}
