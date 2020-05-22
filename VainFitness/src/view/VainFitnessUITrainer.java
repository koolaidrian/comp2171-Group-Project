package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.fitnessController;

public class VainFitnessUITrainer {
	private fitnessController controller;

	private JFrame frame;
	private JFrame MainFrame;
	private JButton logOutButton;
	private JButton checkCalButton;
	private JButton viewMealPlansButton;
	private JButton newClientButton;
	private JButton myBusinessButton;

	/**
	 * Create the application.
	 */
	public VainFitnessUITrainer() {
		initialize();
	}
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
		this.controller = fitnessController.getInstance();
		frame.setVisible(true);
	}
	
	public void hideFrame() {
		frame.setVisible(false);
		MainFrame.setVisible(true);
		frame.dispose();
		
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
}
