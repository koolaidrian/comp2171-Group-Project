package control;

import model.VFDatabaseConnect;
import view.CreateMealView;

public class CreateMealControl {

	private CreateMealView myView;
	private VFDatabaseConnect database;
	private String mealPlan;
	private String type;
	private int id;
	String breakfast;
	String lunch;
	String dinner;
	
	/**
     * Default constructor
     */
    public CreateMealControl(CreateMealView aView, VFDatabaseConnect database, String type, int id) {
    	this.myView = aView;
    	this.database = database;
    	this.type = type;
    	this.id = id;
    }
}
