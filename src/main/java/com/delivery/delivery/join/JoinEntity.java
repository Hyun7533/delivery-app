package com.delivery.delivery.join;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor // 모든 args 생성자
@NoArgsConstructor // 기본 생성자 추가
public class JoinEntity {

    @Id
    private int seq;

    @Column
    private String id;

    @Column
    private String pw;

    @Column
    private String email;

    @Column
    private String address;


}
