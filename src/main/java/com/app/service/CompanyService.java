package com.app.service;

import com.app.dto.CompanyDto;
import com.app.dto.CompanyLoginDto;
import com.app.entities.Company;

public interface CompanyService {
	Company addCompany(CompanyDto company);
	
	boolean validCompany(CompanyLoginDto company);
}
