package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping(value ="/list")
    @ResponseBody
    public  List<Account>  getAllAccount() {
        List<Account> list = accountService.getAllAccounts();
        return list ;
    }

    @PostMapping(value ="/create")
    @ResponseBody
    public ResponseEntity<?> add(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.createAccount(account));
    }

}
