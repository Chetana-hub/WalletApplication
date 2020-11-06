package com.cg.paymentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.paymentapp.beans.BillPayment;

import com.cg.paymentapp.exception.InvalidInputException;

import com.cg.paymentapp.repo.IBillPaymentRepository;
@Service
public class BillPaymentService implements IBillPaymentService {
	@Autowired
	private IBillPaymentRepository repo;

	public BillPayment addBillPayment(BillPayment payment){
		return repo.save(payment);
	}

	public List<BillPayment> viewBillPayment() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(int billId) {
		repo.deleteById(billId);
		
	}
	
}
