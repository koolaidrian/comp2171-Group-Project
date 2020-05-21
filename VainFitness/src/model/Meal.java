package model;

import java.util.*;

/**
 * 
 */
public class Meal
{
    private String name;
    private ArrayList<FoodItem> foodItems;
    private double totalCaloricValue;



    /**
     * Default constructor
     */
    public Meal(String name, ArrayList<FoodItem> foodItemList, double totalCaloricValue)
    {
        this.name = name;
        this.foodItems = foodItemList;
        this.totalCaloricValue = totalCaloricValue;
    }
    
    
    //--------------------------------------------------------------------------------------------------
    // Methods
    //--------------------------------------------------------------------------------------------------

    /**
     * @param foodItem
     */
    public void addItem(FoodItem foodItem)
    {
        // TODO implement here
        System.out.println(foodItems); // Display list of food items
        
        foodItems.add(foodItem); // Add food item to the arraylist
        System.out.println(foodItems); // Display list after food item has been added
    }

    /**
     * @param foodItem
     */
    public void deleteItem(FoodItem foodItem)
    {
        // TODO implement here
        System.out.println(foodItems); // Display the list of food items
        
        foodItems.remove(foodItem); // Remove food item from an arrayList
        System.out.println(foodItems); // Display list after food item has been removed
    }

}