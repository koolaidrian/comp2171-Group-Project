package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import model.*;

/**
 * 
 */
public class VainFitnessUserControl {
	private VainFitnessUIUser myView;
	private VFDatabaseConnect database;
	private LogInView logInView;
	private String username;
	private String password;
	private int id=0;
	private String type = "USER";

    /**
     * Default constructor
     */
    public VainFitnessUserControl(VainFitnessUIUser aView, VFDatabaseConnect database) {
    	this.myView = aView;
    	this.database = database;
    	myView.getFrame().setVisible(true);
    	myView.addLogInListener(new LogInListener());
    	myView.addCheckCalListener(new CheckCalListener());
    	myView.addViewMealPlansListener(new ViewMealPlansListener());
    	myView.addCreateClientListener(new CreateClientListener());   	
    }

    class LogInListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			username = myView.getUsername();
			password = myView.getPassword();
			if (database.findUser(username)) {
				if (database.checkPassword(username, password)) {
					System.out.println("Successfully logged in!");
					logInView = new LogInView();
					logInView.getNotifButton().setText("Continue");
					logInView.getNotifLabel().setText("Successfully Logged In!");
					logInView.getFrame().setVisible(true);
					logInView.addButtonListener(new ContinueListener());
				}
				else {
					System.out.println("Password wrong!");
					logInView = new LogInView();
					logInView.getNotifButton().setText("Try Again");
					logInView.getNotifLabel().setText("Password Incorrect!");
					logInView.getFrame().setVisible(true);
					logInView.addButtonListener(new TryAgainListener());
				}
			}
			else {
				System.out.println("Username not found!");
				logInView = new LogInView();
				logInView.getNotifButton().setText("Try Again");
				logInView.getNotifLabel().setText("Username not found!");
				logInView.getFrame().setVisible(true);
				logInView.addButtonListener(new TryAgainListener());
			}
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
 
    class ContinueListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			logInView.getFrame().setVisible(false);
			myView.getFrame().setVisible(false);
			String type = database.getUserType(username);
			int id = database.getID(username);
			VainFitnessUIMember aView = new VainFitnessUIMember();
			VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
		}
	}
    
    class TryAgainListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			logInView.getFrame().setVisible(false);
		}
	}
}