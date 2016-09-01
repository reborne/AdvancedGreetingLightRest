package com.reborne.light.service;

import com.reborne.light.model.Account;


public interface AccountService {
    Account findByUsername(String username);
}
