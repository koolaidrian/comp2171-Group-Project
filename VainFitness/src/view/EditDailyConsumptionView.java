package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class EditDailyConsumptionView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditDailyConsumptionView window = new EditDailyConsumptionView();
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
	public EditDailyConsumptionView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Edit Daily Consumption");
		frame.setBounds(100, 100, 290, 196);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Add or Delete?");
		lblNewLabel.setBounds(97, 50, 71, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(41, 85, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBounds(147, 85, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
