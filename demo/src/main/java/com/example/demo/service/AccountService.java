package com.example.demo.service;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class AccountService implements IAccountService {

	@Autowired
	private AccountRepository accountRepo;

	@Override
	public List<Account> getAllAccounts() {

		return accountRepo.findAll();
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public ResponseDTO createAccount(Account account) {
		ResponseDTO respo = new ResponseDTO();
		String massage = "số tài khoản đã tồn tại";
		Account account1 = new Account();
		if (account.getAccountNumber().equals(accountRepo.existsByAccountNumber(account1.getAccountNumber()))) {
			respo.setCode("error");
			respo.setMassage(massage);
			return respo;
		} else {

			account1 = accountRepo.save(account);
			respo.setCode("sucssec");
			respo.setMassage("thành công");
			respo.setData(account1);
			return respo;
		}
	}

	@Override
	public Account updateAccount(Account account) {

		return accountRepo.save(account);
	}

	@Override
	public void deleteById(Long Id) {

		accountRepo.deleteById(Id);
	}

	@Override
	public Account getAccountById(Long id) {

		return accountRepo.findById(id).get();
	}

}
