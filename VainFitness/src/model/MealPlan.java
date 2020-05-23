package model;

import java.util.*;

/**
 * 
 */
public class MealPlan
{
    private String name;
    private Meal breakfast;
    private Meal lunch;
    private Meal dinner;
    private ArrayList<Meal> meals;
	
    enum typeOfMeal{
    	BREAKFAST,
    	LUNCH,
    	DINNER
    };
    private typeOfMeal mealType;
    
    /**
     * Default constructor
     */
    public MealPlan(String name, Meal breakfast, Meal lunch, Meal dinner, typeOfMeal mealType)
    {
        this.name = name;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.meals = new ArrayList<Meal>();
        meals.add(breakfast);
        meals.add(lunch);
        meals.add(dinner);
        this.mealType = mealType;
    }

    public MealPlan() {
    	
    }
    /**
     * @param mealType --> Type of meal (i.e. breakfast, lunch or dinner)
     * @param meal
     */
    public void addMeal(String mealType, Meal meal, ArrayList<Meal> meals)
    {
        // TODO implement here
    	/*
    	breakfast.addItem(meal);
    	lunch.addItem(meal);
    	dinner.addItem(meal);
    	*/
    	if(mealType.equalsIgnoreCase("breakfast")) 
    	{
    		this.mealType = typeOfMeal.BREAKFAST;
    		//meal.
    	}
    	else if (mealType.equalsIgnoreCase("lunch"))
    	{
    		this.mealType = typeOfMeal.LUNCH;
    	}
    	else if(mealType.equalsIgnoreCase("dinner")) 
    	{
    		this.mealType = typeOfMeal.DINNER;
    	}
    	else 
    	{
    		System.out.println("Meal is not of a valid type.\n A meal can be either breakfast, lunch or dinner.");
    		System.out.println("Please try again.");
    	}
    	
    }

    /**
     * @param str 
     * @param meal
     */
    public void deleteMeal(String mealType, Meal meal, ArrayList<Meal> meals)
    {
        // TODO implement here
    	if(mealType.equalsIgnoreCase("breakfast")) 
    	{
    		this.mealType = typeOfMeal.BREAKFAST;
    		//meal.
    	}
    	else if (mealType.equalsIgnoreCase("lunch"))
    	{
    		this.mealType = typeOfMeal.LUNCH;
    	}
    	else if(mealType.equalsIgnoreCase("dinner")) 
    	{
    		this.mealType = typeOfMeal.DINNER;
    	}
    	else 
    	{
    		System.out.println("Meal is not of a valid type.\n A meal can be either breakfast, lunch or dinner.");
    		System.out.println("Please try again.");
    	}
    	
    }

    /**
     * @param str 
     * @param str2 
     * @param String 
     * @param meal 
     * @param foodItem
     */
    public void editMeal(String str, String str2, Meal meal, FoodItem foodItem)
    {
        // TODO implement here
    	// Add a food item to dinner meal:
    	// -> arraylistName.get(int index).addItem(foodItem)
    }

}