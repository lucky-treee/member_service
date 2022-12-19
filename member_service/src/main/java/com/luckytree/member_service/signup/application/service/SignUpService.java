package com.luckytree.member_service.signup.application.service;

import com.luckytree.member_service.signup.application.port.in.SignUpRequest;
import com.luckytree.member_service.signup.application.port.in.SignUpResult;
import com.luckytree.member_service.signup.application.port.in.SignUpUseCase;
import com.luckytree.member_service.signup.application.port.out.RecordSignUpPort;
import com.luckytree.member_service.signup.application.port.out.SignUpRecord;
import com.luckytree.member_service.signup.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SignUpService implements SignUpUseCase {

    private final RecordSignUpPort recordSignUpPort;

    @Transactional
    @Override
    public SignUpResult signUp(SignUpRequest request) {
        Member member = new Member(request.getId(), request.getPassword(), request.getName(), request.getEmail(), request.getPhone());
        recordSignUpPort.recordSignUpPort(new SignUpRecord(member.getId(), member.getPassword(), member.getName(), member.getEmail(), member.getPhone()));
        return new SignUpResult(request.getId(), request.getPassword(), request.getName(), request.getEmail(), request.getPhone());
    }
}