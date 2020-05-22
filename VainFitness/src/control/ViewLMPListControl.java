package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import model.VFDatabaseConnect;
import view.VainFitnessUIAdmin;
import view.VainFitnessUIMember;
import view.VainFitnessUIUser;
import view.ViewLMP;
import view.ViewLMPClient;
import view.ViewLMPList;
import view.ViewLMPUser;

/**
 * 
 */
public class ViewLMPListControl {
	private ViewLMPList myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;

    /**
     * Default constructor
     */
    public ViewLMPListControl(ViewLMPList aView, VFDatabaseConnect database, String type, int id) {
    	this.myView = aView;
    	this.database = database;
    	this.type = type;
    	ArrayList<String> lmps = database.getLMPs();
    	for (String s : lmps) {
    		myView.addElemListModel(s);
    	}
    	myView.getFrame().setVisible(true);
    	myView.addViewListener(new ViewListener());
    	myView.addBackListener(new BackListener());
    }
    
    class ViewListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			String mealPlanName = " ";
			try {
				mealPlanName = (String) myView.getList().getSelectedValue();
				if (database.findMealPlan(mealPlanName)){
					if (type.equals("TRAINER") || type.equals("ADMIN")) {
						ViewLMP aView = new ViewLMP();
						ViewLMPControl control2 = new ViewLMPControl(aView, database, mealPlanName, type, id);
					}
					else if (type.equals("CLIENT")) {
						ViewLMPClient aView = new ViewLMPClient();
						ViewLMPClientControl control2 = new ViewLMPClientControl(aView, database, mealPlanName, type, id);
					}
					else {
						ViewLMPUser aView = new ViewLMPUser();
						ViewLMPUserControl control2 = new ViewLMPUserControl(aView, database, mealPlanName, type, id);
					}
				}
			} catch(Exception err) {
				System.out.println("Error: " + err);
			}
		}
	}
    
    class BackListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("TRAINER")) {
				VainFitnessUIMember aView = new VainFitnessUIMember();
				VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
			} else if (type.equals("CLIENT")) {
				VainFitnessUIMember aView = new VainFitnessUIMember();
				VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
			} else if (type.equals("ADMIN")) {
				VainFitnessUIAdmin aView = new VainFitnessUIAdmin();
				VainFitnessAdminControl control2 = new VainFitnessAdminControl(aView, database, type, id);
			}else {
				VainFitnessUIUser aView = new VainFitnessUIUser();
				VainFitnessUserControl control2 = new VainFitnessUserControl(aView, database);
			}
		}
	}

}