package com.cg.paymentapp.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.repo.WalletRepo;

@Service
public class WalletServiceImp implements WalletService {
	@Autowired
	private WalletRepo repo;
	//private Customer customer;
	private Wallet wallet;
	
	public Wallet addWallet(Wallet wallet) {
		return repo.save(wallet);
	}

	public Optional<Wallet> findWallet(int walletid) {
		return repo.findById(walletid);
	}

	public void removeWallet(int walletid) {
		repo.deleteById(walletid);
	}

	@Override
	public List<Wallet> findAllWallet() {
		return repo.findAll();
	}

}
