package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspey.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WsRaspayIntegrationimplTest {

    @Autowired WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOk(){
        CustomerDto dto = new CustomerDto(null, "49611139802", "daniel.vicenzo77@gmail.com", "Daniel", "Vicezo");
        wsRaspayIntegration.createCustomer(dto);
    }
}
