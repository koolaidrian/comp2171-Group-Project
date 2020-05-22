package model;

import java.util.*;

/**
 * 
 */
public class WeightGoal {
	
	private double initialWeight = 0;
	private double currentWeight = 0;
    private double goalWeight = 0;
    
    /**
     * Default constructor
     */
    public WeightGoal() {
    	
    }
    
    public WeightGoal(double IW, double CW, double GW) {
    	this.initialWeight = IW;
    	this.currentWeight = CW;
    	this.goalWeight = GW;
    	
    }
    
    public double getInitialWeight() {
		return initialWeight;
	}

	public void setInitialWeight(double initialWeight) {
		this.initialWeight = initialWeight;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public double getGoalWeight() {
		return goalWeight;
	}

	public void setGoalWeight(double goalWeight) {
		this.goalWeight = goalWeight;
	}
	
	@Override
	public String toString() {
		return "----- WeightGoal -----\n Initial Weight - " + initialWeight + "\n current Weight - " + currentWeight + "\n Weight Goal - "
				+ goalWeight + "\n ---------------\n";
	}
    

}