package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JList;

import GUI.ClientProfileUI;
import model.Member;
import model.SomethingSelectedController;
import model.fitnessController;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 * 
 */
public class ViewLMPList {

	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
	private DefaultListModel listModel;
	private JButton viewButton;
	private JButton backButton;
	private JList list;

	/**
	 * Create the application.
	 */
	public ViewLMPList(ArrayList<String> planNames) {
		listModel = new DefaultListModel<String>();
		addElemListModel(planNames);
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
		frame = new JFrame("View Localised Meal Plans");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		list = new JList();
		list.setModel(listModel);
		list.setBounds(33, 23, 363, 158);
		frame.getContentPane().add(list);
		
		viewButton = new JButton("View");
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller2.setSelectedMP((String) list.getSelectedValue());
				ViewLMP lmpUI = new ViewLMP(controller2.getSelectedB().getName(), controller2.getSelectedL().getName(), controller2.getSelectedD().getName());
				lmpUI.showFrame(frame);
				hideFrame();
			}
		});
		viewButton.setBounds(66, 212, 89, 23);
		frame.getContentPane().add(viewButton);
		
		backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member member = controller.getCurrentUser();
				if (member.getUserType().equals("Client")) {
					ClientProfileUI clientProfileUI = new ClientProfileUI();
					clientProfileUI.showFrame(MainFrame);
					hideFrame();
				}else if (member.getUserType().equals("Trainer")) {
					VainFitnessUITrainer trainerUI = new VainFitnessUITrainer();
					trainerUI.showFrame(MainFrame);
					hideFrame();
				}else if (member.getUserType().equals("Admin")) {
					VainFitnessUIAdmin adminUI = new VainFitnessUIAdmin();
					adminUI.showFrame(MainFrame);
					hideFrame();
				}else {
					System.out.println("Error!");
				}
			}
		});
		backButton.setBounds(241, 212, 89, 23);
		frame.getContentPane().add(backButton);
	}
	
	public void addElemListModel(ArrayList<String> mealPlans) {
		for (String p: mealPlans) {
			this.listModel.addElement(p);
		}
	}
	
	public JList getList() {
		return list;
	}

}