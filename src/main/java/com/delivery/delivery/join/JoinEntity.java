package com.delivery.delivery.join;


import lombok.*;

@Getter
public class JoinEntity {

    private int seq;
    private final String id;
    private final String pw;
    private final String email;
    private final String address;

    public JoinEntity(String id, String pw, String email, String address) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.address = address;
    }

}
