package model;

import java.util.*;

/**
 * 
 */
public class Profile {
	
    private double height;
	private Gender gender;
    private String date_of_birth;
    private String address;
    private WeightGoal weightGoal;
    private NutritionGoal NutritionGoal;
    private int myId;
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
			break;
		default:
			gen = "Male";
			break;
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
		//return "" + Calendar.DATE +  "/" + Calendar.MONTH + "/" + Calendar.YEAR;
		return date_of_birth;
	}

	public void setDOB(int Y, int M, int D) {
		String DOB ="";
		DOB += Y + "-" + M +"-" + D;
		
		this.date_of_birth = DOB;
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

	public int getId() {
		return myId;
	}
	
	public static void setId(int newID ) {
		id = newID;
	}



    /**
     * Default constructor
     */
    public Profile(double H, String G, int Y, int M, int D, String Add, NutritionGoal NG, WeightGoal WG) {
    	this.height = H;
    	if(G.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
    	
    	
    	this.date_of_birth = Y + "-" + M +"-" + D;
    	
    	this.address = Add;
    	this.weightGoal = WG;
    	this.NutritionGoal = NG;
    	
    	this.myId = id;
    	id++;
    	
    }
    
    public Profile(double H, String G, int Y, int M, int D, String Add) {
    	this.height = H;
    	if(G.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
    	
    	
    	this.date_of_birth = Y + "-" + M +"-" + D;
    	
    	this.address = Add;
    	this.weightGoal = new WeightGoal();
    	this.NutritionGoal = new NutritionGoal();
    	
    	this.myId = id;
    	id++;
    	
    }
    
    public Profile(double H, String G, int Y, int M, int D, String Add,WeightGoal WG) {
    	this.height = H;
    	if(G.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
    	
    	
    	this.date_of_birth = Y + "-" + M +"-" + D;
    	
    	this.address = Add;
    	this.weightGoal = WG;
    	this.NutritionGoal = new NutritionGoal();
    	
    	this.myId = id;
    	id++;
    	
    }
    
    public Profile(double H, String G, int Y, int M, int D, String Add, NutritionGoal NG) {
    	this.height = H;
    	if(G.equalsIgnoreCase("female")) {
    		this.gender = Gender.Female;
    	}else {
    		this.gender = Gender.Male;
    	}
    	
    	
    	this.date_of_birth = Y + "-" + M +"-" + D;
    	
    	this.address = Add;
    	this.weightGoal = new WeightGoal();
    	this.NutritionGoal = NG;
    	
    	this.myId = id;
    	id++;
    	
    }
    
   
    
    public String toString() {
    	
    	String text = "";
    	
    	text += "Height -" + getHeight() + "\n";
    	text += "Gender -" +getGender() + "\n";
    	text += "Date of Birth -" +getDOB() + "\n";
    	text += getAddress() + "\n";
    	text += getNutritionGoalInfo() + "\n";
    	text += getWeightGoalInfo() + "\n";
    	
    	return text;
    }

    /**
     * 
     */









}