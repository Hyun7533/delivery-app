package com.delivery.delivery.product;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

	public ProductEntity save(ProductEntity productEntity) {
        return productMapper.save(productEntity);
    }

}
