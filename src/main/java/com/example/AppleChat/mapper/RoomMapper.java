package com.example.AppleChat.mapper;

import com.example.AppleChat.dto.AccountDto;
import com.example.AppleChat.dto.RoomDto;
import com.example.AppleChat.entity.RoomEntity;
import com.example.AppleChat.request.RoomRequest;
import com.example.AppleChat.response.RoomResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    RoomResponse roomDtoToResponse(RoomDto roomDto);

    RoomDto roomEntityToDto(RoomEntity roomEntity);

    @Mapping(target = "id", ignore = true)
    RoomDto roomRequestToDto(RoomRequest roomRequest);

    RoomEntity roomDtoToEntity(RoomDto roomDto);
}
