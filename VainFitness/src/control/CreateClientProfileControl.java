package control;

import java.util.*;

import model.VFDatabaseConnect;
import view.CreateClientProfileView;

/**
 * 
 */
public class CreateClientProfileControl {
	private CreateClientProfileView myView;
	private VFDatabaseConnect database;

    /**
     * Default constructor
     */
    public CreateClientProfileControl(CreateClientProfileView aView, VFDatabaseConnect database) {
    	this.myView = aView;
    	this.database = database;
    }

}