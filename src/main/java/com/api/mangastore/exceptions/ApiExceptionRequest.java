package com.api.mangastore.exceptions;

public class ApiExceptionRequest extends RuntimeException {
    public ApiExceptionRequest(String message) {
        super(message);
    }
}
