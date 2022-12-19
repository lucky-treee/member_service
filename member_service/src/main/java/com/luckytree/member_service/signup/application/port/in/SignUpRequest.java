package com.luckytree.member_service.signup.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignUpRequest {

    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
}
