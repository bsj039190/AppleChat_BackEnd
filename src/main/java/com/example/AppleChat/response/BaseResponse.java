package com.example.AppleChat.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BaseResponse {
    private Integer code;
    private String msg;

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
