package com.springboot.exceptionhandling.GlobalException;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
