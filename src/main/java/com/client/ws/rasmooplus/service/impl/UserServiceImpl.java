package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.dto.UserDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.mapper.UserMapper;
import com.client.ws.rasmooplus.model.User;
import com.client.ws.rasmooplus.model.UserType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.repository.UserRepository;
import com.client.ws.rasmooplus.repository.UserTypeRepository;
import com.client.ws.rasmooplus.service.UserService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired UserTypeRepository userTypeRepository;
    @Autowired SubscriptionTypeRepository subscriptionTypeRepository;
    @Autowired UserRepository userRepository;


    @Override
    public User create(UserDto dto) {
        if (Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id deve ser nulo");
        }
        var userTypeOpt = userTypeRepository.findById(dto.getUserType());
        if (userTypeOpt.isEmpty()){
            throw  new NotFoundException("UserTypeId nao encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(dto, userType, null);


        return userRepository.save(user);
    }


    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            if (user.getUserType() != null) {
                Hibernate.initialize(user.getUserType());
            }
        });
        return users;
    }

}
