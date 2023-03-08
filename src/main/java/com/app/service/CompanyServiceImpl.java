package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.RetailerAlreadyPresent;
import com.app.dto.CompanyDto;
import com.app.dto.CompanyLoginDto;
import com.app.entities.Company;
import com.app.repository.CompanyRepository;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyRepository companyRepo;
	
	@Override
	public Company addCompany(CompanyDto company) {
		
		System.out.println("in company service method add company");
		Company user = new Company();
		user.setUsername(company.getUsername());
		user.setCompanyName(company.getCompanyName());
		user.setPassword(company.getPassword());
		user.setContactNumber(company.getContactNumber());
		user.setAlternateMobNumber(company.getAlternateMobNumber());
		user.setEmail(company.getEmail());
		user.setAddress(company.getAddress());
		if(companyRepo.existsByUsername(user.getUsername())) {
			throw new RetailerAlreadyPresent("Company Already Present!!!");
		}
		return companyRepo.save(user);
	}

	@Override
	public boolean validCompany(CompanyLoginDto company) {
		if(companyRepo.existsByUsernameAndPassword(company.getUsername(), company.getPassword())) {
			return true;
		}
		return false;
	}
}
