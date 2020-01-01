package com.junit.test;

import com.junit.test.objectStore.Product;

public interface ProductManagementInterface {
    boolean isExpiration(Product product);

    int calculatePriceGreathWithAvgr();

    int addProduct(Product product);

    float avgrPrice();
}