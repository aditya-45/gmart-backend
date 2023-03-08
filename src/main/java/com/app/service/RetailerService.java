package com.app.service;

import com.app.dto.RetailerDto;
import com.app.dto.RetailerLoginDto;
import com.app.entities.Retailer;

public interface RetailerService {
	Retailer addRetailer(RetailerDto retailer);
	
	boolean validRetailer(RetailerLoginDto retailer);
}
