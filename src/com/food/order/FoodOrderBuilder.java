/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.order;

import com.food.FoodItems;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vishak
 */
public class FoodOrderBuilder {

    private final long orderNo;

    private List<FoodItems> foodItemsList;

    public FoodOrderBuilder(Long orderNo) {
        this.orderNo = orderNo;
        foodItemsList = new ArrayList<>();
    }

    public FoodOrderBuilder addItem(FoodItems foodItems) {
        foodItemsList.add(foodItems);
        return this;
    }

    public FoodOrderBuilder removeItem(FoodItems foodItems) {
        return this;
    }

    public FoodOrder build() {
        return new FoodOrder(this);
    }

    public long getOrderNo() {
        return orderNo;
    }

    public List<FoodItems> getFoodItemsList() {
        return foodItemsList;
    }
    
     public double getOrderPrice() {
        double total = 0.0d;
        if (foodItemsList != null && !foodItemsList.isEmpty()) {
            for (FoodItems foodItem : foodItemsList) {
                total += foodItem.getItemPrice();
            }
        }
        return total;
    }

}
