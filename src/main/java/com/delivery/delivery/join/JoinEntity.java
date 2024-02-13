package com.delivery.delivery.join;


import lombok.*;

@Getter
@NoArgsConstructor // 기본 생성자 추가
public class JoinEntity {

    private int seq;
    private String id;
    private String pw;
    private String email;
    private String address;

    @Builder
    public JoinEntity(int seq, String id, String pw, String email, String address) {
        this.seq = seq;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.address = address;
    }

}
