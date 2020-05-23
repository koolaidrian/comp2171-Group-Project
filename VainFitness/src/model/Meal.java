package model;

import java.util.*;

/**
 * 
 */
public class Meal {

    /**
     * Default constructor
     */
    public Meal(String name) {
    	this.name = name;
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Set<FoodItem> foodItems;

    /**
     * 
     */
    private double totalCaloricValue;





    /**
     * @param foodItem
     */
    public void addItem(FoodItem foodItem) {
        // TODO implement here
    }

    /**
     * @param foodItem
     */
    public void deleteItem(FoodItem foodItem) {
        // TODO implement here
    }

	public String getName() {
		return name;
	}

}