package model;

import java.util.*;

/**
 * 
 */
public class FoodItem
{
    private String name;
	private double caloricValue;
    private String mainNutritionalContent;
    private double carbs;
    private double protein;
    private double fats;


    /**
     * Default constructor
     */
    public FoodItem(String name, double caloricValue, String mainNutritionalContent, double carbs, double protein, double fats)
    {
        this.name = name;
        this.caloricValue = caloricValue;
        this.mainNutritionalContent = mainNutritionalContent;
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }
    
    public FoodItem(String name, double caloricValue, double carbs, double protein, double fats)
    {
        this.name = name;
        this.caloricValue = caloricValue;
        this.mainNutritionalContent = "";
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
        
    }
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCaloricValue() {
		return caloricValue;
	}

	public void setCaloricValue(double caloricValue) {
		this.caloricValue = caloricValue;
	}

	public String getMainNutritionalContent() {
		return mainNutritionalContent;
	}

	public void setMainNutritionalContent(String mainNutritionalContent) {
		this.mainNutritionalContent = mainNutritionalContent;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		this.fats = fats;
	}
    
	

	public String toString() {
		String text = "";
		
		text += "Ingredients: " + getName() +" \n" + "Total Calories: " + getCaloricValue() + "\nProtein: " + getProtein() + "\nFat: " + getFats() + "\nCarbs: " + getCarbs();
		
		return text;
	}
}