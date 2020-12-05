package com.quinnox.bankapp.service;

import java.util.List;

import com.quinnox.bankapp.entites.Transactions;

public interface TransactionsService {

	public boolean addTransaction(Transactions transaction);
	
	public List<Transactions> customerCredit(int customerid);
	 
	 public List<Transactions> getTransactionByName(String beneficiaryname);
	 
	 public List<Transactions> getAllTransactions();
}
