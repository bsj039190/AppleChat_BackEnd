package com.example.AppleChat.mapper;

import com.example.AppleChat.dto.ChatDto;
import com.example.AppleChat.entity.ChatEntity;
import com.example.AppleChat.request.ChatRequest;
import com.example.AppleChat.response.ChatResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChatMapper {
    ChatMapper INSTANCE = Mappers.getMapper(ChatMapper.class);

    ChatResponse chatDtoToResponse(ChatDto chatDto);

    ChatDto chatEntityToDto(ChatEntity chatEntity);

    @Mapping(target = "id", ignore = true)
    ChatDto chatRequestToDto(ChatRequest chatRequest);

    ChatEntity chatDtoToEntity(ChatDto chatDto);
}
