package model;

import java.util.*;

/**
 * 
 */
public class Administrator extends Member {
	private int id = 0;

    /**
     * Default constructor
     */
    public Administrator(String Usertype, String Username, String Password, PersonalInfo PI) {
    	super(Usertype, Username, Password, PI);
    }

    public int getID() {
    	return id;
    }
    
    public String getIDString() {
    	
    	return "" + id;
    }
    
    public String toString() {
    	return super.toString();
    }
}