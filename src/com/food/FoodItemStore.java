/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food;

import com.food.item.Burgers;
import java.util.Hashtable;
import java.util.Map;

/**
 * A cache storage for all the foodItems. <br>
 * The cache storage load can be converted to a db based loading mechanism.
 *
 * @author Vishak
 */
public class FoodItemStore {

    private static Map<String, FoodItems> itemStore = new Hashtable<>();

    /**
     * Fetch the food items from the cache.
     *
     * @param foodName name of the object to be fetched.
     * @return clone of the {@linkplain FoodItems} object from the cache.
     */
    public static FoodItems getItem(String foodName) {
        FoodItems cachedShape = itemStore.get(foodName);
        return (FoodItems) cachedShape.clone();
    }

    /**
     * Method called to create all the food items objects and load it on to the
     * cache based storage.
     */
    public static void loadFoodStoreItems() {
        FoodItems vegBurger = new Burgers("Veg Burger")
                .setPrices(Burgers.LSIZE, 1.44)
                .setPrices(Burgers.MSIZE, 1.34)
                .setPrices(Burgers.SSIZE, 1.24);
        itemStore.put(vegBurger.getItemName(), vegBurger);

        FoodItems nonvegBurger = new Burgers("Non Veg Burger")
                .setPrices(Burgers.LSIZE, 1.44)
                .setPrices(Burgers.MSIZE, 1.34)
                .setPrices(Burgers.SSIZE, 1.24);
        itemStore.put(nonvegBurger.getItemName(), nonvegBurger);
    }

}
