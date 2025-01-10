package com.group4.swp.project.controller.exception;

/**
 *
 * @author ACER
 */
public class AccountEmailExistsException extends AccountException {

    public AccountEmailExistsException() {
    }

    public AccountEmailExistsException(String message) {
        super(message);
    }
    
}
