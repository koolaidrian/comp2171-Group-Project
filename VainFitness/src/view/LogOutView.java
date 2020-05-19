package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * 
 */
public class LogOutView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOutView window = new LogOutView();
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
	public LogOutView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Log Out");
		frame.setBounds(100, 100, 279, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Are you sure?");
		lblNewLabel.setBounds(77, 38, 67, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBounds(10, 84, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(131, 84, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}