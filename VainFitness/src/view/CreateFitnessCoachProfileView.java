package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import GUI.ClientProfileUI;
import GUI.CreateClientProfileUI;
import model.fitnessController;

/**
 * 
 */
public class CreateFitnessCoachProfileView {

	private fitnessController controller;
	//

	private JFrame frame;
	private JFrame MainFrame;
	private String Firstname;
	private String Lastname;
	private String Contact;
	private String Email;
	private String Gender;
	private String Username;
	private String Password;
	//
	private JTextField firstname;
	private JTextField lastname;
	private JTextField contact;
	private JTextField email;
	private JTextField gender;

	private JProgressBar progressBar;
	private JTextField username;
	private JPasswordField password1;
	private JPasswordField password2;
	
	JLabel passwordLabel;

	/**
	 * Create the application.
	 */
	public CreateFitnessCoachProfileView() {
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
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton confirmationBtn = new JButton("Confirm");
		confirmationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controller.createTrainerProfile("Trainer",Username,Password,Firstname,Lastname,Contact,Email);
				System.out.println(controller.getTrainerInfo());
				if(controller.checkCurrentUser()) {
					JOptionPane.showMessageDialog(null, "Profile Created!");
					VainFitnessUIAdmin adminUI = new VainFitnessUIAdmin();
					adminUI .showFrame(MainFrame);
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Profile was not created successfully. Please try again!");
					hideFrame();
				}
			}
		});
		confirmationBtn.setBounds(484, 358, 123, 32);
		frame.getContentPane().add(confirmationBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hideFrame();
			}
		});
		cancelBtn.setBounds(57, 358, 115, 32);
		frame.getContentPane().add(cancelBtn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(29, 68, 589, 277);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Member Info", null, panel_4, null);
		panel_4.setLayout(null);
		
		username = new JTextField();
		username.setBounds(154, 65, 231, 22);
		panel_4.add(username);
		username.setColumns(10);
		
		password1 = new JPasswordField();
		password1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		password1.setBounds(154, 113, 231, 22);
		panel_4.add(password1);
		
		password2 = new JPasswordField();
		password2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(!(String.valueOf(password1.getPassword()).contentEquals(String.valueOf(password2.getPassword())))) {
					passwordLabel.setText("Password Mismatch!");
					
				}else {
					passwordLabel.setText("Password Match!");
				}
				
			}
		});
		password2.setBounds(156, 160, 231, 22);
		panel_4.add(password2);
		
		JLabel lblNewLabel_20 = new JLabel("Username");
		lblNewLabel_20.setBounds(12, 68, 87, 16);
		panel_4.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Password");
		lblNewLabel_21.setBounds(12, 116, 87, 16);
		panel_4.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Re-enter Password");
		lblNewLabel_22.setBounds(12, 163, 110, 16);
		panel_4.add(lblNewLabel_22);
		
		JButton saveMemberInfo = new JButton("save");
		saveMemberInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Username = username.getText();
				Password = String.valueOf(password2.getPassword());
				progressBar.setValue(20);
			}
		});
		saveMemberInfo.setBounds(475, 209, 97, 25);
		panel_4.add(saveMemberInfo);
		
		passwordLabel = new JLabel("");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(208, 195, 125, 16);
		panel_4.add(passwordLabel);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PersonalInfo", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname:");
		lblNewLabel_1.setBounds(12, 25, 106, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lastname");
		lblNewLabel_2.setBounds(12, 79, 56, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact");
		lblNewLabel_3.setBounds(12, 148, 67, 16);
		panel.add(lblNewLabel_3);
		
		firstname = new JTextField();
		firstname.setBounds(12, 44, 116, 22);
		panel.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(12, 101, 116, 22);
		panel.add(lastname);
		lastname.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(12, 169, 116, 22);
		panel.add(contact);
		contact.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setBounds(231, 25, 56, 16);
		panel.add(lblNewLabel_4);
		
		email = new JTextField();
		email.setBounds(231, 44, 116, 22);
		panel.add(email);
		email.setColumns(10);
		
		JButton savePersonalInfo = new JButton("save");
		savePersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(email.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter values!");
				}else {
				Firstname = firstname.getText();
				Lastname = lastname.getText();
				Contact = contact.getText();
				Email = email.getText();
				progressBar.setValue(40);
				
				}
			}
		});
		savePersonalInfo.setBounds(475, 209, 97, 25);
		panel.add(savePersonalInfo);
		
		JLabel lblNewLabel = new JLabel("Create Trainer Profile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 13, 578, 42);
		frame.getContentPane().add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(246, 358, 146, 14);
		frame.getContentPane().add(progressBar);
	}
}