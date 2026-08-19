package com.gaipov.ecommerce.product.domain.exception;

public class ProductDeleted extends RuntimeException {
    public ProductDeleted(String message) {
        super(message);
    }
}
