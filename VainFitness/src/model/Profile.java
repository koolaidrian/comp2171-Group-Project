package model;

import java.util.*;

/**
 * 
 */
public class Profile {
	
    private double height;
	private Gender gender;
    private Calendar date_of_birth;
    private String address;
    private WeightGoal weightGoal;
    private NutritionGoal NutritionGoal;
    private static int id = 0;

    public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getGender() {
		String gen = "";
		switch(this.gender) {
		case Male:
			gen = "Male";
			break;
		case Female:
			gen = "Female";
			
		}
		return gen;
	}

	public void setGender(String gen) {
		if(gen.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
	}

	public String getDOB() {
		return "" + Calendar.DATE +  "/" + Calendar.MONTH + "/" + Calendar.YEAR;
	}

	public void setDOB(int Y, int M, int D) {
		this.date_of_birth.set(Y, M, D);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//====================================================
	public String getWeightGoalInfo() {
		return weightGoal.toString();
	}
	
	public double getInitialWeight() {
		return weightGoal.getInitialWeight();
	}

	public void setInitialWeight(double initialWeight) {
		this.weightGoal.setInitialWeight(initialWeight);
		
	}

	public double getCurrentWeight() {
		return weightGoal.getCurrentWeight();
	}

	public void setCurrentWeight(double currentWeight) {
		this.weightGoal.setCurrentWeight(currentWeight);
	}

	public double getGoalWeight() {
		return weightGoal.getGoalWeight();
	}

	public void setGoalWeight(double goalWeight) {
		this.weightGoal.setGoalWeight(goalWeight);
	}
	
	
	//===========================================================

	public String getNutritionGoalInfo() {
		return NutritionGoal.toString();
	}

	public double getDailyConsumptionGoal() {
		return NutritionGoal.getDailyConsumptionGoal();
	}

	public void setDailyConsumptionGoal(double dailyConsumptionGoal) {
		this.NutritionGoal.setDailyConsumptionGoal(dailyConsumptionGoal);
	}

	public int getCarbohydratePercentage() {
		return NutritionGoal.getCarbohydratePercentage();
	}

	public void setCarbohydratePercentage(int carbohydratePercentage) {
		this.NutritionGoal.setCarbohydratePercentage(carbohydratePercentage);
	}

	public int getProteinPercentage() {
		return NutritionGoal.getProteinPercentage();
	}

	public void setProteinPercentage(int proteinPercentage) {
		this.NutritionGoal.setProteinPercentage(proteinPercentage);
	}

	public int getFatPercentage() {
		return NutritionGoal.getFatPercentage();
	}

	public void setFatPercentage(int fatPercentage) {
		this.NutritionGoal.setFatPercentage(fatPercentage);
	}
	
	//=============================================================

	public static int getId() {
		return id;
	}



    /**
     * Default constructor
     */
    public Profile(double H, String G, int Y, int M, int D, String Add, WeightGoal WG, NutritionGoal NG) {
    	this.height = H;
    	if(G.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
    	
    	
    	this.date_of_birth = Calendar.getInstance();
    	this.date_of_birth.set(Y, M, D);
    	
    	this.address = Add;
    	this.weightGoal = WG;
    	this.NutritionGoal = NG;
    	
    	id++;
    	
    }
    
    public String toString() {
    	
    	String text = "";
    	
    	text += getHeight() + "\n";
    	text += getGender() + "\n";
    	text += getDOB() + "\n";
    	text += getAddress() + "\n";
    	text += getWeightGoalInfo() + "\n";
    	
    	return text;
    }

    /**
     * 
     */









}