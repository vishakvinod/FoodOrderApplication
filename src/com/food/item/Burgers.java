/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.item;

import com.food.FoodItems;
import com.food.packing.FoodPacking;
import com.food.packing.items.WrapPacking;

/**
 *
 * @author Vishak
 */
public class Burgers extends FoodItems {

    public static final int LSIZE = 1;
    public static final int MSIZE = 2;
    public static final int SSIZE = 3;

    public Burgers(String name) {
        super(name);
        this.size = MSIZE;
    }

    @Override
    public FoodPacking getPackingType() {
        return new WrapPacking();
    }

    @Override
    public double getItemPrice() {
        return prices.get(size);
    }

    @Override
    public String getItemName() {
        return name;
    }

}
