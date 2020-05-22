package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.VFDatabaseConnect;
import view.EditLMPView;
import view.ViewLMP;
import view.ViewLMPList;

public class ViewLMPControl {

	private ViewLMP myView;
	private VFDatabaseConnect database;
	String planName;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public ViewLMPControl(ViewLMP aView, VFDatabaseConnect database, String planName, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.planName = planName;
		this.type = type;
		this.id = id;
		myView.getFrame().setVisible(true);
		myView.addEditListener(new EditListener());
		myView.addBackListener(new BackListener());
	}
	
	class EditListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			EditLMPView aView = new EditLMPView();
			EditLMPControl control2 = new EditLMPControl(aView, database, planName, type, id);
		}
	}
	
    class BackListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myView.getFrame().setVisible(false);
			ViewLMPList aView = new ViewLMPList();
			ViewLMPListControl control2 = new ViewLMPListControl(aView, database, type, id);
		}
	}
}
