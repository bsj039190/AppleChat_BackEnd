package com.example.AppleChat.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatDto {
    private Long id;
    private Long roomId;
    private Long sendId;
    private String context;
    private LocalDateTime time;
    private boolean check;
}
