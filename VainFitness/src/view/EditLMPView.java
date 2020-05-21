package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * 
 */
public class EditLMPView {

	private JFrame frame;
	private JButton confirmButton;
	private JButton cancelButton;
	private JButton dessertSaveButton;
	private JButton dinnerSaveButton;
	private JButton lunchSaveButton;
	private JButton breakfastSaveButton;
	private JButton newBreakfastMealButton;
	private JButton newLunchMealButton;
	private JButton newDinnerMealButton;
	private JButton newDessertMealButton;
	private JButton deleteButton;
	private JList breakfastList;
	private JList lunchList;
	private JList dinnerList;
	private JList dessertList;
	private DefaultListModel breakfastListModel;
	private DefaultListModel lunchListModel;
	private DefaultListModel dinnerListModel;
	private DefaultListModel dessertListModel;

	/**
	 * Create the application.
	 */
	public EditLMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 204);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Breakfast", null, panel, null);
		panel.setLayout(null);
		
		breakfastSaveButton = new JButton("Save");
		breakfastSaveButton.setBounds(310, 142, 89, 23);
		panel.add(breakfastSaveButton);
		
		newBreakfastMealButton = new JButton("Create New Meal");
		newBreakfastMealButton.setBounds(174, 142, 126, 23);
		panel.add(newBreakfastMealButton);
		
		breakfastList = new JList();
		breakfastList.setModel(breakfastListModel);
		breakfastList.setBounds(10, 11, 389, 120);
		panel.add(breakfastList);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Lunch", null, panel_1, null);
		panel_1.setLayout(null);
		
		lunchSaveButton = new JButton("Save");
		lunchSaveButton.setBounds(310, 142, 89, 23);
		panel_1.add(lunchSaveButton);
		
		newLunchMealButton = new JButton("Create New Meal");
		newLunchMealButton.setBounds(174, 142, 126, 23);
		panel_1.add(newLunchMealButton);
		
		lunchList = new JList();
		lunchList.setModel(lunchListModel);
		lunchList.setBounds(10, 11, 389, 120);
		panel_1.add(lunchList);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dinner", null, panel_2, null);
		panel_2.setLayout(null);
		
		dinnerSaveButton = new JButton("Save");
		dinnerSaveButton.setBounds(310, 142, 89, 23);
		panel_2.add(dinnerSaveButton);
		
		newDinnerMealButton = new JButton("Create New Meal");
		newDinnerMealButton.setBounds(174, 142, 126, 23);
		panel_2.add(newDinnerMealButton);
		
		dinnerList = new JList();
		dinnerList.setModel(dinnerListModel);
		dinnerList.setBounds(10, 11, 389, 120);
		panel_2.add(dinnerList);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Snack/Dessert", null, panel_3, null);
		panel_3.setLayout(null);
		
		dessertSaveButton = new JButton("Save");
		dessertSaveButton.setBounds(310, 142, 89, 23);
		panel_3.add(dessertSaveButton);
		
		newDessertMealButton = new JButton("Create New Meal");
		newDessertMealButton.setBounds(174, 142, 126, 23);
		panel_3.add(newDessertMealButton);
		
		dessertList = new JList();
		dessertList.setModel(dessertListModel);
		dessertList.setBounds(10, 11, 389, 120);
		panel_3.add(dessertList);
		
		confirmButton = new JButton("Confirm");
		confirmButton.setBounds(185, 226, 89, 23);
		frame.getContentPane().add(confirmButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(284, 226, 89, 23);
		frame.getContentPane().add(cancelButton);
		
		deleteButton = new JButton("Delete Plan");
		deleteButton.setBounds(86, 226, 89, 23);
		frame.getContentPane().add(deleteButton);
	}

	public JList getBreakfastList() {
		return breakfastList;
	}
	public JList getLunchList() {
		return lunchList;
	}
	public JList getDinnerList() {
		return dinnerList;
	}
	public JList getDessertList() {
		return dessertList;
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public void addBreakfastPlans(String text) {
		this.breakfastListModel.addElement(text);
	}
	public void addLunchPlans(String text) {
		this.lunchListModel.addElement(text);
	}
	public void addDinnerPlans(String text) {
		this.dinnerListModel.addElement(text);
	}
	public void addDessertPlans(String text) {
		this.dessertListModel.addElement(text);		
	}
	
	public void addBreakfastSaveListener(ActionListener listenForSaveBreakfast) {
		breakfastSaveButton.addActionListener(listenForSaveBreakfast);
	}
	public void addLunchSaveListener(ActionListener listenForSaveLunch) {
		lunchSaveButton.addActionListener(listenForSaveLunch);
	}
	public void addDinnerSaveListener(ActionListener listenForSaveDinner) {
		dinnerSaveButton.addActionListener(listenForSaveDinner);
	}
	public void addDessertSaveListener(ActionListener listenForSaveDessert) {
		dessertSaveButton.addActionListener(listenForSaveDessert);
	}

	public void addNewBreakfastMealListener(ActionListener listenForNewMeal) {
		newBreakfastMealButton.addActionListener(listenForNewMeal);
	}
	public void addNewLunchMealListener(ActionListener listenForNewMeal) {
		newLunchMealButton.addActionListener(listenForNewMeal);
	}
	public void addNewDinnerMealListener(ActionListener listenForNewMeal) {
		newDinnerMealButton.addActionListener(listenForNewMeal);
	}
	public void addNewDessertMealListener(ActionListener listenForNewMeal) {
		newDessertMealButton.addActionListener(listenForNewMeal);
	}
	
	public void addDeletePlanListener(ActionListener listenForNewMeal) {
		deleteButton.addActionListener(listenForNewMeal);
	}
	public void addConfirmPlanListener(ActionListener listenForNewMeal) {
		confirmButton.addActionListener(listenForNewMeal);
	}
	public void addCancelListener(ActionListener listenForNewMeal) {
		cancelButton.addActionListener(listenForNewMeal);
	}

	
}