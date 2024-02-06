package com.delivery.deliveryback.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
public class ProductEntity {

    private long id;

    private String name;

    private int age;

    private String address;

    private int salary;

    public ProductEntity(long id, String name, int age, String address, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

}
