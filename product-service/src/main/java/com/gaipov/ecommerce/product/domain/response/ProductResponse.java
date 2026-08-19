package com.gaipov.ecommerce.product.domain.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
public class ProductResponse {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private UUID categoryId;
    private Boolean active;
    private Instant createdAt;
    private Instant updatedAt;
}
