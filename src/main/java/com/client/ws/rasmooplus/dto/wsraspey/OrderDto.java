package com.client.ws.rasmooplus.dto.wsraspey;

public class OrderDto {

    private String id;
    private String customerId;
    private Long discount;
    private String productAcronym;

    public OrderDto() {
    }

    public OrderDto(String id, String customerId, Long discount, String productAcronym) {
        this.id = id;
        this.customerId = customerId;
        this.discount = discount;
        this.productAcronym = productAcronym;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getProductAcronym() {
        return productAcronym;
    }

    public void setProductAcronym(String productAcronym) {
        this.productAcronym = productAcronym;
    }
}
