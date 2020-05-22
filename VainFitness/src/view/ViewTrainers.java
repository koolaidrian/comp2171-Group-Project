package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import GUI.CreateClientProfileUI;
import model.SomethingSelectedController;
import model.fitnessController;

public class ViewTrainers {

	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
	private JButton newtrainerButton;
	private JButton backButton;
	private JList list;
	private DefaultListModel listModel;

	/**
	 * Create the application.
	 */
	public ViewTrainers(ArrayList<String> trainerNames) {
		listModel = new DefaultListModel<String>();
		addElemListModel(trainerNames);
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
		frame = new JFrame("View Trainers");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		newtrainerButton = new JButton("New Trainer");
		newtrainerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateFitnessCoachProfileView createProfileUI = new CreateFitnessCoachProfileView();
				createProfileUI.showFrame(MainFrame);
				hideFrame();
			}
		});
		newtrainerButton.setBounds(93, 213, 89, 23);
		frame.getContentPane().add(newtrainerButton);
		
		backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VainFitnessUIAdmin adminUI = new VainFitnessUIAdmin();
				adminUI.showFrame(MainFrame);
				hideFrame();
			}
		});
		backButton.setBounds(233, 213, 89, 23);
		frame.getContentPane().add(backButton);
		
		list = new JList();
		list.setModel(listModel);
		list.setBounds(56, 35, 296, 153);
		frame.getContentPane().add(list);
	}
	
	public void addElemListModel(ArrayList<String> trainers) {
		for (String t: trainers) {
			this.listModel.addElement(t);
		}
	}

}
