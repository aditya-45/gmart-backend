package com.app.service;

import java.util.List;

import com.app.entities.Category;
import com.app.entities.ProductDetails;

public interface ProductService {
	List<ProductDetails> getAllProductsByCategory(Category category);
}
