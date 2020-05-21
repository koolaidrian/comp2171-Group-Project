package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.VFDatabaseConnect;
import view.DeleteLMPView;
import view.EditLMPView;
import view.VainFitnessUIAdmin;
import view.VainFitnessUIMember;

public class EditLMPControl {

	private EditLMPView myView;
	private VFDatabaseConnect database;
	private String mealPlan;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
    public EditLMPControl(EditLMPView aView, VFDatabaseConnect database, String mealPlan, String type, int id) {
    	this.myView = aView;
    	this.database = database;
    	this.type = type;
    	this.id = id;
    	ArrayList<String> lmps = database.getMeals();
    	for (String meal: lmps) {
    		myView.addBreakfastPlans(meal);
    		myView.addLunchPlans(meal);
    		myView.addDinnerPlans(meal);
    		myView.addDessertPlans(meal);
    	}
    	myView.getFrame().setVisible(true);
    	myView.addBreakfastSaveListener(new BreakfastSaveListener());
    	myView.addLunchSaveListener(new LunchSaveListener());
    	myView.addDinnerSaveListener(new DinnerSaveListener());
    	myView.addDessertSaveListener(new DessertSaveListener());
    	myView.addNewBreakfastMealListener(new BreakfastMealListener());
    	myView.addNewLunchMealListener(new LunchMealListener());
    	myView.addNewDinnerMealListener(new DinnerMealListener());
    	myView.addNewDessertMealListener(new DessertMealListener());
    	myView.addCancelListener(new CancelListener());
    	myView.addConfirmPlanListener(new ConfirmListener());
    	myView.addDeletePlanListener(new DeleteListener());
    }
    
    class BreakfastSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getBreakfastList().getSelectedValue();
			database.addBreakFast(mealPlan, meal);
			
		}
	}
    
    class LunchSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getLunchList().getSelectedValue();
			database.addLunch(mealPlan, meal);
			
		}
	}
    class DinnerSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getDinnerList().getSelectedValue();
			database.addDinner(mealPlan, meal);
			
		}
	}
 
    class DessertSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getDessertList().getSelectedValue();
			database.addDessert(mealPlan, meal);
			
		}
	}
    
    class BreakfastMealListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			
		}
	}
    
    class LunchMealListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
		}
			
	}

	class DinnerMealListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
		}
				
	}
	
	class DessertMealListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
		}
			
	}
			
    class CancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("TRAINER")){
				VainFitnessUIMember aView = new VainFitnessUIMember();
				VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
			}
			else {
				VainFitnessUIAdmin aView = new VainFitnessUIAdmin();
				VainFitnessAdminControl control2 = new VainFitnessAdminControl(aView, database, type, id);
			}
			
		}
	}
    
    class ConfirmListener implements ActionListener {

    	@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("TRAINER")){
				VainFitnessUIMember aView = new VainFitnessUIMember();
				VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
			}
			else {
				VainFitnessUIAdmin aView = new VainFitnessUIAdmin();
				VainFitnessAdminControl control2 = new VainFitnessAdminControl(aView, database, type, id);
			}
			
		}
	}
    
    class DeleteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			DeleteLMPView aView = new DeleteLMPView();
			DeleteLMPControl control2 = new DeleteLMPControl();
			
		}
	}
}
