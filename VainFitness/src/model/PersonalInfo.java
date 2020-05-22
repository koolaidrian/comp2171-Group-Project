package model;

import java.util.*;

/**
 * 
 */
public class PersonalInfo {

    /**
     * Default constructor
     */
    private String firstname;
    private String lastname;
    private String contact;
    private String email;
    //private Gender gender;

    public PersonalInfo(String Firstname,String Lastname,String Contact,String Email) {
    	this.firstname = Firstname;
    	this.lastname = Lastname;
    	this.contact = Contact;
    	this.email = Email;
    	
    }
    
    
    public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}





}