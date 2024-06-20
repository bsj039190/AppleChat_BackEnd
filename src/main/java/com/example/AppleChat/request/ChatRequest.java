package com.example.AppleChat.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatRequest {
    private Long roomId;
    private Long sendId;
    private String context;
    private LocalDateTime time;
    private boolean check;
}
