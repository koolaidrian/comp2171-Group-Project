package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.VFDatabaseConnect;
import view.CreateMealView;
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
	String breakfast;
	String lunch;
	String dinner;
	
	/**
     * Default constructor
     */
    public EditLMPControl(EditLMPView aView, VFDatabaseConnect database, String mealPlan, String type, int id) {
    	this.myView = aView;
    	this.database = database;
    	this.type = type;
    	this.id = id;
    	this.mealPlan = mealPlan;
    	ArrayList<String> lmps = database.getMeals();
    	for (String meal: lmps) {
    		myView.addBreakfastPlans(meal);
    		myView.addLunchPlans(meal);
    		myView.addDinnerPlans(meal);
    		myView.addDessertPlans(meal);
    	}
    	breakfast = database.getBreakfast(mealPlan);
    	lunch = database.getLunch(mealPlan);
    	dinner = database.getDinner(mealPlan);
    	myView.getBreakfastList().setSelectedValue(breakfast, true);
    	myView.getLunchList().setSelectedValue(lunch, true);
    	myView.getDinnerList().setSelectedValue(dinner, true);
    	myView.getFrame().setVisible(true);
    	myView.addBreakfastSaveListener(new BreakfastSaveListener());
    	myView.addLunchSaveListener(new LunchSaveListener());
    	myView.addDinnerSaveListener(new DinnerSaveListener());
    	myView.addNewBreakfastMealListener(new BreakfastMealListener());
    	myView.addNewLunchMealListener(new LunchMealListener());
    	myView.addNewDinnerMealListener(new DinnerMealListener());
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
			EditLMPView aView = new EditLMPView();
			EditLMPControl control2 = new EditLMPControl(aView, database, mealPlan, type, id);
			
		}
	}
    class LunchSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getLunchList().getSelectedValue();
			database.addLunch(mealPlan, meal);
			EditLMPView aView = new EditLMPView();
			EditLMPControl control2 = new EditLMPControl(aView, database, mealPlan, type, id);
			
		}
	} 
    class DinnerSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String meal = (String) myView.getDinnerList().getSelectedValue();
			database.addDinner(mealPlan, meal);
			EditLMPView aView = new EditLMPView();
			EditLMPControl control2 = new EditLMPControl(aView, database, mealPlan, type, id);
			
		}
	}
    
    class BreakfastMealListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			CreateMealView aView = new CreateMealView();
			CreateMealControl control2 = new CreateMealControl();
			
		}
	} 
    class LunchMealListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			CreateMealView aView = new CreateMealView();
			CreateMealControl control2 = new CreateMealControl();
		}
			
	}
	class DinnerMealListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			CreateMealView aView = new CreateMealView();
			CreateMealControl control2 = new CreateMealControl();
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
    		if ((breakfast.equals((String) myView.getBreakfastList().getSelectedValue())) && (lunch.equals((String) myView.getLunchList().getSelectedValue())) && (dinner.equals((String) myView.getDinnerList().getSelectedValue()))) {
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
	}    
    class DeleteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			DeleteLMPView aView = new DeleteLMPView();
			DeleteLMPControl control2 = new DeleteLMPControl(aView, database, mealPlan, type, id);
			
		}
	}
}
