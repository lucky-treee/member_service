package com.luckytree.member_service.signup.application.port.in;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SignUpResult {

    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
}
