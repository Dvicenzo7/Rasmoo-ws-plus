package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.UserDto;
import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.model.User;
import com.client.ws.rasmooplus.model.UserType;

public class UserMapper {

    public static User fromDtoToEntity(UserDto dto, UserType userType, SubcriptionType subcriptionType){
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setCpf(dto.getCpf());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setDtSubscription(dto.getDtSubscription());
        user.setDtExpiration(dto.getDtExpiration());
        user.setUserType(userType);
        user.setSubcriptionType(subcriptionType);
        return user;
    }
}
