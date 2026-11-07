package com.springboot.exceptionhandling.GlobalException;

public class Duplicate extends RuntimeException {
    public Duplicate(String message) {
        super(message);
    }
}
