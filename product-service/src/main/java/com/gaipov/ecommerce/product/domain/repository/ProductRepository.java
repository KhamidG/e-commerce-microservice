package com.gaipov.ecommerce.product.domain.repository;

import com.gaipov.ecommerce.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Optional<Product> findByName(String name);

    Boolean existsByName(String name);

    boolean existByStatus(Boolean status);

    boolean existByActive(Boolean active);
}
