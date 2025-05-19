package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspey.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspey.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspey.PaymentDto;
import org.aspectj.weaver.ast.Or;

public interface WsRaspayIntegration {

    CustomerDto createCustomer(CustomerDto dto);

    OrderDto createOrder(OrderDto dto);

    Boolean processPayment(PaymentDto dto);
}
