package com.gaipov.ecommerce.product.service;

import com.gaipov.ecommerce.product.domain.entity.Product;
import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.domain.request.UpdateProductRequest;
import com.gaipov.ecommerce.product.domain.response.ProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    CreateProductRequest create(CreateProductRequest request);

    ProductResponse getById(UUID id, Product product);

    List<ProductResponse> getAll();

    ProductResponse update(UpdateProductRequest request);

    String delete(UUID id);

    ProductResponse restore(UUID id);
}
