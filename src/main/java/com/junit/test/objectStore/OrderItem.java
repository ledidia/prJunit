package com.junit.test.objectStore;

public class OrderItem {
    private int orderItemid;
    private Product product;
    private int orderQuantity;


    public OrderItem(int orderItemid, Product product, int orderQuantity) {
        this.orderItemid = orderItemid;
        this.product = product;
        this.orderQuantity = orderQuantity;
    }


    public Product getProduct() {
        return product;
    }


    public int getOrderQuantity() {
        return orderQuantity;
    }


}
