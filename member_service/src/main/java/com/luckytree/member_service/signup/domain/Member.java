package com.luckytree.member_service.signup.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "member")
public class Member {

    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;

    public Member(String id, String password, String name, String email, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
