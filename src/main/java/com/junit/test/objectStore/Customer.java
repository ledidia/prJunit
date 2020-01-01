package com.junit.test.objectStore;

import java.time.LocalDate;

public class Customer {
    private int custumerId;
    private String name;
    private String phone;
    private String email;
private LocalDate dateOfBirth;
    public Customer(int custumerId, String name, String phone, String email, LocalDate dateOfBirth) {
        this.custumerId = custumerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth =dateOfBirth;

    }


    public String getName() {
        return name;
    }

  public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
