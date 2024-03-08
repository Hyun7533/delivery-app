package com.delivery.delivery.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductMapper extends JpaRepository<ProductEntity, Long> {

}
