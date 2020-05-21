package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import model.VFDatabaseConnect;
import view.LogOutView;
import view.VainFitnessUIAdmin;
import view.VainFitnessUIMember;
import view.VainFitnessUIUser;

/**
 * 
 */
public class LogOutControl {
	private LogOutView myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;

    /**
     * Default constructor
     */
    public LogOutControl(LogOutView aView, VFDatabaseConnect database, String type, int id) {
    	this.myView = aView;
    	this.database = database;
    	this.type = type;
    	this.id = id;
    	myView.getFrame().setVisible(true);
    	myView.addLogOutListener(new LogOutListener());
    	myView.addCancelListener(new CancelListener());
    }
    
    class LogOutListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			VainFitnessUIUser aView = new VainFitnessUIUser();
			VainFitnessUserControl control2 = new VainFitnessUserControl(aView, database);
			
		}
	}
    
    class CancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("ADMIN")) {
				VainFitnessUIAdmin aView = new VainFitnessUIAdmin();
				VainFitnessAdminControl control2 = new VainFitnessAdminControl(aView, database, type, id);
			}else {
				VainFitnessUIMember aView = new VainFitnessUIMember();
				VainFitnessMemberControl control2 = new VainFitnessMemberControl(aView, database, type, id);
			}
		}
	}

}