package com.gaipov.ecommerce.product.service.impl;

import com.gaipov.ecommerce.product.domain.mapper.ProductMapper;
import com.gaipov.ecommerce.product.domain.repository.ProductRepository;
import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.domain.request.UpdateProductRequest;
import com.gaipov.ecommerce.product.domain.response.ProductResponse;
import com.gaipov.ecommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public ProductResponse create(CreateProductRequest request) {
        return null;
    }

    @Override
    public ProductResponse getById(UUID id) {
        return null;
    }

    @Override
    public List<ProductResponse> getAll() {
        return List.of();
    }

    @Override
    public ProductResponse update(UpdateProductRequest request) {
        return null;
    }

    @Override
    public String delete(UUID id) {
        return "";
    }

    @Override
    public ProductResponse restore(UUID id) {
        return null;
    }
}
