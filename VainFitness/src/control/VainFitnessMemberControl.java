package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.VFDatabaseConnect;
import view.*;

public class VainFitnessMemberControl {

	private VainFitnessUIMember myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public VainFitnessMemberControl(VainFitnessUIMember aView, VFDatabaseConnect database, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.type = type;
		this.id = id;
		myView.getFrame().setVisible(true);
		myView.addLogOutListener(new LogOutListener());
		myView.addCheckCalListener(new CheckCalListener());
		myView.addViewMealPlansListener(new ViewMealPlansListener());
		myView.addCreateClientListener(new CreateClientListener());
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
	    
	class CreateClientListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			CreateClientProfileView aView = new CreateClientProfileView();
			CreateClientProfileControl control2 = new CreateClientProfileControl(aView, database);
		}
	}
	
	class ViewMyBusinessListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("CLIENT")) {
				ClientMainView aView = new ClientMainView();
				ClientMainControl control2 = new ClientMainControl(aView, database, type, id);
			}
			else if (type.equals("TRAINER")) {
				FitnessTrainerMainView aView = new FitnessTrainerMainView();
				FitnessTrainerMainControl control2 = new FitnessTrainerMainControl(aView, database, type, id);
			}
			else {
				//some kinda error
			}
		}
	}

}
