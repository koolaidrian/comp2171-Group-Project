package control;

import model.VFDatabaseConnect;
import view.ClientMainView;

public class ClientMainControl {
	
	private ClientMainView myView;
	private VFDatabaseConnect database;
	private String type;
	private int id;
	
	/**
     * Default constructor
     */
	public ClientMainControl(ClientMainView aView, VFDatabaseConnect database, String type, int id) {
		this.myView = aView;
		this.database = database;
		this.type = type;
		this.id = id;
	}
}
