package com.junit.test;

import com.junit.test.objectStore.Customer;
import com.junit.test.objectStore.CustomerOrders;
import com.junit.test.objectStore.OrderItem;
import com.junit.test.objectStore.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class ProductManagementTest {
    ProductManagement productManagement = new ProductManagement();
    @Before
    public void setUp() throws Exception {
        Product product1 = new Product(1,"cream1", 10,  LocalDate.of(2016, Month.JANUARY, 1));
        Product product2 = new Product(2,"cream2", 15,  LocalDate.of(2020, Month.JANUARY, 1));
        Product product3 = new Product(3,"cream3", 20,  LocalDate.of(2016, Month.JANUARY, 1));
        Product product4 = new Product(4,"cream4", 25,  LocalDate.of(2020, Month.JANUARY, 1));
       productManagement.products.add(product1);
        productManagement.products.add(product2);
        productManagement.products.add(product3);
        productManagement.products.add(product4);
    }
    @Test
    public void isExpiration() {
        Product product1 = new Product(1,"cream", 23,  LocalDate.of(2016, Month.JANUARY, 1));
        Product product2 = new Product(2,"cream", 23,  LocalDate.of(2021, Month.JANUARY, 1));
       Assert.assertEquals(false, productManagement.isExpiration(product1));
       Assert.assertEquals(true, productManagement.isExpiration(product2));

    }

    @Test
    public void calculatePriceGreathWithAvgr() {
        Assert.assertEquals(2, productManagement.calculatePriceGreathWithAvgr());
    }

    @Test
    public void addProduct() {
        Assert.assertEquals(5, productManagement.addProduct(new Product(4,"cream4", 25,  LocalDate.of(2020, Month.JANUARY, 1))));

    }
}