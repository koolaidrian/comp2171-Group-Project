package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GUI.ClientProfileUI;
import model.Member;
import model.SomethingSelectedController;
import model.fitnessController;

import javax.swing.JButton;

/**
 * 
 */
public class ViewLMP {
	
	private fitnessController controller;
	private SomethingSelectedController controller2;

	private JFrame frame;
	private JFrame MainFrame;
	private JButton editButton;
	private JButton backButton;
	private JLabel breakfastLabel;
	private JLabel dinnerLabel;
	private JLabel lunchLabel;
	private JTextField breakfastText;
	private JTextField dinnerText;
	private JTextField lunchText;


	/**
	 * Create the application.
	 */
	public ViewLMP(String breakfast, String lunch, String dinner) {
		breakfastText = new JTextField(breakfast);
		lunchText = new JTextField(lunch);
		dinnerText = new JTextField(dinner);
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
		frame = new JFrame("View Localised Meal Plan");
		frame.setBounds(100, 100, 296, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditLMPView editlmpUI = new EditLMPView(controller2.getMealNames(), controller2.getSelectedB().getName(), controller2.getSelectedL().getName(), controller2.getSelectedD().getName());
				editlmpUI.showFrame(frame);
				hideFrame();
			}
		});
		editButton.setBounds(27, 174, 89, 23);
		frame.getContentPane().add(editButton);

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
		backButton.setBounds(169, 174, 89, 23);
		frame.getContentPane().add(backButton);
		
		breakfastLabel = new JLabel("Breakfast");
		breakfastLabel.setBounds(43, 44, 46, 14);
		frame.getContentPane().add(breakfastLabel);
		
		dinnerLabel = new JLabel("Dinner");
		dinnerLabel.setBounds(43, 133, 46, 14);
		frame.getContentPane().add(dinnerLabel);
		
		lunchLabel = new JLabel("Lunch");
		lunchLabel.setBounds(43, 89, 46, 14);
		frame.getContentPane().add(lunchLabel);
		
		breakfastText.setBounds(93, 40, 123, 23);
		frame.getContentPane().add(breakfastText);
		
		lunchText.setBounds(93, 85, 123, 23);
		frame.getContentPane().add(lunchText);
		
		dinnerText.setBounds(93, 129, 123, 23);
		frame.getContentPane().add(dinnerText);
		
	}

}