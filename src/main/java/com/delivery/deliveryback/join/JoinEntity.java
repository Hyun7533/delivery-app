package com.delivery.deliveryback.join;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
public class JoinEntity {

    private int seq;
    private String id;
    private String pw;
    private String email;
    private String address;

}
