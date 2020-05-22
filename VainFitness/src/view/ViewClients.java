package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.Member;
import model.SomethingSelectedController;
import model.fitnessController;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

import GUI.CreateClientProfileUI;

public class ViewClients {
	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
	private JButton newClientButton;
	private JButton backButton;
	private JList<String> list;
	private DefaultListModel<String> listModel;

	/**
	 * Create the application.
	 */
	public ViewClients(ArrayList<String> clientNames) {
		listModel = new DefaultListModel<String>();
		addElemListModel(clientNames);
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
		frame = new JFrame("View Clients");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		newClientButton = new JButton("New Client");
		newClientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateClientProfileUI createProfileUI = new CreateClientProfileUI();
				createProfileUI.showFrame(MainFrame);
				hideFrame();
			}
		});
		newClientButton.setBounds(93, 213, 89, 23);
		frame.getContentPane().add(newClientButton);
		
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
		
		list = new JList<String>();
		list.setModel(listModel);
		list.setBounds(56, 35, 296, 153);
		frame.getContentPane().add(list);
	}
	
	public void addElemListModel(ArrayList<String> clients) {
		//ArrayList<String> clients = controller2.getClientNames();
		for (String c: clients) {
			this.listModel.addElement(c);
		}
	}
}
