package model;

import java.util.*;

/**
 * 
 */
public class User {
	
	private UserType type;

    /**
     * Default constructor
     */
    public User(String userType) {
    	if(userType.equalsIgnoreCase("Client")) {
    		this.type = UserType.CLIENT;
    	}else if (userType.equalsIgnoreCase("Admin")) {
    		this.type = UserType.ADMIN;
    	}else if (userType.equalsIgnoreCase("Trainer")) {
    		this.type = UserType.TRAINER;
    	}else {
    		this.type = UserType.GUEST;
    	}
    	
    
    }
    
    public User() {
    	this.type = UserType.GUEST;
    }
    
    
    public String getUserType() {
    	String type = "";
    	
    	switch(this.type) {
    	case CLIENT:
    		type = "Client";
    		break;
    	case ADMIN:
    		type = "Admin";
    		break;
    		
    	case TRAINER:
    		type = "Trainer";
    		break;
    	
    	case GUEST:
    		type = "Guest";
    		break;
    	
    	}
    	
    	return type;
    	
    }

    
    public String toString() {
    	String text = "";
    	
    	text += "\n----------------\nUserType - " + getUserType() + "\n----------------\n";
    	
    	return text;
    }
    /**
     * 
     */
    
    /**
     * 
     */


}