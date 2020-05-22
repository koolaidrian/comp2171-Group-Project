package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AddfromMP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddfromMP window = new AddfromMP();
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
	public AddfromMP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add from Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(10, 42, 235, 165);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Add Meal to Breakfast");
		btnNewButton.setBounds(272, 39, 140, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Add Meal to Lunch");
		btnNewButton_1.setBounds(272, 73, 140, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Add Meal to Dinner");
		btnNewButton_2.setBounds(272, 107, 140, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Add Meal to Snacks/Dessert");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBounds(255, 141, 169, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setBounds(290, 175, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}

}
