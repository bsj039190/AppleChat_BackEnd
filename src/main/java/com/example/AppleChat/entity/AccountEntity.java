package com.example.AppleChat.entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "TB_ACCOUNT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String account; //로그인시 아이디

    @Column(nullable = false, length = 100)
    private String from; //소속

    @Column(nullable = false, length = 100)
    private String pwd;
    
    //북마크에 있는거 보고 erd 아직 안함
}
