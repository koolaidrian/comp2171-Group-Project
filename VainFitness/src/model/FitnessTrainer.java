package model;

import java.util.*;

/**
 * 
 */
public class FitnessTrainer extends Member {

	private int id;
    private ArrayList<String> sessionHours;
    private ArrayList<MealPlan> localisedMealPlans;
    private ArrayList<Client> clients;
    
    /**
     * Default constructor
     */
    public FitnessTrainer(String Usertype, PersonalInfo PI) {
    	super(Usertype, PI);
    }
    public FitnessTrainer(String Usertype, String Username, String Password, PersonalInfo PI) {
    	super(Usertype, Username, Password, PI);
    }

    /**
     * @param client
     */
    public void addClient(Client client) {
        // TODO implement here
    }

    /**
     * @param client
     */
    public void deleteClient(Client client) {
        // TODO implement here
    }

    /**
     * @param mp
     */
    public void addMealPlan(MealPlan mp) {
        // TODO implement here
    }

    /**
     * @param mp
     */
    public void deleteMealPlan(MealPlan mp) {
        // TODO implement here
    }

    /**
     * @param mp 
     * @param str 
     * @param newMeal
     */
    public void editMealPlan(MealPlan mp, String str, Meal newMeal) {
        // TODO implement here
    }

    /**
     * @param mp 
     * @param meal 
     * @param str 
     * @param newFoodItem
     */
    public void editMealPlan(MealPlan mp, Meal meal, String str, FoodItem newFoodItem) {
        // TODO implement here
    }

    /**
     * @param id
     */
    public void findClient(int id) {
        // TODO implement here
    }

    /**
     * @param str
     */
    public void addSessionHour(String str) {
        // TODO implement here
    }

    /**
     * @param str
     */
    public void deleteSessionHour(String str) {
        // TODO implement here
    }
    
    public int getID() {
    	return id;
    }

    public String toString() {
    	String hours = "";
    	for (String h: sessionHours) {
    		hours = hours + h + "\n";
    	}
    	String mealPlans = "";
    	for (MealPlan p: localisedMealPlans) {
    		mealPlans = mealPlans + p.getName() + "\n";
    	}
    	String myClients = "";
    	for (Client c: clients) {
    		myClients = myClients + c.getUsername() + "\n";
    	}
    	return id + super.toString() + "\n" + hours + "\n" + mealPlans + "\n" + myClients;
    }
}