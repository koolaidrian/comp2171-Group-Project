package model;

public class fitnessController {
	
	private Client clientDemo;
	private static fitnessController firstInstance = null;
	
	
	private fitnessController() {
		
	}
	
	
	public static fitnessController getInstance() {
		if (firstInstance == null) {
			firstInstance = new fitnessController ();
		}
		
		return firstInstance;
	}
	
	
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address) {
		clientDemo = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address));
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage) {
		clientDemo = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage)));
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email,double Height, String Gender, int Day, int Month, int Year, String Address,double InitialWeight, double CurrentWeight, double GoalWeight) {
		clientDemo = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address, new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
	}
	
	public void createClientProfile(String UserType,String Firstname,String Lastname,String Contact, String Email, double Height, String Gender, int Day, int Month, int Year, String Address, Double DailyGoal, int CarbsPercentage, int ProteinPercentage, int FatPercentage,double InitialWeight, double CurrentWeight, double GoalWeight) {
		clientDemo = new Client(UserType,new PersonalInfo(Firstname,Lastname,Contact,Email),new Profile(Height,Gender,Year,Month,Day,Address,new NutritionGoal(DailyGoal, CarbsPercentage, ProteinPercentage, FatPercentage), new WeightGoal(InitialWeight, CurrentWeight, GoalWeight)));
	}
	
	
	public String getClientInfo() {
		
		return clientDemo.toString();
		
	}
	
}
