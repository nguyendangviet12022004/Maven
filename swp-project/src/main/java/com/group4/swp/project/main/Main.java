package com.group4.swp.project.main;
import  org.mindrot.jbcrypt.BCrypt;
import com.group4.swp.project.controller.dao.AccountDAO;
import com.group4.swp.project.entity.Account;


public class Main {
    public static void main(String[] args) {
        String pwd = "abcdef";
        String hashedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
    }
    
}
