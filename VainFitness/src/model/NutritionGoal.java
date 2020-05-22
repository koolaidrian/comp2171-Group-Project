package model;

import java.util.*;

/**
 * 
 */
public class NutritionGoal{

    private double dailyConsumptionGoal = 0.00;
	private int carbohydratePercentage = 0;
    private int proteinPercentage = 0;
    private int fatPercentage = 0;
    
    
    public double getDailyConsumptionGoal() {
		return dailyConsumptionGoal;
	}

	public void setDailyConsumptionGoal(double dailyConsumptionGoal) {
		this.dailyConsumptionGoal = dailyConsumptionGoal;
	}

	public int getCarbohydratePercentage() {
		return carbohydratePercentage;
	}

	public void setCarbohydratePercentage(int carbohydratePercentage) {
		this.carbohydratePercentage = carbohydratePercentage;
	}

	public int getProteinPercentage() {
		return proteinPercentage;
	}

	public void setProteinPercentage(int proteinPercentage) {
		this.proteinPercentage = proteinPercentage;
	}

	public int getFatPercentage() {
		return fatPercentage;
	}

	public void setFatPercentage(int fatPercentage) {
		this.fatPercentage = fatPercentage;
	}

    /**
     * Default constructor
     */
	public NutritionGoal() {
		
	}
	
    public NutritionGoal(Double DG, int CP, int PP, int FP) {
    	this.dailyConsumptionGoal = DG;
    	this.carbohydratePercentage = CP;
    	this.proteinPercentage = PP;
    	this.fatPercentage = FP;
    }
    
    @Override
	public String toString() {
		return "----- NutritionGoal -----\nDaily Consumption Goal - " + dailyConsumptionGoal + "\n carbohydrate Percentage - "
				+ carbohydratePercentage + "\n Protein Percentage - " + proteinPercentage + "\n Fat Percentage - "
				+ fatPercentage + "\n ----------------\n";
	}



}