package com.luckytree.member_service.signup.adapter.in;

import com.luckytree.member_service.signup.application.port.in.SignUpRequest;
import com.luckytree.member_service.signup.application.port.in.SignUpResult;
import com.luckytree.member_service.signup.application.port.in.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SignUpController {
    private final SignUpUseCase signUpUseCase;

    @PostMapping("/signup")
    public SignUpResult signUp(@RequestBody SignUpRequest request) {
        return signUpUseCase.signUp(request);
    }
}