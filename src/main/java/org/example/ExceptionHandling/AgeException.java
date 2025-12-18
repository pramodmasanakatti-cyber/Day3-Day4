package org.example.ExceptionHandling;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
