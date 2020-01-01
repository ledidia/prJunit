package com.junit.test.objectStore;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private int productId;
    private String name;
    private  double priceUnity;
    private LocalDate expirationDate;

    public Product(int productId, String name, double priceUnity, LocalDate expirationDate) {
        this.productId = productId;
        this.name = name;
        this.priceUnity = priceUnity;
        this.expirationDate = expirationDate;
    }

    public double getPriceUnity() {
        return priceUnity;
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

 }
