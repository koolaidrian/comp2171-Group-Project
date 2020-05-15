package model;

import java.util.*;

/**
 * 
 */
public class FitnessTrainer extends Member {

    /**
     * Default constructor
     */
    public FitnessTrainer() {
    }

    /**
     * 
     */
    private Set<String> sessionHours;

    /**
     * 
     */
    private Set<MealPlan> localisedMealPlans;

    /**
     * 
     */
    private Set<Client> clients;



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

}