package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class ViewCMP {

	private JFrame frame;
	private JButton backButton;
	private JLabel breakfastLabel;
	private JLabel dinnerLabel;
	private JLabel lunchLabel;
	private JLabel dessertLabel;
	private JTable breakfastTable;
	private JTable lunchTable;
	private JTable dinnerTable;
	private JTable dessertTable;

	/**
	 * Create the application.
	 */
	public ViewCMP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Custom Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		backButton = new JButton("Back");
		backButton.setBounds(164, 227, 89, 23);
		frame.getContentPane().add(backButton);
		
		breakfastLabel = new JLabel("Breakfast");
		breakfastLabel.setBounds(43, 11, 46, 14);
		frame.getContentPane().add(breakfastLabel);
		
		dinnerLabel = new JLabel("Dinner");
		dinnerLabel.setBounds(43, 114, 46, 14);
		frame.getContentPane().add(dinnerLabel);
		
		lunchLabel = new JLabel("Lunch");
		lunchLabel.setBounds(224, 11, 46, 14);
		frame.getContentPane().add(lunchLabel);
		
		dessertLabel = new JLabel("Dessert");
		dessertLabel.setBounds(224, 114, 46, 14);
		frame.getContentPane().add(dessertLabel);
		
		breakfastTable = new JTable();
		breakfastTable.setBounds(24, 36, 123, 67);
		frame.getContentPane().add(breakfastTable);
		
		lunchTable = new JTable();
		lunchTable.setBounds(216, 36, 123, 67);
		frame.getContentPane().add(lunchTable);
		
		dinnerTable = new JTable();
		dinnerTable.setBounds(24, 139, 123, 67);
		frame.getContentPane().add(dinnerTable);
		
		dessertTable = new JTable();
		dessertTable.setBounds(216, 139, 123, 67);
		frame.getContentPane().add(dessertTable);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void AddBackButtonListener(ActionListener listenForBack) {
		backButton.addActionListener(listenForBack);
	}
	
}
