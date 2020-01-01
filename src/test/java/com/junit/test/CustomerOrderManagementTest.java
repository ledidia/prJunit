package com.junit.test;

import com.junit.test.objectStore.Customer;
import com.junit.test.objectStore.CustomerOrders;
import com.junit.test.objectStore.OrderItem;
import com.junit.test.objectStore.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerOrderManagementTest {
    CustomerOrders custOrd1;
    CustomerOrders custOrd2;
    CustomerOrderManagement customerOrderManagement =new CustomerOrderManagement();
    @Before
    public void setUp() throws Exception {
        Customer c1 = new Customer(1,"ion","pooo","900", LocalDate.now());
        Customer c2 = new Customer(2,"Ion","pooo","900", LocalDate.now().minusYears(2));
        Product p1= new Product(1,"cream",10,LocalDate.now());
        Product p2= new Product(1,"cream",20,LocalDate.now());
        Product p3= new Product(1,"cream",30 ,LocalDate.now());
        OrderItem o1 = new OrderItem(1,p1,2);
        OrderItem o2 = new OrderItem(2,p2,1);
        OrderItem o3 = new OrderItem(3,p3,2);
        OrderItem o4 = new OrderItem(4,p2,3);
        OrderItem o5 = new OrderItem(5,p1,2);
       custOrd1= new CustomerOrders(1,c1, LocalDate.now(),List.of(o1,o2,o3));
        custOrd2= new CustomerOrders(2,c2, LocalDate.now(),List.of(o1,o4,o5));
         customerOrderManagement.customerOrder.add(custOrd1);
        customerOrderManagement.customerOrder.add(custOrd2);
    }
    @Test
    public void calculateSumByOrder() {
        Assert.assertEquals(100,customerOrderManagement.calculateSumByOrder(custOrd1),1 );
        Assert.assertEquals(100,customerOrderManagement.calculateSumByOrder(custOrd2),1 );
    }
    @Test
    public void calculateSumByDay() {
        Assert.assertEquals(200, customerOrderManagement.calculateSumByDay(LocalDate.now()),1);
    }
}