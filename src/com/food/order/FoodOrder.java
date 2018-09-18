/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.order;

import com.food.FoodItems;
import com.payment.Payment;
import java.util.List;

/**
 *
 * @author Vishak
 */
public class FoodOrder {

    final Long orderNo;
    private boolean paymentFlag = false;
    private List<FoodItems> foodItems;

    public FoodOrder(FoodOrderBuilder builder) {
        orderNo = builder.getOrderNo();
        foodItems = builder.getFoodItemsList();
    }

    public String getOrderDetails() {
        String details = "";
        if (foodItems != null && !foodItems.isEmpty()) {
            for (FoodItems foodItem : foodItems) {
                details += foodItem.getItemName() + " :: " + foodItem.getQuantity() + " :: " + foodItem.getItemPrice();
            }
        }
        return details;
    }

    public double getOrderPrice() {
        double total = 0.0d;
        if (foodItems != null && !foodItems.isEmpty()) {
            for (FoodItems foodItem : foodItems) {
                total += foodItem.getItemPrice();
            }
        }
        return total;
    }

    public boolean makePayment(Payment payment) {
        if (!paymentFlag) {
            double total = getOrderPrice();
            paymentFlag = payment.pay(total);
        }
        return paymentFlag;
    }
}
