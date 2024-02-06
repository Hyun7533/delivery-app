package com.delivery.deliveryback.product;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductEntity> searchProduct();

}
