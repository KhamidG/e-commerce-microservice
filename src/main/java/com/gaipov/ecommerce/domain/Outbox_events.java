package com.gaipov.ecommerce.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Outbox_events {
    @Id
    private UUID id;

    @Column(name = "aggregate_type")
    private String aggregateType;

    @Column(name = "aggregate_id")
    private UUID aggregateId;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "payload", columnDefinition = "jsonb", nullable = false)
    private JsonType payload;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "published", nullable = true)
    private Boolean published = false;

    @Column(name = "published_at", nullable = true)
    private LocalDateTime publishedAt;
}