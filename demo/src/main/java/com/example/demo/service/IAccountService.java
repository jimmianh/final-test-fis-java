package com.example.demo.service;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.entity.Account;

import java.util.List;

public interface IAccountService {
	
	List<Account> getAllAccounts();
	
	ResponseDTO createAccount(Account account);
	
	Account updateAccount(Account account);
	
	void deleteById(Long Id);
	
	Account getAccountById(Long id);
	

}
