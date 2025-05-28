package com.client.ws.rasmooplus.integration.impl;

import com.client.ws.rasmooplus.dto.wsraspey.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspey.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspey.PaymentDto;
import com.client.ws.rasmooplus.integration.WsRaspayIntegration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;


@Component
public class WsRaspayIntegrationImpl implements WsRaspayIntegration {

    private RestTemplate restTemplate;

    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        String credentions = "rasmooplus:r@sm00";
        String base64Encoded = Base64.getEncoder().encodeToString(credentions.getBytes());
        headers.add("Authorization", "Basic "+base64Encoded);
        return headers;
    }

    public WsRaspayIntegrationImpl(){
        restTemplate = new RestTemplate();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto dto) {
       try {
           HttpHeaders headers = getHttpHeaders();
           HttpEntity<CustomerDto> request = new HttpEntity<>(dto, headers);
           ResponseEntity<CustomerDto> response = restTemplate.exchange("http://localhost:8081/ws-raspay/v1/customer", HttpMethod.POST, request, CustomerDto.class);
           return response.getBody();
       }catch (Exception e){
           throw e;
       }
    }


    @Override
    public OrderDto createOrder(OrderDto dto) {
        return null;
    }

    @Override
    public Boolean processPayment(PaymentDto dto) {
        return null;
    }
}
