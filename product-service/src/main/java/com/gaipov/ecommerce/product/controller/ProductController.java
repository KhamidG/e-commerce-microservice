package com.gaipov.ecommerce.product.controller;

import com.gaipov.ecommerce.product.domain.entity.Product;
import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<CreateProductRequest> create(@RequestBody CreateProductRequest request) {
        return ResponseEntity.ok(productService.create(request));
    }
}
