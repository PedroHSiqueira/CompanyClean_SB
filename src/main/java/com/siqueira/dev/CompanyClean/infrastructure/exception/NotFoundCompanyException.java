package com.siqueira.dev.CompanyClean.infrastructure.exception;

public class NotFoundCompanyException extends RuntimeException {
    public NotFoundCompanyException(String message) {
        super(message);
    }
}
