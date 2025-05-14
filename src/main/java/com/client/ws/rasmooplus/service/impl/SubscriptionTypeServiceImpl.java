package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.mapper.SubscriptionTypeMapper;
import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubcriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubcriptionType findById(Long id) {
        return getSubcriptionType(id);
    }

    @Override
    public SubcriptionType create(SubscriptionTypeDto dto) {
        if (Objects.nonNull(dto.getId())){
            throw new BadRequestException("ID deve ser nulo!");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubcriptionType update(Long id, SubscriptionTypeDto dto) {
        SubcriptionType subcriptionType = getSubcriptionType(id);
        subcriptionType.setId(dto.getId());
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));

    }

    @Override
    public void delete(Long id) {
        getSubcriptionType(id);
        subscriptionTypeRepository.deleteById(id);
    }

    private SubcriptionType getSubcriptionType(Long id) {
        Optional<SubcriptionType> subscription = subscriptionTypeRepository.findById(id);
        if (subscription.isEmpty()){
            throw new NotFoundException("SubscriptionType não encontrado!");
        }
        return subscription.get();
    }
}
