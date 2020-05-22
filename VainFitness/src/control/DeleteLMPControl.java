package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.VFDatabaseConnect;
import view.DeleteLMPView;
import view.VainFitnessUIAdmin;
import view.VainFitnessUIMember;

public class DeleteLMPControl {
	private DeleteLMPView myView;
	VFDatabaseConnect database;
	String planName;
	String type;
	int id;

	/**
     * Default constructor
     */
	public DeleteLMPControl(DeleteLMPView aView, VFDatabaseConnect database, String planName, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.planName = planName;
		this.type = type;
		this.id = id;
		myView.getFrame().setVisible(true);
		myView.addCancelButtonListener(new CancelListener());
		myView.addDeleteButtonListener(new DeleteListener());
	}
	
	class CancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			if (type.equals("TRAINER")) {
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
			database.deleteLMP(planName);
			if (type.equals("TRAINER")) {
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
