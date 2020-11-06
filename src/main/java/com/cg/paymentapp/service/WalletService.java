package com.cg.paymentapp.service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Wallet;


public interface WalletService {
	public Optional<Wallet> findWallet(int walletid);
public Wallet addWallet(Wallet wallet);
public void removeWallet(int walletid);
public List<Wallet> findAllWallet();

  
}
