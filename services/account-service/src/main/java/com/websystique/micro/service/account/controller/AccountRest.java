package com.websystique.micro.service.account.controller;

import com.websystique.micro.service.account.domain.Account;
import com.websystique.micro.service.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountRest {

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "/ping")
    public String ping() {
        return "Ping";
    }

    @GetMapping(path = "find/all")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping(path = "get/{id}")
    public Account get(@PathVariable("id") String id) {
        return this.accountService.get(id);
    }

    @DeleteMapping(path = "remove/{id}")
    public void remove(@PathVariable("id") String id) {
        this.accountService.delete(id);
    }

    @PutMapping(path = "save")
    public void save(@RequestBody Account account) {
        this.accountService.save(account);
    }

}
