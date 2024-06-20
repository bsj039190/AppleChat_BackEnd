package com.example.AppleChat.mapper;

import com.example.AppleChat.dto.AccountDto;
import com.example.AppleChat.entity.AccountEntity;
import com.example.AppleChat.request.AccountRequest;
import com.example.AppleChat.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountResponse accountDtoToResponse(AccountDto accountDto);

    AccountDto accountEntityToDto(AccountEntity accountEntity);

    @Mapping(target = "id", ignore = true)
    AccountDto accountRequestToDto(AccountRequest accountRequest);

    AccountEntity accountDtoToEntity(AccountDto accountDto);
}
