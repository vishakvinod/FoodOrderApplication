/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.item;

import com.food.FoodItems;
import com.food.packing.FoodPacking;
import com.food.packing.items.BottelPacking;

/**
 *
 * @author Vishak
 */
public abstract class Beverage extends FoodItems {

    public static final int XLSIZE = 1;
    public static final int LSIZE = 1;
    public static final int MSIZE = 1;
    public static final int SSIZE = 1;

    public Beverage(String name) {
        super(name);
        this.size = MSIZE;
    }

    @Override
    public FoodPacking getPackingType() {
        return new BottelPacking();
    }

}
