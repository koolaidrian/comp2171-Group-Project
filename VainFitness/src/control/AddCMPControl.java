package control;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import view.AddCMPView;
import model.CustomMealPlan;
import model.VFDatabaseConnect;
import model.Client;;

/**
 * 
 */
public class AddCMPControl {
	private AddCMPView view;
	private CustomMealPlan cmp;
	private VFDatabaseConnect database;
	private Client client;
	
    /**
     * Default constructor
     */
    public AddCMPControl(AddCMPView view, VFDatabaseConnect database, Client client) {
    	this.view = view;
    	this.database = database; 
    	this.client = client;
    	view.addElemListModel("hello");
    	view.addElemListModel("this");
    	view.addElemListModel("is");
    	view.addElemListModel("a");
    	view.addElemListModel("test");
    	//view.getList().setModel(view.getListModel());
    	view.getFrame().setVisible(true);
    	this.view.addAddPlanListener(new PlanListener());
    	
    }
    
    public void addPlans() {
    	ArrayList<String> plans = database.getClientCustomMealPlans(client);
    }
    
    class PlanListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String mealPlanName = " ";
			
			try {
				mealPlanName = (String) view.getList().getSelectedValue();
				if (database.findMealPlan(mealPlanName)) {
					client.addMealPlan(new CustomMealPlan());
				}
			} catch(Exception e) {
				System.out.println("Error: " + e);
			}
		}
	}
    

}