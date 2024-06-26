package com.example.AppleChat.service;

import com.example.AppleChat.dto.AccountDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {
    List<AccountDto> getAccountList(Pageable pageable);
    AccountDto getAccount(Long id);
    void createAccount(AccountDto accountDto);
    void updateAccount(Long id, AccountDto accountDto);
    void deleteAccount(Long id);
}
