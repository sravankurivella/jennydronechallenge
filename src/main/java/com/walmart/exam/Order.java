package com.walmart.exam;

import java.util.Date;

public class Order {
    private String orderId;
    private Address address;
    private Date orderTime;
    private Date orderFulfillTime;
    private String netPromoterScore;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderFulfillTime() {
        return orderFulfillTime;
    }

    public void setOrderFulfillTime(Date orderFulfillTime) {
        this.orderFulfillTime = orderFulfillTime;
    }

    public String getNetPromoterScore() {
        return netPromoterScore;
    }

    public void setNetPromoterScore(String netPromoterScore) {
        this.netPromoterScore = netPromoterScore;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", address=" + address +
                ", orderTime=" + orderTime +
                ", orderFulfillTime=" + orderFulfillTime +
                ", netPromoterScore='" + netPromoterScore + '\'' +
                '}';
    }
}
