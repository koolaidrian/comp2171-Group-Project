package model;

import java.util.ArrayList;

import GUI.DBConnect;

public class fitnessController {
	
	private Client newClient = null;
	private FitnessTrainer newTrainer = null;
	private Member currentUser = null;
	private ArrayList<Client> clients;
	private ArrayList<FitnessTrainer> trainers;
	private Administrator admin;
	private static fitnessController firstInstance = null;
	private DBConnect DB = null;
	private boolean DBaccess = false;
	
	private fitnessController() {
		DB = DBConnect.getInstance("vainfitness", "root", "");
		
		if(DB != null) {
		DB.loadClientList();
		DB.loadTrainerList();
		clients = DB.getClientList();
		trainers = DB.getTrainerList();
		admin = DB.getAdmin();
		DBaccess = true;
		System.out.println("Clients");
		showClientList();
		System.out.println("Trainers");
		showTrainerList();
		}
		
	}
	

	public static fitnessController getInstance() {
		if (firstInstance == null) {
			firstInstance = new fitnessController ();
			
		}
		
		return firstInstance;
	}
	
	public void setCurrentUser(Member member) {
		currentUser = member;
	}
	
	public boolean checkCurrentUser() {
		
		if( currentUser != null) {
			return true;
		}
		return false;
	}
	
	public boolean validUser(String username, String password) {
		
		for(Client c : clients) {
			if (c.getUsername().equals(username)) {
				if(c.getPassword().equals(password)) {
					currentUser = c;
					return true;
				}	
			}	
		}
		
		for(FitnessTrainer f : trainers) {
			if (f.getUsername().equals(username)) {
				if(f.getPassword().equals(password)) {
					currentUser = f;
					return true;
				}	
			}	
		}
		
		if (admin.getUsername().equals(username)) {
			if(admin.getPassword().equals(password)) {
				currentUser = admin;
				return true;
			}	
		}
		
		return false;
		
		
	}
	public Member getMember(String username) {
		for(Client c : clients) {
			if (c.getUsername().equals(username)) {
				return c;	
			}	
		}
		
		for(FitnessTrainer f : trainers) {
			if (f.getUsername().equals(username)) {
				return f;	
			}
		}
		
		if (admin.getUsername().equals(username)) {
			return admin;	
		}
		
		return null;
	}
	
	public String getType(String username) {
		
		for(Client c : clients) {
			if (c.getUsername().equals(username)) {
				return "client";	
			}	
		}
		
		for(FitnessTrainer f : trainers) {
			if (f.getUsername().equals(username)) {
				return "trainer";	
			}
		}
		
		if (admin.getUsername().equals(username)) {
			return "admin";	
		}
		
		return " ";
		
		
	}	
	
	public Member getCurrentUser() {
		return currentUser;
	}
	
	public void logoutUser() {
		if( currentUser != null) {
			currentUser = null;
		}
		
	}
	
											/*HANDLE CLIENT*/
	public Client getNewClient() {
		return newClient;
	}


	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address) {
		newClient = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address));
		//currentUser = newClient;
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage) {
		newClient = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage)));
		//currentUser = newClient;
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email,double Height, String Gender, int Day, int Month, int Year, String Address,double InitialWeight, double CurrentWeight, double GoalWeight) {
		newClient = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address, new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
		//currentUser = newClient;
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage,double InitialWeight, double CurrentWeight, double GoalWeight) {
		newClient = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage), new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
		//currentUser = newClient;
	}
	
	
	public void createClientProfile(String UserType,String Username, String Password,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage,double InitialWeight, double CurrentWeight, double GoalWeight) {
		newClient = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage), new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
		clients.add(newClient);
		//currentUser = newClient;
		//DB.insertClientData(UserType, Username, Password, Firstname, Lastname, Contact, Email, ((Client) currentUser).getId(), Height, Gender, ((Client) currentUser).getDOB(), Address, DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage, InitialWeight, CurrentWeight, GoalWeight)0;
		DB.insertClientData(UserType, Username, Password, Firstname, Lastname, Contact, Email, newClient.getId(), Height, Gender, newClient.getDOB(), Address, DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage, InitialWeight, CurrentWeight, GoalWeight);
	}
	
	
	
	public String getClientInfo() {
		
		return newClient.toString();
		
	}
	
	public String getClientUsername() {
		
		return currentUser.getUsername();
	}
	
	public void showClientList() {
		if(DBaccess) {
			
			clients.forEach((c -> System.out.println(c.getId() +"\n" + c.getUsername())));
			
		}else {
			System.out.println("Sorry Database down at the moment. Please try again later");
		}
	}
	
	
								/*HANDLE TRAINER*/

	public String getTrainerInfo() {
		
		return newTrainer.toString();
		
	}
	
	//might have to just have one called getMemberUsername()
	public String getTrainerUsername() {
		
		return currentUser.getUsername();
		
	}
	
	public void showTrainerList() {
		if(DBaccess) {
			
			trainers.forEach((f -> System.out.println(f.getID() +"\n" + f.getUsername())));
			
		}else {
			System.out.println("Sorry Database down at the moment. Please try again later");
		}
	}

	public void createTrainerProfile(String UserType, String username, String password, String firstname, String lastname,
			String contact, String email) {
		newTrainer = new FitnessTrainer(UserType,new PersonalInfo(firstname,lastname,contact,email));
		DB.insertTrainerData(UserType, username, password, firstname, lastname, contact, email);
		
	}
	
								/*HANDLE ADMIN*/
	
	public String getAdminInfo() {
		
		return admin.toString();
		
	}
	
	public Administrator getAdmin() {
		return admin;
	}


	//might have to just have one called getMemberUsername()
	public String getAdminUsername() {
			
		return currentUser.getUsername();
			
	}

	
}
