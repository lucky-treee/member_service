package com.luckytree.member_service.signup.application.port.out;

import com.luckytree.member_service.signup.domain.Member;

public interface RecordSignUpPort {

    void recordSignUpPort(SignUpRecord signUpRecord);
}