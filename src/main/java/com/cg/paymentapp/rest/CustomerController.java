package com.cg.paymentapp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.service.ICustomerService;
@RestController
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	
	@PostMapping(value="/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		
		service.createAccount(customer);
		return "Customer added Successfully";
	}
	
	@DeleteMapping(value="/removeCustomer/{mobileNo}")
	public void deleteCustomerByMobileNo(@PathVariable("mobileNo") String mobileNo) {
		service.deleteCustomerByMobileNo(mobileNo);
	}
	
	@GetMapping(value = "/listAllCustomers", produces = "application/json")
	public List<Customer> viewCustomers() {
		return service.viewCustomers();
		
	}
	@GetMapping(value="/viewCustomerByMobileNo/{mobileNo}")
	public Optional<Customer> viewCustomerByMobileNo(@PathVariable("mobileNo") String mobileNo) {
	return service.showCustomer(mobileNo);	
	}
	
	
}
