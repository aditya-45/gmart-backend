package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.RetailerAlreadyPresent;
import com.app.dto.RetailerDto;
import com.app.dto.RetailerLoginDto;
import com.app.entities.Retailer;
import com.app.repository.RetailerRepository;

@Service
@Transactional
public class RetailerServiceImpl implements RetailerService{
	
	@Autowired
	private RetailerRepository retailerRepo;
	
	@Override
	public Retailer addRetailer(RetailerDto retailer) {
		
		System.out.println("in retailer service method add retailer");
		Retailer user = new Retailer();
		user.setFullName(retailer.getFullName());
		user.setUsername(retailer.getUsername());
		user.setPassword(retailer.getPassword());
		user.setContactNumber(retailer.getContactNumber());
		user.setAlternateMobNumber(retailer.getAlternateMobNumber());
		user.setEmail(retailer.getEmail());
		user.setAddress(retailer.getAddress());
		System.out.println("in retailer service method add retailer 2");
		if(retailerRepo.existsByUsername(user.getUsername())) {
			throw new RetailerAlreadyPresent("Retailer Already Present!!!");
		}
		System.out.println("in retailer service method add retailer 3");
		return retailerRepo.save(user);
	}

	@Override
	public boolean validRetailer(RetailerLoginDto retailer) {
		if(retailerRepo.existsByUsernameAndPassword(retailer.getUsername(), retailer.getPassword())) {
			return true;
		}
		return false;
	}
}
