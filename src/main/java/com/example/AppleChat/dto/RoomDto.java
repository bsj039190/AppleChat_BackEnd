package com.example.AppleChat.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private Long id;
    private Long first;
    private Long second;
    private String name;
}
