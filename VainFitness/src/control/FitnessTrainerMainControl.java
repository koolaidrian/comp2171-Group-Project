package control;

import model.VFDatabaseConnect;
import view.FitnessTrainerMainView;

public class FitnessTrainerMainControl {
	
	private FitnessTrainerMainView myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public FitnessTrainerMainControl(FitnessTrainerMainView aView, VFDatabaseConnect database, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.type = type;
		this.id = id;
	}
}
