package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VainFitnessUIMember {

	private JFrame frame;
	private JButton logOutButton;
	private JButton checkCalButton;
	private JButton viewMealPlansButton;
	private JButton newClientButton;
	private JButton myBusinessButton;

	/**
	 * Create the application.
	 */
	public VainFitnessUIMember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Member Main Menu");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(logOutButton);
		
		JLabel lblNewLabel = new JLabel("Let's Do Something");
		lblNewLabel.setBounds(148, 55, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		checkCalButton = new JButton("Check Caloric Value");
		checkCalButton.setBounds(122, 80, 138, 23);
		frame.getContentPane().add(checkCalButton);
		
		viewMealPlansButton = new JButton("View Meal Plans");
		viewMealPlansButton.setBounds(122, 120, 138, 23);
		frame.getContentPane().add(viewMealPlansButton);
		
		newClientButton = new JButton("Create new Account");
		newClientButton.setBounds(122, 154, 138, 23);
		frame.getContentPane().add(newClientButton);
		
		myBusinessButton = new JButton("My Business");
		myBusinessButton.setBounds(122, 188, 138, 23);
		frame.getContentPane().add(myBusinessButton);
	}
	
	/**
	 * @return the frame
	 */
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
	
	public void addCreateClientListener(ActionListener listenForNewClient) {
		newClientButton.addActionListener(listenForNewClient);
	}
	
	public void addMyBusinessListener(ActionListener listenForMyBusiness) {
		myBusinessButton.addActionListener(listenForMyBusiness);
	}
}
