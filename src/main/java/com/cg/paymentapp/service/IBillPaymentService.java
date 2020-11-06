package com.cg.paymentapp.service;

import java.util.List;

import com.cg.paymentapp.beans.BillPayment;

public interface IBillPaymentService {

	public BillPayment addBillPayment(BillPayment payment);
	public List<BillPayment> viewBillPayment();
	public void deleteById(int billId);
}
