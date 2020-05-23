package model;

import java.util.*;

/**
 * 
 */
public class Client extends Member {
	
    private Profile profile;

    private ArrayList<MealPlan> myPlans;
    private ArrayList<FoodItem> myFoodItems;

    private MealPlan dailyConsumption;
    
    private double myProgress = 0.0;
    //private int myProgress = 0;


    /**
     * Default constructor
     */
    public Client() {
    	super();
    	myFoodItems = new ArrayList<FoodItem>();
    }
    
    public Client(String Usertype, PersonalInfo PI, Profile myProfile) {
    	super(Usertype, PI);
    	this.profile = myProfile;
    	myFoodItems = new ArrayList<FoodItem>();
    }
    
    public Client(String Usertype, String Username, String Password, PersonalInfo PI, Profile myProfile) {
    	super(Usertype, Username, Password, PI);
    	this.profile = myProfile;
    	myFoodItems = new ArrayList<FoodItem>();
    }
    
    
    public int getTodayProgress() {
    	int progress = 0;
    	double Goal = profile.getDailyConsumptionGoal();
    	
    	progress = (int) (myProgress/Goal * 100);
    	
       return progress;
    }
    
    
//    public void Client() {
//        // TODO implement here
//    }

    /**
     * @param plan
     */
    public void addMealPlan(MealPlan plan) {
        // TODO implement here
    }

    /**
     * @param mp
     */
    public void deleteMealPlan(MealPlan mp) {
        // TODO implement here
    }

    /**
     * @param str
     */
    public void getMealPlan(String str) {
        // TODO implement here
    }

    /**
     * @param str
     */

    public void editCustom(CustomMealPlan plan) {
        // TODO implement here
    }
    
    public String getProfileInfo() {
    	return profile.toString();
    }
    
    public String toString() {
    	String text = "";
    	String t1 = "";
    	text += super.toString() + "\n";
    	text += getProfileInfo();
    	
    	return text;
    	
    }
    
    public int getId() {
    	return profile.getId();
    }
    
    public String getDOB() {
    	return profile.getDOB();
    }
    
    public void addFoodItem(FoodItem item) {
    	myFoodItems.add(item);
    	myProgress += item.getCaloricValue();
    	
    }
   /* public String, String, String ,String, String, String, String, int ,double , String, String  String, Double, int, int, int, double, double, double renderClientInfo() {
    	
    	return String UserType,String Username, String Password,String Firstname, String Lastname, String Contact, String Email, int ID, double Height, String Gender, String DOB, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage,double InitialWeight, double CurrentWeight, double GoalWeight
    } */

}