package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class EditClientProfile {

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
					EditClientProfile window = new EditClientProfile();
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
	public EditClientProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Edit CLient Profile");
		frame.setBounds(100, 100, 283, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID #");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(10, 49, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(10, 89, 62, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Trainer");
		lblNewLabel_3.setBounds(10, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(21, 164, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(137, 164, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(100, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(100, 86, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(100, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(100, 119, 86, 22);
		frame.getContentPane().add(comboBox);

	}

}
