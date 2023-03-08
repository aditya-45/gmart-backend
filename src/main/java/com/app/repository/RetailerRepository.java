package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Retailer;

public interface RetailerRepository extends JpaRepository<Retailer, Long> {
	
	boolean existsByUsername(String username);
	
	boolean existsByUsernameAndPassword(String username, String password);
}
