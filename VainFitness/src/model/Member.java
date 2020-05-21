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

    /**
     * 
     */
    private int id;

    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}