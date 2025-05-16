package com.client.ws.rasmooplus.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class SubscriptionTypeDto {

    private Long id;

    @NotBlank(message = "campo não pode ser nulo ou vazio")
    @Size(min = 5, max = 30, message = "campo nome precisa ter entre 5 e 30")
    private String name;

    @Max(value = 12, message = "Não pode ser maior que 12")
    private Long accessMonths;

    @NotNull(message = "Campo price não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "Campo productKey não pode ser vazio ou nulo")
    @Size(min = 5, max = 15, message = "campo productKey precisa ter entre 5 e 30")
    private String productKey;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccessMonths() {
        return accessMonths;
    }

    public void setAccessMonths(Long accessMonths) {
        this.accessMonths = accessMonths;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
