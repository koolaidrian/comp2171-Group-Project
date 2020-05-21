package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.VFDatabaseConnect;
import view.ViewLMPList;
import view.ViewLMPUser;

public class ViewLMPUserControl {

	private ViewLMPUser myView;
	private VFDatabaseConnect database;
	private String planName;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public ViewLMPUserControl(ViewLMPUser aView, VFDatabaseConnect database, String planName, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.planName = planName;
		this.type = type;
		this.id = id;
		myView.getFrame().setVisible(true);
		myView.addBackListener(new BackListener());
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
