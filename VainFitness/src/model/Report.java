package model;

import java.util.*;

/**
 * 
 */
public class Report {
	
    private Client uneditableClient;
    private Calendar date;

    /**
     * Default constructor
     */
    public Report(Client client, int day, int month, int year) {
    	this.uneditableClient = client;
    	this.date.getInstance();
    	setDate(day, month, year);
    }

    public void setDate(int day, int month, int year) {
    	this.date.set(year, month, day);
    }
    
    public Calendar getDate() {
    	return date;
    }
    
    public Client getClient() {
    	return uneditableClient;
    }
    
    public String clientTostring() {
    	return uneditableClient.toString();
    }
    
    public String dateToString() {
    	return (date.DATE + "/" + date.MONTH + "/" + date.YEAR);
    }
    
    public String toString() {
    	return dateToString() + "\n" +  clientTostring();
    }

}