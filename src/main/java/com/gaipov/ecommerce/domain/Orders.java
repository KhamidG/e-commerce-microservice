package com.gaipov.ecommerce.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Orders {
    @Id
    private UUID id;

    @Column(name = "customer_id")
    private UUID customerId;

    @Column
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column
    private String currency;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
