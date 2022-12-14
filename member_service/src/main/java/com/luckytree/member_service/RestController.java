package com.luckytree.member_service;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * 통신 테스트를 위한 임시 컨트롤러 - 삭제 예정
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/internal-test")
    String call(String name) {
        return "yeah!";
    }
}
