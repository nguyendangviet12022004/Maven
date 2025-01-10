package com.group4.swp.project.controller.exception;

import com.group4.swp.project.main.constant.Message;

public abstract class AccountException extends RuntimeException {

    public AccountException() {
        super(Message.ACCOUNT_EXCEPTION_MESSAGE);
    }

    public AccountException(String message) {
        super(message);
    }
    
}
