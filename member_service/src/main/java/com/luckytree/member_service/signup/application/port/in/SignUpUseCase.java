package com.luckytree.member_service.signup.application.port.in;

import com.luckytree.member_service.signup.domain.Member;

public interface SignUpUseCase {

    SignUpResult signUp(SignUpRequest request);
}