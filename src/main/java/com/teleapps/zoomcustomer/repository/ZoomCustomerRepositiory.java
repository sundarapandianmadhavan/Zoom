package com.teleapps.zoomcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teleapps.zoomcustomer.model.ZoomCustomer;


public interface ZoomCustomerRepositiory extends JpaRepository<ZoomCustomer, Long>{
	
	ZoomCustomer findByPhoneNumber(String phonenumber);

}
