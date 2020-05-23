package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import GUI.ClientProfileUI;
import model.Member;
import model.SomethingSelectedController;
import model.fitnessController;

/**
 * 
 */
public class EditLMPView {
	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
	private JButton confirmButton;
	private JButton cancelButton;
	private JButton dinnerSaveButton;
	private JButton lunchSaveButton;
	private JButton breakfastSaveButton;
	private JButton newBreakfastMealButton;
	private JButton newLunchMealButton;
	private JButton newDinnerMealButton;
	private JButton deleteButton;
	private JList<String> breakfastList;
	private JList<String> lunchList;
	private JList<String> dinnerList;
	private DefaultListModel<String> breakfastListModel;
	private DefaultListModel<String> lunchListModel;
	private DefaultListModel<String> dinnerListModel;
	String selectedB;
	String selectedL;
	String selectedD;

	/**
	 * Create the application.
	 */
	public EditLMPView(ArrayList<String> meals, String selectedB, String selectedL, String selectedD) {
		this.selectedB = selectedB;
		this.selectedD = selectedD;
		this.selectedL = selectedL;
		breakfastListModel = new DefaultListModel<String>();
		lunchListModel = new DefaultListModel<String>();
		dinnerListModel = new DefaultListModel<String>();
		addElemListModel(meals);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 204);
		frame.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Breakfast", null, panel, null);
		panel.setLayout(null);

		breakfastSaveButton = new JButton("Save");
		breakfastSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller2.setSelectedB(breakfastList.getSelectedValue());
			}
		});
		breakfastSaveButton.setBounds(310, 142, 89, 23);
		panel.add(breakfastSaveButton);
		
		newBreakfastMealButton = new JButton("Create New Meal");
		newBreakfastMealButton.setBounds(174, 142, 126, 23);
		panel.add(newBreakfastMealButton);
		
		breakfastList = new JList<String>();
		breakfastList.setModel(breakfastListModel);
		breakfastList.setBounds(10, 11, 389, 120);
		panel.add(breakfastList);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Lunch", null, panel_1, null);
		panel_1.setLayout(null);

		lunchSaveButton = new JButton("Save");
		lunchSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller2.setSelectedL(lunchList.getSelectedValue());
			}
		});
		lunchSaveButton.setBounds(310, 142, 89, 23);
		panel_1.add(lunchSaveButton);
		
		newLunchMealButton = new JButton("Create New Meal");
		newLunchMealButton.setBounds(174, 142, 126, 23);
		panel_1.add(newLunchMealButton);
		
		lunchList = new JList<String>();
		lunchList.setModel(lunchListModel);
		lunchList.setBounds(10, 11, 389, 120);
		panel_1.add(lunchList);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dinner", null, panel_2, null);
		panel_2.setLayout(null);

		dinnerSaveButton = new JButton("Save");
		dinnerSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller2.setSelectedD(dinnerList.getSelectedValue());
			}
		});
		dinnerSaveButton.setBounds(310, 142, 89, 23);
		panel_2.add(dinnerSaveButton);
		
		newDinnerMealButton = new JButton("Create New Meal");
		newDinnerMealButton.setBounds(174, 142, 126, 23);
		panel_2.add(newDinnerMealButton);
		
		dinnerList = new JList<String>();
		dinnerList.setModel(dinnerListModel);
		dinnerList.setBounds(10, 11, 389, 120);
		panel_2.add(dinnerList);

		confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!selectedB.equals(controller2.getSelectedB().getName())) {
					controller2.updateBreakfast();
				}
				if(!selectedL.equals(controller2.getSelectedL().getName())) {
					controller2.updateLunch();
				}
				if(!selectedD.equals(controller2.getSelectedD().getName())) {
					controller2.updateDinner();
				}
				Member member = controller.getCurrentUser();
				System.out.println(member.getUserType());
				if (member.getUserType().equals("Trainer")) {
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
		confirmButton.setBounds(185, 226, 89, 23);
		frame.getContentPane().add(confirmButton);

		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member member = controller.getCurrentUser();
				if (member.getUserType().equals("Trainer")) {
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
		cancelButton.setBounds(284, 226, 89, 23);
		frame.getContentPane().add(cancelButton);

		deleteButton = new JButton("Delete Plan");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller2.deleteSelectedMP();
				Member member = controller.getCurrentUser();
				if (member.getUserType().equals("Trainer")) {
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
		deleteButton.setBounds(86, 226, 89, 23);
		frame.getContentPane().add(deleteButton);
	}

	public void addElemListModel(ArrayList<String> meals) {
		for (String m: meals) {
			this.breakfastListModel.addElement(m);
			this.lunchListModel.addElement(m);
			this.dinnerListModel.addElement(m);
		}
	}
}