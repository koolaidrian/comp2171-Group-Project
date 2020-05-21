package model;

import java.util.*;

/**
 * 
 */

public class Client extends Member {

    private Profile profile;

    private ArrayList<MealPlan> myPlans;

    private MealPlan dailyConsumption;

    /**
     * Default constructor
     */

    public Client() {

    	super();

    }


    public Client(String Usertype, PersonalInfo PI, Profile myProfile) {

    	super(Usertype, PI);

    	this.profile = myProfile;

    }

//    public void Client() {

//       TODO implement here

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
    	text += super.toString() + "\n";
    	text += getProfileInfo();
    	return text;
    }

}
