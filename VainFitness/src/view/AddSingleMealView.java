package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingConstants;

/**
 * 
 */
public class AddSingleMealView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSingleMealView window = new AddSingleMealView();
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
	public AddSingleMealView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Single Meal");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(10, 42, 235, 165);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Add Meal to Breakfast");
		btnNewButton.setBounds(272, 42, 140, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Add Meal to Lunch");
		btnNewButton_1.setBounds(272, 76, 140, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Add Meal to Dinner");
		btnNewButton_2.setBounds(272, 110, 140, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Add Meal to Snacks/Dessert");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBounds(255, 144, 169, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Create New Meal");
		btnNewButton_4.setBounds(276, 178, 136, 23);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Cancel");
		btnNewButton_5.setBounds(301, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
	}

}