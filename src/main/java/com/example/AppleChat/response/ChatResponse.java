package com.example.AppleChat.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponse {
    private Long id;
    private Long roomId;
    private Long sendId;
    private String context;
    private LocalDateTime time;
    private boolean check;
}
