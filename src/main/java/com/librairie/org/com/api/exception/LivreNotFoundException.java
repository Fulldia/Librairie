package com.librairie.org.com.api.exception;

public class LivreNotFoundException extends RuntimeException {
    public LivreNotFoundException(String message) {
        super(message);
    }
}