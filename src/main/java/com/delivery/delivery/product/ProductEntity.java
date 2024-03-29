package com.delivery.delivery.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@AllArgsConstructor // 모든 args 생성자
@NoArgsConstructor // 기본 생성자 추가
@Table(name = "ITEM")
public class ProductEntity {

    @Id @Generated
    private Integer productSeq;

    private String productName;

    private Integer productPrice;

    private Date insertTime;
}
