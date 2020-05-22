package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import GUI.CaloricValueUI;
import GUI.VainFitnessUI;
import model.SomethingSelectedController;
import model.fitnessController;

public class VainFitnessUIAdmin {
	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
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
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
		this.controller = fitnessController.getInstance();
		this.controller2 = SomethingSelectedController.getInstance();
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
		frame = new JFrame("Admin Main Menu");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.logoutUser();
				frame.setVisible(false);
				MainFrame.dispose();
				frame.dispose();
			}
		});
		logOutButton.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(logOutButton);
		
		JLabel lblNewLabel = new JLabel("Let's Do Something");
		lblNewLabel.setBounds(134, 51, 93, 14);
		frame.getContentPane().add(lblNewLabel);
		
		checkCalButton = new JButton("Check Caloric Value");
		checkCalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaloricValueUI CalFrame = new CaloricValueUI();
				
				//CalFrame.setVisible(true);
				//CalFrame.main(null);
				frame.setVisible(false);
				CalFrame.showFrame(frame);
				
				
			}
		});
		checkCalButton.setBounds(122, 77, 117, 23);
		frame.getContentPane().add(checkCalButton);
		
		viewMealPlansButton = new JButton("View Meal Plans");
		viewMealPlansButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewLMPList lmpsUI = new ViewLMPList(controller2.getMealPlanNames());
				lmpsUI.showFrame(frame);
				hideFrame();
			}
		});
		viewMealPlansButton.setBounds(122, 116, 117, 23);
		frame.getContentPane().add(viewMealPlansButton);
		
		viewClientsButton = new JButton("Clients");
		viewClientsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewClients clientsUI = new ViewClients(controller2.getClientNames());
				clientsUI.showFrame(frame);
				hideFrame();
			}
		});
		viewClientsButton.setBounds(122, 150, 117, 23);
		frame.getContentPane().add(viewClientsButton);
		
		viewTrainersButton = new JButton("Trainers");
		viewTrainersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTrainers trainersUI = new ViewTrainers(controller2.getTrainerNames());
				trainersUI.showFrame(frame);
				hideFrame();
			}
		});
		viewTrainersButton.setBounds(122, 184, 117, 23);
		frame.getContentPane().add(viewTrainersButton);
		
		myBusinessButton = new JButton("My Business");
		myBusinessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMainView adminUI = new AdminMainView(controller.getAdmin().getIDString(),controller.getAdmin().getUsername(),controller.getAdmin().getMyPersonalInfo().getFirstname(),controller.getAdmin().getMyPersonalInfo().getLastname(),controller.getAdmin().getMyPersonalInfo().getContact(),controller.getAdmin().getMyPersonalInfo().getEmail());
				adminUI.showFrame(frame);
				hideFrame();
			}
		});
		myBusinessButton.setBounds(122, 218, 117, 23);
		frame.getContentPane().add(myBusinessButton);
	}

}
