package database;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Client;
import model.NutritionGoal;
import model.PersonalInfo;
import model.Profile;
import model.WeightGoal;

public class DBConnect {
	private static DBConnect firstInstance = null;
	private ArrayList<Client> clientList;
	private Client client;
	private static Connection con;
	private static Statement st;
	private ResultSet rs;
	
	private DBConnect() {
		
	}
	// Query Commands
	// UPDATE `clients` SET `Gender` = 'Male' WHERE `clients`.`ID` = 0;
	
	
	public static DBConnect getInstance(String DB, String Username, String PW) {
		if (firstInstance == null) {
			
			try {
				firstInstance = new DBConnect();
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ DB ,Username,PW);
				st = con.createStatement();
				
			}
			catch(Exception ex) {
				System.out.println("Error: " + ex);
				return null;
			}
			
		}
		
		return firstInstance;
		
	}
	
	
	@SuppressWarnings("finally")
	public boolean insertClientData(String UserType,String Username, String Password,String Firstname, String Lastname, String Contact, String Email, int ID, double Height, String Gender, String DOB, String Address, double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage,double InitialWeight, double CurrentWeight, double GoalWeight) {
		String Trainer = "0";
		boolean result = false;
		/* INSERT INTO `clients` (`UserType`, `ID`, `Username`, `Password`, `FirstName`, `LastName`, `Contact`, `Email`, `Gender`, `Height`, `DOB`, `Address`, `Trainer`, `InitialWeight`, `CurrentWeight`, `GoalWeight`, `DCGoal`, `CarbPercentage`, `ProteinPercentage`, `FatPercentage`)
		 *  VALUES ('CLIENT', '0', 'Tester', 'Password', 'Test', 'ing', '123445', 'test@test.com', 'M', '173', '2010-11-06', 'tester land', '0', '100', '110', '120', '1000', '30', '40', '30');
		
		*/
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO clients (UserType, ID, Username, Password, FirstName, LastName, Contact, Email, Gender, Height, DOB, Address, Trainer, InitialWeight, CurrentWeight, GoalWeight, DCGoal, CarbPercentage,ProteinPercentage, FatPercentage) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
			stmt.setString(1,UserType); 				stmt.setString(11, DOB);
			stmt.setString(2, String.valueOf(ID));  	stmt.setString(12, Address);
			stmt.setString(3, Username); 				stmt.setString(13, Trainer);
			stmt.setString(4, Password);			 	stmt.setString(14, String.valueOf(InitialWeight));
			stmt.setString(5,Firstname);			 	stmt.setString(15, String.valueOf(CurrentWeight));
			stmt.setString(6, Lastname);			 	stmt.setString(16, String.valueOf(GoalWeight));
			stmt.setString(7, Contact); 				stmt.setString(17,String.valueOf(DailyGoal));
			stmt.setString(8, Email); 			     	stmt.setString(18,String.valueOf(CarbsPercentage));
			stmt.setString(9, Gender);			     	stmt.setString(19,String.valueOf(ProteinPercentage));
			stmt.setString(10, String.valueOf(Height)); stmt.setString(20,String.valueOf(FatPercentage));
			result = stmt.execute();
			System.out.println("Result - " + result);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			return result;
			
		}
		
		
	}
	
	public void getData() {
		try {
			String query = "select * from clients";
			rs = st.executeQuery(query);
			System.out.println("\nRecords from database:");
			
			while(rs.next()) {
				String userType = rs.getString("UserType");
				String userName = rs.getString("Username");
				String firstName = rs.getString("Firstname");
				String lastName = rs.getString("Lastname");
				String contact = rs.getString("Contact");
				
				System.out.println("UserType: " + userType);
				System.out.println("Username: " + userName);
				System.out.println("Firstname: " + firstName);
				System.out.println("Lastname: " + lastName);
				System.out.println("Contact: " + contact);
				System.out.println("-------------------------");
			}
			 
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void loadClientList() {
		try {
			clientList = new ArrayList<Client>();
			String query = "select * from clients";
			rs = st.executeQuery(query);
			System.out.println("\nRecords from database:");
			
			while(rs.next()) {
				String UserType = rs.getString("UserType");
				String UserName = rs.getString("Username");
				String Firstname = rs.getString("Firstname");
				String Lastname = rs.getString("Lastname");
				String Contact = rs.getString("Contact");
				String[] DOB = rs.getString("DOB").split("-",3);
				int Year = Integer.parseInt(DOB[0]);
				int Month = Integer.parseInt(DOB[0]);
				int Day = Integer.parseInt(DOB[0]);
				String Address = rs.getString("Address");
				String Trainer = rs.getString("Trainer");
				String Password = rs.getString("Password");
				double InitialWeight = Double.parseDouble(rs.getString("InitialWeight"));
				double CurrentWeight = Double.parseDouble(rs.getString("CurrentWeight"));
				double GoalWeight = Double.parseDouble(rs.getString("GoalWeight"));
				double DailyGoal = Double.parseDouble(rs.getString("DCGoal"));
				String Email = rs.getString("Email");
				int CarbsPercentage = Integer.parseInt(rs.getString("CarbPercentage"));
				String Gender = rs.getString("Gender");
				int ProteinPercentage= Integer.parseInt(rs.getString("ProteinPercentage"));
				double Height = Double.parseDouble(rs.getString("Height"));
				int FatPercentage = Integer.parseInt(rs.getString("FatPercentage"));
				
				client = new Client(UserType,UserName,Password,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage), new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
				
				clientList.add(client);
				
			}
			 
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public ArrayList<Client> getClientList(){
		return clientList;
	}

}
 