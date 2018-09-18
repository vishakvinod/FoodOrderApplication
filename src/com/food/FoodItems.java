/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food;

import com.food.packing.FoodPacking;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vishak
 */
public abstract class FoodItems implements Cloneable {

    protected int quantity;
    protected int size;

    protected final String name;

    public FoodItems(String name) {
        this.name = name;
    }

    protected Map<Integer, Double> prices = new HashMap<>();

    public FoodItems setPrices(int size, double price) {
        prices.put(size, price);
        return this;
    }

    public String getItemName(){
        return name;
    }

    public abstract FoodPacking getPackingType();

    public void setSize(int quantity) {
        this.size = size;
    }

    public double getItemPrice() {
        return prices.get(size);
    }

    public double getPrice() {
        return quantity * (getItemPrice() + getPackingType().getPackingPrice());
    }

    public int getQuantity() {
        return quantity;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
