package com.junit.test;

import com.junit.test.objectStore.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CostomerManagement implements CostomerManagementInterface {
    public List<Customer> customers = new ArrayList<Customer>();
    @Override
    public int numberOfCostomer() {
        return customers.isEmpty() ? 0 : customers.size();
    }

    @Override
    public int  addCostomer(Customer customer) {
        customers.add(customer);
        return customers.size();
    }
    @Override
    public boolean removeCostomer() {
        if (customers.isEmpty()) {
            return false;
        } else {
            customers.remove(0);
            return true;
        }
    }
    @Override
    public int calculateNumberByName(String name) {
        int numberByName = 0;
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) numberByName++;
        }
        return numberByName;

    }
    @Override
    public int calculateGreathThanAge(int age) {
        int numberCustomer = 0;
        LocalDate date = LocalDate.now().minusYears(age);
        for (Customer customer : customers) {
            if (customer.getDateOfBirth().isBefore(date)) {
                numberCustomer++;
            }
        }
        return numberCustomer;
    }
}


