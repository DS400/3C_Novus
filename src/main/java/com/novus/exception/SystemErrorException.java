package com.novus.exception;

public class SystemErrorException extends Exception {
    public SystemErrorException(String message) {
        super("SYSTEM ERROR: " + message);
    }
}
