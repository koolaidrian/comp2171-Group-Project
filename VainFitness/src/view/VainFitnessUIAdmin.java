package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VainFitnessUIAdmin {

	private JFrame frame;
	private JButton logOutButton;
	private JButton checkCalButton;
	private JButton viewMealPlansButton;
	private JButton viewClientsButton;
	private JButton viewTrainersButton;
	private JButton myBusinessButton;

	/**
	 * Create the application.
	 */
	public VainFitnessUIAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Main Menu");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(logOutButton);
		
		JLabel lblNewLabel = new JLabel("Let's Do Something");
		lblNewLabel.setBounds(134, 51, 93, 14);
		frame.getContentPane().add(lblNewLabel);
		
		checkCalButton = new JButton("Check Caloric Value");
		checkCalButton.setBounds(122, 77, 117, 23);
		frame.getContentPane().add(checkCalButton);
		
		viewMealPlansButton = new JButton("View Meal Plans");
		viewMealPlansButton.setBounds(122, 116, 117, 23);
		frame.getContentPane().add(viewMealPlansButton);
		
		viewClientsButton = new JButton("Clients");
		viewClientsButton.setBounds(122, 150, 117, 23);
		frame.getContentPane().add(viewClientsButton);
		
		viewTrainersButton = new JButton("Trainers");
		viewTrainersButton.setBounds(122, 184, 117, 23);
		frame.getContentPane().add(viewTrainersButton);
		
		myBusinessButton = new JButton("My Business");
		myBusinessButton.setBounds(122, 218, 117, 23);
		frame.getContentPane().add(myBusinessButton);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void addLogOutListener(ActionListener listenForLogOut) {
		logOutButton.addActionListener(listenForLogOut);
	}
	
	public void addCheckCalListener(ActionListener listenForCheckCal) {
		checkCalButton.addActionListener(listenForCheckCal);
	}
	
	public void addViewMealPlansListener(ActionListener listenForViewMealPlans) {
		viewMealPlansButton.addActionListener(listenForViewMealPlans);
	}
	
	public void addViewClientsListener(ActionListener listenForViewClients) {
		viewClientsButton.addActionListener(listenForViewClients);
	}
	
	public void addViewTrainersListener(ActionListener listenForViewTrainers) {
		viewTrainersButton.addActionListener(listenForViewTrainers);
	}
	
	public void addMyBusinessListener(ActionListener listenForMyBusiness) {
		myBusinessButton.addActionListener(listenForMyBusiness);
	}

}
