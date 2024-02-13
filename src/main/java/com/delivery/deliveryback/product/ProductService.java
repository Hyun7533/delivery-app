package com.delivery.deliveryback.product;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
    private final ProductMapper productMapper;
	
    public ProductService(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}



	public List<ProductEntity> searchProduct() {
        return productMapper.searchProduct();
    }

}
