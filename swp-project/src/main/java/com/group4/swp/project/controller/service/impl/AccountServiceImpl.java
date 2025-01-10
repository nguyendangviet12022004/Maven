package com.group4.swp.project.controller.service.impl;

import com.group4.swp.project.controller.dao.AccountDAO;
import com.group4.swp.project.controller.service.AccountService;
import com.group4.swp.project.entity.Account;
import org.mindrot.jbcrypt.BCrypt;

public class AccountServiceImpl implements AccountService {

    private final AccountDAO AccountDAO = new AccountDAO();
    
    private String encodePassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    private Boolean checkPasssword(String password, String encodedPassword){
        return BCrypt.checkpw(password, encodedPassword);
    } 
    
    
    @Override
    public void signUp(Account account) {
        String username = account.getUsername();
        
        String password = account.getPassword();
        String encodedPassword = encodePassword(password);
        account.setPassword(encodedPassword);
        this.AccountDAO.save(account);
    }

    @Override
    public void signIn(Account account) {
    }


    
}
