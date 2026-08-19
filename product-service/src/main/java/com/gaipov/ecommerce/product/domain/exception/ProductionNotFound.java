package com.gaipov.ecommerce.product.domain.exception;

public class ProductionNotFound extends RuntimeException {
    public ProductionNotFound(String message) {
        super(message);
    }
}
