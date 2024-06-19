package com.example.AppleChat.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "TB_CHAT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "room_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private RoomEntity roomId;

    @JoinColumn(name = "account_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AccountEntity sendId;

    @Column(nullable = false)
    private String context;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false)
    private boolean check; //상대가 읽었는지 여부

    //TODO: 사진기능 추가할까? 말까?
}
