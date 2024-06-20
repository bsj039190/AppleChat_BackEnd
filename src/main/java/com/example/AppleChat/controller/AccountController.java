package com.example.AppleChat.controller;

import com.example.AppleChat.response.BaseResponse;
import com.example.AppleChat.response.ContentsResponse;
import com.example.AppleChat.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/aaa")
    public ResponseEntity<BaseResponse> test() {
        String Um = "엄준식은 살아있다!";
        ContentsResponse<String> response = new ContentsResponse<>(HttpStatus.OK.value(), "success",
                Um);

        log.warn("Um jun sik");

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
