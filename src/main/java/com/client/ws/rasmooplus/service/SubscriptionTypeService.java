package com.client.ws.rasmooplus.service;

import com.client.ws.rasmooplus.model.SubcriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubcriptionType> findAll();

    SubcriptionType findById(Long id);

    SubcriptionType create(SubcriptionType subcriptionType);

    SubcriptionType update(SubcriptionType subcriptionType);

    void delete(Long id);
}
