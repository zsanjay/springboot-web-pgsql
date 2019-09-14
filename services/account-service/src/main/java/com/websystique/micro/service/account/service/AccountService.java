package com.websystique.micro.service.account.service;

import com.websystique.micro.service.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void save(Account account);

    void delete(String id);

    Account get(String id);
}
