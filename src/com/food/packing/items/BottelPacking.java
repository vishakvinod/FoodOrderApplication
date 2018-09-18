/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.packing.items;

import com.food.packing.FoodPacking;

/**
 *
 * @author Vishak
 */
public class BottelPacking implements FoodPacking {

    @Override
    public String getPacking() {
        return "Bottle Packing";
    }

    @Override
    public double getPackingPrice() {
        return 0.65d;
    }

}
