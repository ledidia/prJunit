package com.junit.test;

import com.junit.test.objectStore.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class CostomerManagementTest {
    CostomerManagement consumerManagement = new CostomerManagement();
    @Before
    public void setUp() throws Exception {
        consumerManagement.addCostomer(new Customer(1,"ion","pooo","900", LocalDate.of(2016, Month.JANUARY, 1)));
        consumerManagement.addCostomer(new Customer(2,"ana","pooo","900", LocalDate.of(2017, Month.JANUARY, 1)));
    }
    @Test
    public void numberOfConsumer() {
        Assert.assertEquals(2, consumerManagement.numberOfCostomer());
    }
    @Test
    public void addCostomer() {
        Assert.assertEquals(3,consumerManagement.addCostomer(new Customer(2,"ion","pooo","900", LocalDate.now())));
    }
    @Test
    public void removeCostomer() {
        Assert.assertEquals(true, consumerManagement.removeCostomer());

    }
    @Test
    public void numberByName() {
       Assert.assertEquals(1, consumerManagement.calculateNumberByName("ion"));
    }

    @Test
    public void calculateGreathThanAge() {
        Assert.assertEquals(1,consumerManagement.calculateGreathThanAge(3));
    }

}