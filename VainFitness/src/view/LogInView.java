package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 
 */
public class LogInView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInView window = new LogInView();
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
	public LogInView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Log In");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(111, 79, 58, 14);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(209, 76, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(111, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(209, 114, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBounds(108, 162, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(225, 162, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}