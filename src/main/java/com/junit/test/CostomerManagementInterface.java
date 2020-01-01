package com.junit.test;

import com.junit.test.objectStore.Customer;

public interface CostomerManagementInterface {
     int numberOfCostomer();
  int addCostomer(Customer customer);
    boolean removeCostomer();
    int calculateNumberByName(String name);
    int calculateGreathThanAge(int age);
}
