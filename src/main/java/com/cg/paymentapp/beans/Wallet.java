package com.cg.paymentapp.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="wallet")
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="walletid")
	private int walletId;
	private BigDecimal balance;
	/*
	 * @OneToOne(mappedBy = "wallet", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.EAGER) private Customer customer;
	 */
	 
	@OneToMany(mappedBy = "wallet", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private List<BillPayment> payment=new ArrayList<BillPayment>();
	public List<BillPayment> getPayment() {
		return payment;
	}

	public void setBacc(List<BillPayment> payment) {
		this.payment = payment;
	}
	
	public Wallet() {
		super();
	}
	
	public Wallet(int walletId, BigDecimal balance, List<BillPayment> payment) {
		super();
		this.walletId = walletId;
		this.balance = balance;
		this.payment = payment;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public Wallet(BigDecimal amount) {
		this.balance = amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return " balance= " + balance;
	}

}
