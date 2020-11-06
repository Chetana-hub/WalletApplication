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

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.service.WalletService;

@RestController
public class WalletController {
	@Autowired
	private WalletService service;
	
	@PostMapping(value = "/addwallet")
	public String addWallet(@RequestBody Wallet wallet) {
		service.addWallet(wallet);
		return "added successfully";
	}
	
	@GetMapping(value = "/listwallet")
	public List<Wallet> viewAllWallet() {
		return service.findAllWallet();
	}
	
	@DeleteMapping(value = "/removewallet/{walletid}")
	public String removeWallet(@PathVariable("walletid") int walletid) {
		service.removeWallet(walletid);
		return "removed successfully";
	}
	
	@GetMapping(value = "/listwallet/{id}")
	public Optional<Wallet> viewWallet(@PathVariable("id") int walletid) {
		return service.findWallet(walletid);
	}

	
}
