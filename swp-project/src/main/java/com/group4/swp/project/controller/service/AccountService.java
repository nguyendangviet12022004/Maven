package com.group4.swp.project.controller.service;

import com.group4.swp.project.entity.Account;

public interface AccountService {
    void signUp(Account account);
    void signIn(Account account);
}
