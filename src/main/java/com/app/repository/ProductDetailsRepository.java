package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {
	
	List<ProductDetails> findAllByCategory(Category category);
}
