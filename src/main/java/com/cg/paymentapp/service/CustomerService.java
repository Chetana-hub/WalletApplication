package com.cg.paymentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.repo.ICustomerRepo;
@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerRepo repo;
	@Override
	public Customer createAccount(Customer customer) {
		// TODO Auto-generated method stub

		 
		return repo.save(customer);
		
	}
	@Override
	public Optional<Customer> showCustomer(String mobileNo) {
		// TODO Auto-generated method stub
		return repo.findById(mobileNo);
	}
	
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public void deleteCustomerByMobileNo(String mobileNo) {
		repo.deleteById(mobileNo);
	}
}
