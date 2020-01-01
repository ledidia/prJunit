package com.junit.test;

import com.junit.test.objectStore.CustomerOrders;

import java.time.LocalDate;

public interface CustomerOrderManagementInterface {
    float calculateSumByOrder( CustomerOrders customerOrders);
    float calculateSumByDay(LocalDate date);

}
