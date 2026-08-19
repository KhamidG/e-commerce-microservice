package com.gaipov.ecommerce.product.domain.mapper;

import com.gaipov.ecommerce.product.domain.entity.Product;
import com.gaipov.ecommerce.product.domain.request.CreateProductRequest;
import com.gaipov.ecommerce.product.domain.request.UpdateProductRequest;
import com.gaipov.ecommerce.product.domain.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "stockQuantity", target = "stockQuantity")
    @Mapping(source = "categoryId", target = "categoryId")
    CreateProductRequest createRequestToEntity(Product product);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "stockQuantity", target = "stockQuantity")
    @Mapping(source = "categoryId", target = "categoryId")
    @Mapping(source = "active", target = "active")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    Product EntityToResponse(ProductResponse response);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "stockQuantity", target = "stockQuantity")
    @Mapping(source = "categoryId", target = "categoryId")
    @Mapping(source = "active", target = "active")
    UpdateProductRequest updateReqToEntity(Product product);
}
