package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.service.ProductService;

@RestController
@CrossOrigin("http://localhost:3000")
public class CategoryController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/category/{name}")
	public ResponseEntity<?> registerCompany(@PathVariable Category name ){
		System.out.println("in category controller get method");
		return ResponseEntity.ok().body(prodService.getAllProductsByCategory(name));
	}
}
