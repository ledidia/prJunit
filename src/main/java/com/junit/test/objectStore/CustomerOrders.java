package com.junit.test.objectStore;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class CustomerOrders {
    private int orderId;
    private Customer customer;
    private LocalDate orderDate;
    private List<OrderItem> orderItems;


    public CustomerOrders(int orderId, Customer customer, LocalDate orderDate,List<OrderItem> orderItems ) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.orderItems = orderItems;

    }
   public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
