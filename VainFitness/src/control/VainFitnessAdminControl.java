package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.VFDatabaseConnect;
import view.ClientMainView;
import view.CreateClientProfileView;
import view.FitnessTrainerMainView;
import view.LogOutView;
import view.VainFitnessUIAdmin;
import view.ViewLMPList;

public class VainFitnessAdminControl {

	private VainFitnessUIAdmin myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public VainFitnessAdminControl(VainFitnessUIAdmin aView, VFDatabaseConnect database, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.type = type;
		this.id = id;
		myView.getFrame().setVisible(true);
		myView.addLogOutListener(new LogOutListener());
		myView.addCheckCalListener(new CheckCalListener());
		myView.addViewMealPlansListener(new ViewMealPlansListener());
		myView.addViewClientsListener(new ViewClientsListener());
		myView.addViewTrainersListener(new ViewTrainersListener());
		myView.addMyBusinessListener(new ViewMyBusinessListener());
	}
	
	class LogOutListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			LogOutView aView = new LogOutView();
			LogOutControl control2 = new LogOutControl(aView, database, type, id);
		}
	}
	    
	class CheckCalListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	    
	class ViewMealPlansListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			ViewLMPList aView = new ViewLMPList();
			ViewLMPListControl control2 = new ViewLMPListControl(aView, database, type, id);
		}
	}
	    
	class ViewClientsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			ViewClientList aView = new ViewClientList();
			ViewClientListControl control2 = new ViewClientListeControl(aView, database);
		}
	}
	
	class ViewTrainersListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			ViewTrainerList aView = new ViewTrainerList();
			ViewTrainerListControl control2 = new ViewTrainerListControl(aView, database);
		}
	}
	
	class ViewMyBusinessListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			AdminMainView aView = new AdminMainView();
			AdminMainControl control2 = new AdminMainControl(aView, database, type, id);
		}
	}
}
