package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import model.fitnessController;

public class AdminMainView {

	private fitnessController controller;

	private JFrame frame;
	private JFrame MainFrame;
	private JLabel id;
	private JLabel username;
	private JLabel password;
	private JButton editProfileButton;
	private JLabel fname;
	private JLabel lname;
	private JLabel contact;
	private JLabel email;
	private JButton editPersonal;	
	private JButton backButton;

	/**
	 * Create the application.
	 */
	public AdminMainView(String id, String username, String fname, String lname, String contact, String email) {
		this.id = new JLabel(id);
		this.username = new JLabel(username);
		this.fname = new JLabel(fname);
		this.lname = new JLabel(lname);
		this.contact = new JLabel(contact);
		this.email = new JLabel(email);
		initialize();
	}
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
		this.controller = fitnessController.getInstance();
		frame.setVisible(true);
	}
	
	public void hideFrame() {
		frame.setVisible(false);
		MainFrame.dispose();
		frame.dispose();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Info");
		frame.setBounds(100, 100, 326, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 41, 280, 186);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Profile", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID #");
		lblNewLabel_1.setBounds(32, 31, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setBounds(32, 67, 69, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setBounds(32, 108, 56, 14);
		panel_3.add(lblNewLabel_3);
		
		id.setBounds(111, 31, 120, 14);
		panel_3.add(id);
		
		username.setBounds(111, 67, 120, 14);
		panel_3.add(username);
		
		password = new JLabel("password");
		password.setBounds(111, 108, 120, 14);
		panel_3.add(password);
		
		editProfileButton = new JButton("Edit");
		editProfileButton.setBounds(172, 124, 89, 23);
		panel_3.add(editProfileButton);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Personal Info", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("First Name:");
		lblNewLabel_7.setBounds(10, 11, 55, 14);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Last Name:");
		lblNewLabel_8.setBounds(10, 38, 55, 14);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contact #");
		lblNewLabel_9.setBounds(10, 63, 55, 14);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Email:");
		lblNewLabel_10.setBounds(10, 88, 46, 14);
		panel_4.add(lblNewLabel_10);
		
		fname.setBounds(93, 11, 120, 14);
		panel_4.add(fname);
		
		lname.setBounds(93, 38, 120, 14);
		panel_4.add(lname);
		
		contact.setBounds(93, 63, 120, 14);
		panel_4.add(contact);
		
		email.setBounds(93, 88, 120, 14);
		panel_4.add(email);
		
		editPersonal = new JButton("Edit");
		editPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//FILL LATER
				/*VainFitnessUIAdmin adminUI = new VainFitnessUIAdmin();
				adminUI.showFrame(MainFrame);
				frame.dispose();*/
			}
		});
		editPersonal.setBounds(35, 124, 89, 23);
		panel_4.add(editPersonal);
		
		backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VainFitnessUIAdmin adminUI = new VainFitnessUIAdmin();
				adminUI.showFrame(MainFrame);
				hideFrame();
			}
		});
		backButton.setBounds(203, 7, 89, 23);
		frame.getContentPane().add(backButton);
	}
}
