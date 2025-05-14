package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubcriptionType;

public class SubscriptionTypeMapper {

    public static SubcriptionType fromDtoToEntity(SubscriptionTypeDto dto){
        SubcriptionType subcriptionType =  new SubcriptionType();
        subcriptionType.setId(dto.getId());
        subcriptionType.setName(dto.getName());
        subcriptionType.setPrice(dto.getPrice());
        subcriptionType.setAccessMonths(dto.getAccessMonths());
        subcriptionType.setProductKey(dto.getProductKey());
        return subcriptionType;
    }
}
