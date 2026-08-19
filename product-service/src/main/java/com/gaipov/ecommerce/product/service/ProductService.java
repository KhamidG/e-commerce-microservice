package com.gaipov.ecommerce.product.service;

import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.domain.request.UpdateProductRequest;
import com.gaipov.ecommerce.product.domain.response.ProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    ProductResponse create(CreateProductRequest request);

    ProductResponse getById(UUID id);

    List<ProductResponse> getAll();

    ProductResponse update(UpdateProductRequest request);

    String delete(UUID id);

    ProductResponse restore(UUID id);
}
