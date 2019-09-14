package com.websystique.micro.service.account.service;

import com.websystique.micro.service.account.domain.Account;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class AccountServiceImpl implements AccountService {

    private final List<Account> accounts = new ArrayList<>();

    @PostConstruct
    public void init() {
        Account account = new Account();
        account.setId("1");
        account.setLogin("user1");
        account.setName("john");
        account.setFullName("Mr Devil");
        this.accounts.add(account);
    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public void save(Account account) {
        this.accounts.add(account);
    }

    @Override
    public void delete(String id) {
        accounts.stream().filter(acc -> acc.getId().equals(id)).findFirst().ifPresent(accounts::remove);
    }

    @Override
    public Account get(String id) {
        return accounts.stream().filter(acc -> acc.getId().equals(id)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
