package com.client.ws.rasmooplus.service.impl;

import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        Optional<SubcriptionType> subscription = subscriptionTypeRepository.findById(id);
        if (subscription.isEmpty()){
            throw new NotFoundException("SubscriptionType não encontrado!");
        }
        return subscription.get();
    }

    @Override
    public SubcriptionType create(SubcriptionType subcriptionType) {
        return null;
    }

    @Override
    public SubcriptionType update(SubcriptionType subcriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
