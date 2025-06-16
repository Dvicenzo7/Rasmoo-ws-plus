package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspey.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspey.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspey.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspey.PaymentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class WsRaspayIntegrationimplTest {

    @Autowired WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOk(){
        CustomerDto dto = new CustomerDto(null, "49611139802", "daniel.vicenzo77@gmail.com", "Daniel", "Vicezo");
        wsRaspayIntegration.createCustomer(dto);
    }

    @Test
    void createOrderWhenDtoOk(){
        OrderDto dto = new OrderDto(null, "", BigDecimal.ZERO, "MONTH22");
        wsRaspayIntegration.createOrder(dto);
    }

    @Test
    void processPaymentWhenDtoOk(){
        CreditCardDto creditCardDto = new CreditCardDto(123L, "49611139802", 0L, 12L,   "123412341234", 2025L);
        PaymentDto paymentDto = new PaymentDto(creditCardDto, "", "");//No orderDTO gera esses valores CustomerID e OrderId
        wsRaspayIntegration.processPayment(paymentDto);
    }
}
