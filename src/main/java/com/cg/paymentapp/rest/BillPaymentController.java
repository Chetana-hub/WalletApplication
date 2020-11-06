package com.cg.paymentapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.service.IBillPaymentService;

@RestController
public class BillPaymentController {

	@Autowired
	private IBillPaymentService billpaymentservice;

//ADD BILL PAYMENT
	// URL :http://localhost:8880/add 
	@PostMapping(value = "/add", consumes = "application/json")
	public String addBill(@RequestBody BillPayment payment) {
		billpaymentservice.addBillPayment(payment);
		return "Bill payment added successfully";
	}
	
//DELETE BILL PAYMENT BY ID
	// URL: hhtp://localhost:8880/deleteById/12
	@DeleteMapping(value="/deleteBillById/{id}")
	public void deleteById(@PathVariable("id") int billId) {
		billpaymentservice.deleteById(billId);
	}
	
//VIEW ALL BILL PAYMENTS
	// URL: hhtp://localhost:8880/list
	@GetMapping(value = "/list", produces = "application/json")
	public List<BillPayment> viewAllBillPayments() {
		return billpaymentservice.viewBillPayment();
	}
}
