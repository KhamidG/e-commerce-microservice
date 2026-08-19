package com.gaipov.ecommerce.product.domain.exception;

public class ProductAlreadyExists extends RuntimeException {
    public ProductAlreadyExists(String message) {
        super(message);
    }
}
