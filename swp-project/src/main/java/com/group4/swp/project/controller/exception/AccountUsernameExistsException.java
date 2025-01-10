package com.group4.swp.project.controller.exception;


public class AccountUsernameExistsException extends AccountException {

    public AccountUsernameExistsException() {
    }

    public AccountUsernameExistsException(String message) {
        super(message);
    }
    
}
