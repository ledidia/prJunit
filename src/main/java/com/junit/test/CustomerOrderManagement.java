package com.junit.test;

import com.junit.test.objectStore.Customer;
import com.junit.test.objectStore.CustomerOrders;
import com.junit.test.objectStore.OrderItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerOrderManagement implements CustomerOrderManagementInterface {
    public List<CustomerOrders> customerOrder = new ArrayList<>();
    @Override
    public float calculateSumByOrder(CustomerOrders customerOrders) {
        float sumByOrder =0;
        for(OrderItem orderItem: customerOrders.getOrderItems()){
          sumByOrder+=orderItem.getOrderQuantity()*orderItem.getProduct().getPriceUnity();
        }
        return sumByOrder;
    }

    @Override
    public float calculateSumByDay(LocalDate date) {
        float sumByDay=0;
        sumByDay=  (float) customerOrder.stream().filter(custOrder -> custOrder.getOrderDate().equals(date)).map(c -> calculateSumByOrder(c)).reduce(0F,(c1,c2)->c1+c2);
        return sumByDay;
    }
}
