package com.novus.exception;

public class ApplicationErrorException extends Exception{
    public ApplicationErrorException(String message) {
        super("APPLICATION ERROR: " + message);
    }
}
