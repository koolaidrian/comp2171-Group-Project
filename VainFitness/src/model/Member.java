package model;

import java.util.*;

/**
 * 
 */
public class Member extends User {
	private PersonalInfo myPersonalInfo;
	private String username;
	private String password;
    //private PersonalInfo info;
	
    /**
     * Default constructor
     */
    public Member() {
    	super();
    }
    
    public Member(String Usertype, PersonalInfo PI) {
    	super(Usertype);
    	myPersonalInfo = PI;
    }
    
    public Member(String Usertype,String userName, String Password, PersonalInfo PI) {
    	super(Usertype);
    	this.username = userName;
    	this.password = Password;
    	myPersonalInfo = PI;
    }

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  


}