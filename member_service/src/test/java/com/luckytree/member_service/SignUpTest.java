package com.luckytree.member_service;

import com.luckytree.member_service.repository.MemberRepository;
import com.luckytree.member_service.signup.application.port.in.SignUpRequest;
import com.luckytree.member_service.signup.application.port.out.RecordSignUpPort;
import com.luckytree.member_service.signup.application.service.SignUpService;
import com.luckytree.member_service.signup.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;

@ExtendWith(Extension.class)
public class SignUpTest {

    /**
     * 시나리오
     * 1. 유저가 필드 값을 입력한다
     * 2. 입력한 값을 검증한다
     * 3. 오류가 없다면 저장한다
     * 4. 저장이 완료되고 정상 수행되었다는 코드를 리턴한다
     */

    @Test
    @DisplayName("회원가입 테스트")
    void signUp(){

        SignUpService signUpService = new SignUpService();
        //given
        Member member = new Member("test", "test", "test");
        // when
        String memberId = signUpService.join(member.getEmail(), member.getPassword(), member.getNickname());

        // then
        Member findMember = signUpService.findByEmail(memberId).get();
        Assertions.assertThat(member.getEmail()).isEqualTo(findMember.getEmail());

    }
}