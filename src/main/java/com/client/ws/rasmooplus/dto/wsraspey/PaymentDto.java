package com.client.ws.rasmooplus.dto.wsraspey;

public class PaymentDto {

    private CreditCardDto creditCardDto;
    private String cutomerId;
    private String orderId;

    public PaymentDto() {
    }

    public PaymentDto(CreditCardDto creditCardDto, String cutomerId, String orderId) {
        this.creditCardDto = creditCardDto;
        this.cutomerId = cutomerId;
        this.orderId = orderId;
    }

    public CreditCardDto getCreditCardDto() {
        return creditCardDto;
    }

    public void setCreditCardDto(CreditCardDto creditCardDto) {
        this.creditCardDto = creditCardDto;
    }

    public String getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(String cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
