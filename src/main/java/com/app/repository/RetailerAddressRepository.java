package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.RAddress;

public interface RetailerAddressRepository extends JpaRepository<RAddress, Long> {

}
