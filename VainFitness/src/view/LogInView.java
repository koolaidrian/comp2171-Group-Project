package view;

import java.awt.EventQueue;
//import java.util.*;
import GUI.ClientProfileUI;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.fitnessController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

/**
 * 
 */
public class LogInView {
	
	private fitnessController controller;
	private JFrame MainFrame;
	private String Username;
	private String Password;

	private JFrame frame;
	private JTextField username;
	JLabel message;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInView window = new LogInView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInView() {
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
		frame = new JFrame("Log In");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(111, 79, 86, 14);
		frame.getContentPane().add(lblNewLabel);

		username = new JTextField();
		username.setBounds(209, 76, 86, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(111, 117, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JButton loginBtn = new JButton("Log In");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.setText("");
				Username = username.getText();
				Password = String.valueOf(password.getPassword());
				if(controller.validUser(Username, Password)) {
					JOptionPane.showMessageDialog(null, "Log in Successful!");
					System.out.println(""+ controller.checkCurrentUser()+ "\n"+ controller.getClientUsername());
					ClientProfileUI clientProfileUI = new ClientProfileUI();
					
					clientProfileUI.showFrame(MainFrame);
					
					frame.dispose();
					
				}else {
					//JOptionPane.showMessageDialog(null, "Profile Created!");
					message.setText("Invalid Credentials");
				}
				
			}
		});
		loginBtn.setBounds(108, 162, 89, 23);
		frame.getContentPane().add(loginBtn);

		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hideFrame();
			}
		});
		cancelBtn.setBounds(225, 162, 89, 23);
		frame.getContentPane().add(cancelBtn);
		
		message = new JLabel("");
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setBounds(141, 209, 154, 16);
		frame.getContentPane().add(message);
		
		password = new JPasswordField();
		password.setBounds(209, 113, 86, 22);
		frame.getContentPane().add(password);
	}
	
	public void hide() {
		frame.setVisible(false);
	}
	
	public void show() {
		frame.setVisible(true);
	}

}