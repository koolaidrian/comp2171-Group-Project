package model;

import java.sql.*;
import java.util.*;

/**
 * 
 */
public class VFDatabaseConnect {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
    /**
     * Default constructor
     */
    public VFDatabaseConnect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vainfitness?serverTimezone=UTC","root","");
			st = conn.createStatement();
			
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		
	}
    
                                                  /*CHECKING DATA*/
    
    public boolean findMealPlan(String name) {
		try {
			String query = "Select * from mealplans";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String name2 = rs.getString("Name");
				if (name2.equals(name)) {
					System.out.println("Name: " + name2);
					return true;
				}
			}
			return false;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}

    public boolean findUser(String username) {
    	try {
			String query = "Select * from users";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String username2 = rs.getString("username");
				if (username2.equals(username)) {
					System.out.println("Username: " + username2);
					return true;
				}
			}
			return false;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
    }
    
    public boolean checkPassword(String username, String password) {
    	try {
    		String query = "Select * from users";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String username2 = rs.getString("username");
				if (username2.equals(username)) {
					System.out.println("Username: " + username2);
					String password2 = rs.getString("password");
					if (password2.equals(password)) {
						return true;
					}
				}
			}
			return false;
    	}
    	catch(Exception e) {
    		System.out.println("Error: " + e);
    		return false;
    	}
    }
    
    
    
    												/*RETRIEVING DATA*/
    
	public ArrayList<String> getClientCustomMealPlans(int id) {
		try {
			ArrayList<String> plans = new ArrayList<String>(); 
			String query = "Select * from mealplans";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				int recorded_id = rs.getInt("CreatorID");
				if (recorded_id == id) {
					String name = rs.getString("name");
					plans.add(name);
				}
			}
			return plans;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
    
    public String getUserType(String username) {
    	try {
    		String query = "Select * from users";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String username2 = rs.getString("username");
				if (username2.equals(username)) {
					System.out.println("Username: " + username2);
					String type = rs.getString("type");
						return type;
				}
			}
			return null;
    	}
    	catch(Exception e) {
    		System.out.println("Error: " + e);
    		return null;
    	}
    }

    public int getID(String username) {
    	try {
    		String query = "Select * from users";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String username2 = rs.getString("username");
				if (username2.equals(username)) {
					System.out.println("Username: " + username2);
					int id = rs.getInt("id");
					return id;
				}
			}
			System.out.println("Not found");
			return 0;
    	}
    	catch(Exception e) {
    		System.out.println("Error: " + e);
    		return 0;
    	}
    }
    
    public ArrayList<String> getLMPs() {
		try {
			ArrayList<String> plans = new ArrayList<String>(); 
			String query = "Select * from mealplans";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String type = rs.getString("Type");
				if (type.equals("LOCALIZED")){
					String name = rs.getString("Name");
					plans.add(name);
				}
			}
			return plans;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}

	public ArrayList<String> getMeals() {
		try {
			ArrayList<String> meals = new ArrayList<String>(); 
			String query = "Select * from meals";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String name = rs.getString("Name");
				meals.add(name);
			}
			return meals;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	public ArrayList<String> getFoodItems() {
		try {
			ArrayList<String> fooditems = new ArrayList<String>(); 
			String query = "Select * from fooditems";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String name = rs.getString("Name");
				fooditems.add(name);
			}
			return fooditems;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	public ArrayList<String> getClients() {
		try {
			ArrayList<String> clients = new ArrayList<String>(); 
			String query = "Select * from clients";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String name = rs.getString("Name");
				clients.add(name);
			}
			return clients;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	public ArrayList<String> getTrainers() {
		try {
			ArrayList<String> trainers = new ArrayList<String>(); 
			String query = "Select * from trainers";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				String name = rs.getString("Name");
				trainers.add(name);
			}
			return trainers;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	public ArrayList<String> getTrainerMealPlans(int id) {
		try {
			ArrayList<String> plans = new ArrayList<String>(); 
			String query = "Select * from mealplans";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				int recorded_id = rs.getInt("CreatorID");
				if (recorded_id == id) {
					String name = rs.getString("name");
					plans.add(name);
				}
			}
			return plans;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	public ArrayList<String> getClientMealPlans(int id) {
		try {
			ArrayList<String> plans = new ArrayList<String>(); 
			String query = "Select * from client_plans";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while (rs.next()) {
				int recorded_id = rs.getInt("id");
				if (recorded_id == id) {
					String name = rs.getString("name");
					plans.add(name);
				}
			}
			return plans;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return null;
		}
	}
	
	
	
	
													/*INSERTING DATA*/
	
	public boolean addBreakFast(String mealplan, String meal) {
		try {
			String query = "update mealplans set Breakfast= '"+meal+"' where Name= '"+mealplan+"' ";
			rs = st.executeQuery(query);
			return true;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}
	
	public boolean addLunch(String mealplan, String meal) {
		try {
			String query = "update mealplans set Lunch= '"+meal+"' where Name= '"+mealplan+"' ";
			rs = st.executeQuery(query);
			return true;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}
	
	public boolean addDinner(String mealplan, String meal) {
		try {
			String query = "update mealplans set Dinner= '"+meal+"' where Name= '"+mealplan+"' ";
			rs = st.executeQuery(query);
			return true;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}
	
	public boolean addDessert(String mealplan, String meal) {
		try {
			String query = "update mealplans set Dessert= '"+meal+"' where Name= '"+mealplan+"' ";
			rs = st.executeQuery(query);
			return true;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}
	
	public boolean addPlantoClient(String planName, int id) {
		try {
			String query = "Insert into client_plans (id, planname) values ('"+id+"', '"+planName+"')";
			rs = st.executeQuery(query);
			System.out.println("Successful");
			return true;
		} catch(Exception e) {
			System.out.println("Error: " + e);
			return false;
		}
	}

	
	
	
	
													/*DELETING DATA*/
	public void deleteLMP(String planName) {
		// TODO Auto-generated method stub
		
	}
}