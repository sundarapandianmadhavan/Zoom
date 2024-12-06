package com.teleapps.zoomcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teleapps.zoomcustomer.exception.CustomerCreationException;
import com.teleapps.zoomcustomer.exception.ResourceNotFoundException;
import com.teleapps.zoomcustomer.model.ResponseMessage;
import com.teleapps.zoomcustomer.model.ZoomCustomer;
import com.teleapps.zoomcustomer.repository.ZoomCustomerRepositiory;


@RestController
@RequestMapping("/ZoomCustomer")
public class ZoomCustomerController {

	@Autowired
	ZoomCustomerRepositiory zoomCustomerRepositiory;
	
	@GetMapping("/getByMobileNumber/{mobilenumber}")
	public ResponseEntity<ResponseMessage<ZoomCustomer>> getCustomerByMobileNumberIN(@PathVariable String mobilenumber) {

		System.out.println("Customer MobileNumber : "+mobilenumber);
		
		  if (mobilenumber == null || mobilenumber.trim().isEmpty()) {
		        throw new IllegalArgumentException("Mobile number must not be null or empty");
		    }
		  	ZoomCustomer customer = zoomCustomerRepositiory.findByPhoneNumber(mobilenumber);
		
		if (customer!=null) {

			ResponseMessage<ZoomCustomer> response = new ResponseMessage<>(100, "Customer details fetched successfully",
					customer);

			return new ResponseEntity<>(response, HttpStatus.OK);

		} else {
			throw new ResourceNotFoundException("No Customer found with MobileNumber: " + mobilenumber);
		}
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<ResponseMessage<ZoomCustomer>> createCustomer(@RequestBody ZoomCustomer zoomcustomer) {
		
		
		ZoomCustomer savedCustomer = zoomCustomerRepositiory.save(zoomcustomer);
		
		if (savedCustomer != null) {
			ResponseMessage<ZoomCustomer> response = new ResponseMessage<>(100, "Customer details created successfully",
					savedCustomer);
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}
		else {
			throw new CustomerCreationException("Customer creation failed");
		}
	}
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<ResponseMessage<List<ZoomCustomer>>> getAllCustomers() {

	 List<ZoomCustomer> allCustomers = zoomCustomerRepositiory.findAll();
	    	   
	    ResponseMessage<List<ZoomCustomer>> response = new ResponseMessage<>(100,"Customer details fetched successfully",allCustomers);

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
