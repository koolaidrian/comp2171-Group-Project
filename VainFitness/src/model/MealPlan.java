package model;

import java.util.*;

/**
 * 
 */
public class MealPlan {

    /**
     * Default constructor
     */
    public MealPlan(String name, Meal breakfast, Meal lunch, Meal dinner) {
    	this.name = name;
    	this.breakfast = breakfast;
    	this.lunch = lunch;
    	this.dinner = dinner;
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Meal breakfast;

    /**
     * 
     */
    private Meal lunch;

    /**
     * 
     */
    private Meal dinner;

	public String getName() {
		return name;
	}






    /**
     * @param str 
     * @param meal
     */
    public void addMeal(String str, Meal meal) {
        // TODO implement here
    }

    /**
     * @param str 
     * @param meal
     */
    public void deleteMeal(String str, Meal meal) {
        // TODO implement here
    }

    /**
     * @param str 
     * @param str2 
     * @param String 
     * @param meal 
     * @param foodItem
     */
    public void editMeal(String str, String str2, Meal meal, FoodItem foodItem) {
        // TODO implement here
    }






	public Meal getBreakfast() {
		return breakfast;
	}






	public Meal getLunch() {
		return lunch;
	}






	public Meal getDinner() {
		return dinner;
	}

}