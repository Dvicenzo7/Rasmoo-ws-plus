package com.client.ws.rasmooplus.service;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubcriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubcriptionType> findAll();

    SubcriptionType findById(Long id);

    SubcriptionType create(SubscriptionTypeDto dto);

    SubcriptionType update(Long id, SubscriptionTypeDto subcriptionType);

    void delete(Long id);
}
