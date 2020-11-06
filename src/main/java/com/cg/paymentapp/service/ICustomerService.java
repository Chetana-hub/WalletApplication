package com.cg.paymentapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.beans.Customer;

public interface ICustomerService {
	 public Customer createAccount(Customer customer);
	  public Optional<Customer> showCustomer (String mobileno); 
	  public void deleteCustomerByMobileNo(String mobileNo);
	  public List<Customer> viewCustomers();
}
