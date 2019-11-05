package com.websystique.micro.service.account.service;

import com.websystique.micro.service.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import java.util.List;

@Repository
public interface AccountService extends CrudRepository<Account, Long> {

}
