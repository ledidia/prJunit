package com.junit.test;

import com.junit.test.objectStore.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement  implements  ProductManagementInterface{
    public List<Product> products = new ArrayList<>();

    @Override
    public boolean isExpiration(Product product) {
        return product.getExpirationDate().isAfter(LocalDate.now());
    }

    @Override
    public int calculatePriceGreathWithAvgr() {
        float avgrPriceProduct= avgrPrice();
      int countProduct = (int) products.stream().filter(p -> p.getPriceUnity() > avgrPriceProduct).count();
      return countProduct;
    }

    @Override
    public int addProduct(Product product) {
        products.add(product);
        return products.size();

    }

    @Override
    public float avgrPrice() {
        float priceTotal =0;
        for(Product product :products){
            priceTotal += product.getPriceUnity();
        }
        if (priceTotal == 0) return 0;
        else {
            return priceTotal/products.size();
        }
    }

}
