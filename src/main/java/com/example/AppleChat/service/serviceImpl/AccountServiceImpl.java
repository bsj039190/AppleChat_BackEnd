package com.example.AppleChat.service.serviceImpl;

import com.example.AppleChat.dto.AccountDto;
import com.example.AppleChat.repository.AccountRepository;
import com.example.AppleChat.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

//    패스워드 인코더는 아직 안넣음 나중에 시큐리티 할 때 넣어야함
//    @Autowired
//    private PassWordEncoder passWordEncoder;


    @Override
    public List<AccountDto> getAccountList(Pageable pageable) {
        return  null;
    }

    @Override
    public AccountDto getAccount(Long id) {
        return null;
    }

    @Override
    public void createAccount(AccountDto accountDto){

    }

    @Override
    public void updateAccount(Long id, AccountDto accountDto) {

    }

    @Override
    public void deleteAccount(Long id) {

    }

}
