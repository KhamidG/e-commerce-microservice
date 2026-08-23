package com.gaipov.ecommerce.product.service.impl;

import com.gaipov.ecommerce.product.domain.entity.Product;
import com.gaipov.ecommerce.product.domain.exception.ProductAlreadyExists;
import com.gaipov.ecommerce.product.domain.exception.ProductionNotFound;
import com.gaipov.ecommerce.product.domain.mapper.ProductMapper;
import com.gaipov.ecommerce.product.domain.repository.ProductRepository;
import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.domain.request.UpdateProductRequest;
import com.gaipov.ecommerce.product.domain.response.ProductResponse;
import com.gaipov.ecommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public CreateProductRequest create(CreateProductRequest request) {
        if (productRepository.existsByName(request.getName())) {
            throw new ProductAlreadyExists("Product already exists");
        }

        Product product = new Product();

        product.setName(request.getName().toLowerCase(Locale.ROOT));
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setStockQuantity(request.getStockQuantity());
        product.setCategory(request.getCategory());
        product.setActive(request.getActive());

        productRepository.save(product);
        request.setId(product.getId());

        return request;
    }

    @Override
    public ProductResponse getById(UUID id, Product product) {
        product = productRepository.findById(id)
                .orElseThrow(() -> new ProductionNotFound("Product with this ID is not found!"));

        ProductResponse response = ProductResponse.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .active(product.getActive())
                .createdAt(product.getCreatedAt())
                .build();

        return response;
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
