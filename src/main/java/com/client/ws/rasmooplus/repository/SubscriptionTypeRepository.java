package com.client.ws.rasmooplus.repository;

import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubcriptionType, Long> {

}
