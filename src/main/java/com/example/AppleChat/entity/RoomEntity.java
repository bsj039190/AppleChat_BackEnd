package com.example.AppleChat.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "TB_ROOM")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "first_account_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AccountEntity first;

    @JoinColumn(name = "second_account_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AccountEntity second;

    @Column(nullable = false, length = 100)
    private String name;

    //dz

}
