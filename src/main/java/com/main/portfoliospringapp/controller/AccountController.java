package com.main.portfoliospringapp.controller;

import com.main.portfoliospringapp.model.Account;
import com.main.portfoliospringapp.model.Greeting;
import com.main.portfoliospringapp.repository.AccountRepository;
import com.main.portfoliospringapp.ressource.RegisterAccountResource;
import com.main.portfoliospringapp.validator.AccountValidator;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    private final AccountRepository accountRepo;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepo = accountRepository;
    }

    @GetMapping("/account")
    public Account getGreeting(@RequestParam(value = "username") String username) {
        return accountRepo.findByUsername(username);
    }

    @PostMapping("/register/account")
    public Account createAccount(@RequestBody RegisterAccountResource accountResource) {
        Account account = accountResource.toModel();
        AccountValidator.validateAccountRegistration(account);
        accountRepo.save(account);
        return account;
    }
}
