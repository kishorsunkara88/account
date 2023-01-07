package com.example.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.entity.Account;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	@GetMapping("/details")
 public Account getAccounts() {
	 return new Account("12345","kishor","sunkara","098");
 }
}
