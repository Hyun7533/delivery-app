package com.delivery.delivery.product;

import lombok.Data;

import java.util.Date;

@Data
public class ProductEntity {

    private Integer productSeq;

    private String productName;

    private Integer productPrice;

    private Date insertTime;

    public ProductEntity(Integer productSeq, String productName, Integer productPrice, Date insertTime) {
        this.productSeq = productSeq;
        this.productName = productName;
        this.productPrice = productPrice;
        this.insertTime = insertTime;
    }
}
