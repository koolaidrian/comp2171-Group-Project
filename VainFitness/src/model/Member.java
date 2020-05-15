package model;

import java.util.*;

/**
 * 
 */
public class Member extends User {

    /**
     * Default constructor
     */
    public Member() {
    	super();
    }
    
    public Member(String Usertype) {
    	super(Usertype);
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private PersonalInfo info;



}