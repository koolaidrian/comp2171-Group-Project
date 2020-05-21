package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */
public class VainFitnessUIUser {
	private JFrame frame;
	private JButton logInButton;
	private JButton checkCalButton;
	private JButton viewMealPlansButton;
	private JButton createAccountButton;
	private JTextField usernameTextField;
	private JTextField passwordTextField;

	/**
	 * Create the application.
	 */
	public VainFitnessUIUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Main Menu");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logInButton = new JButton("Log In");
		logInButton.setBounds(361, 11, 63, 23);
		frame.getContentPane().add(logInButton);
		
		JLabel lblNewLabel = new JLabel("Let's Do Something");
		lblNewLabel.setBounds(140, 55, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		checkCalButton = new JButton("Check Caloric Value");
		checkCalButton.setBounds(122, 80, 128, 23);
		frame.getContentPane().add(checkCalButton);
		
		viewMealPlansButton = new JButton("View Meal Plans");
		viewMealPlansButton.setBounds(122, 127, 128, 23);
		frame.getContentPane().add(viewMealPlansButton);
		
		createAccountButton = new JButton("Create Account");
		createAccountButton.setBounds(122, 173, 128, 23);
		frame.getContentPane().add(createAccountButton);
		
		usernameTextField = new JTextField("username");
		usernameTextField.setBounds(172, 12, 86, 20);
		frame.getContentPane().add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextField = new JTextField("password");
		passwordTextField.setBounds(268, 12, 86, 20);
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @return the usernameTextField
	 */
	public String getUsername() {
		return usernameTextField.getText();
	}

	/**
	 * @return the passwordTextField
	 */
	public String getPassword() {
		return passwordTextField.getText();
	}
	
	public void addLogInListener(ActionListener listenForLogIn) {
		logInButton.addActionListener(listenForLogIn);
	}
	
	public void addCheckCalListener(ActionListener listenForCheckCal) {
		checkCalButton.addActionListener(listenForCheckCal);
	}
	
	public void addViewMealPlansListener(ActionListener listenForViewMealPlans) {
		viewMealPlansButton.addActionListener(listenForViewMealPlans);
	}
	
	public void addCreateClientListener(ActionListener listenForNewClient) {
		createAccountButton.addActionListener(listenForNewClient);
	}
}