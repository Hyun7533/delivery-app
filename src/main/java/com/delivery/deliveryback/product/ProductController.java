package com.delivery.deliveryback.product;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
    	this.productService = productService;
    }
    
    @GetMapping("/product")
    public List<ProductEntity> searchProduct() {
        return productService.searchProduct();
    }


}
