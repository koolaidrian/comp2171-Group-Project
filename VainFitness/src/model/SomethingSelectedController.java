package model;

import java.util.ArrayList;

import database.DBConnect;

public class SomethingSelectedController {
	private Client selectedClient;
	private FitnessTrainer selectedTrainer;
	private MealPlan selectedMP;
	private Meal selectedM;
	private Meal selectedB;
	private Meal selectedL;
	private Meal selectedD;
	private ArrayList<Client> clients;
	private ArrayList<FitnessTrainer> trainers;
	private ArrayList<MealPlan> lmps;
	private ArrayList<Meal> ms;
	private static SomethingSelectedController firstInstance = null;
	private DBConnect DB = null;
	private boolean DBaccess = false;

	private SomethingSelectedController() {
		DB = DBConnect.getInstance("vainfitness", "root", "");
		
		if(DB != null) {
		DB.loadClientList();
		DB.loadTrainerList();
		DB.loadLMPList();
		DB.loadMList();
		clients = DB.getClientList();
		trainers = DB.getTrainerList();
		lmps = DB.getLMPList();
		ms = DB.getMList();
		DBaccess = true;
		showTrainerList();
		}else {
			System.out.println("DB not connected");
		}
		
	}
	
	public void showTrainerList() {
		if(DBaccess) {
			
			trainers.forEach((f -> System.out.println(f.getID() +"\n" + f.getUsername())));
			
		}else {
			System.out.println("Sorry Database down at the moment. Please try again later");
		}
	}
	
	public void showClientList() {
		if(DBaccess) {
			
			clients.forEach((c -> System.out.println(c.getId() +"\n" + c.getUsername())));
			
		}else {
			System.out.println("Sorry Database down at the moment. Please try again later");
		}
	}
	
	public static SomethingSelectedController getInstance() {
		if (firstInstance == null) {
			firstInstance = new SomethingSelectedController ();
			
		}
		
		return firstInstance;
	}


	public Client getSelectedClient() {
		return selectedClient;
	}


	public void setSelectedClient(Client selectedClient) {
		this.selectedClient = selectedClient;
	}


	public FitnessTrainer getSelectedTrainer() {
		return selectedTrainer;
	}


	public void setSelectedTrainer(FitnessTrainer selectedTrainer) {
		this.selectedTrainer = selectedTrainer;
	}


	public MealPlan getSelectedMP() {
		return selectedMP;
	}


	public void setSelectedMP(String selectedMP) {
		for (MealPlan m: lmps) {
			if (m.getName().equals(selectedMP)){
				this.selectedMP = m;
				this.selectedB = m.getBreakfast();
				this.selectedL = m.getLunch();
				this.selectedD = m.getDinner();
			}
		}
	}

	public Meal getSelectedM() {
		return selectedM;
	}


	public void setSelectedM(String selectedM) {
		for (Meal m: ms) {
			if (m.getName().equals(selectedM)){
				this.selectedM = m;
			}
		}
	}
	
	public Meal getSelectedB() {
		return selectedB;
	}


	public void setSelectedB(String selectedB) {
		for (Meal m: ms) {
			if (m.getName().equals(selectedB)){
				this.selectedB = m;
			}
		}
	}
	
	public Meal getSelectedL() {
		return selectedL;
	}


	public void setSelectedL(String selectedL) {
		for (Meal m: ms) {
			if (m.getName().equals(selectedL)){
				this.selectedL = m;
			}
		}
	}
	
	public Meal getSelectedD() {
		return selectedD;
	}


	public void setSelectedD(String selectedD) {
		for (Meal m: ms) {
			if (m.getName().equals(selectedD)){
				this.selectedD = m;
			}
		}
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public ArrayList<String> getClientNames(){
		ArrayList<String> names = new ArrayList<String>();
		for (Client c: clients) {
			names.add(c.getUsername());
			System.out.println(c.getUsername());
		}
		return names;
	}

	public ArrayList<FitnessTrainer> getTrainers() {
		return trainers;
	}
	
	public ArrayList<String> getTrainerNames(){
		ArrayList<String> names = new ArrayList<String>();
		for (FitnessTrainer t: trainers) {
			names.add(t.getUsername());
		}
		return names;
	}
	
	public ArrayList<MealPlan> getMealPlans() {
		return lmps;
	}
	
	public ArrayList<String> getMealPlanNames(){
		ArrayList<String> names = new ArrayList<String>();
		for (MealPlan p: lmps) {
			names.add(p.getName());
		}
		return names;
	}
	public ArrayList<Meal> getMeals() {
		return ms;
	}
	
	public ArrayList<String> getMealNames(){
		ArrayList<String> names = new ArrayList<String>();
		for (Meal p: ms) {
			names.add(p.getName());
		}
		return names;
	}

	public void updateBreakfast() {
		DB.updateBreakfast(selectedMP.getName(), selectedB.getName());
	}
	
	public void updateLunch() {
		DB.updateLunch(selectedMP.getName(), selectedL.getName());
	}

	public void updateDinner() {
		DB.updateDinner(selectedMP.getName(), selectedD.getName());
	}
	
	public void deleteSelectedMP() {
		DB.deletePlan(selectedMP.getName());
	}
}
