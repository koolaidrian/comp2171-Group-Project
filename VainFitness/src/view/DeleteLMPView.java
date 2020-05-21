package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeleteLMPView {

	private JFrame frame;
	private JButton deleteButton;
	private JButton cancelButton;


	/**
	 * Create the application.
	 */
	public DeleteLMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Delete Localized Meal Plan");
		frame.setBounds(100, 100, 255, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Are you sure?");
		lblNewLabel.setBounds(78, 45, 77, 14);
		frame.getContentPane().add(lblNewLabel);
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(26, 70, 77, 23);
		frame.getContentPane().add(deleteButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(129, 70, 70, 23);
		frame.getContentPane().add(cancelButton);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void addDeleteButtonListener(ActionListener listenForDelete) {
		cancelButton.addActionListener(listenForDelete);
	}
	
	public void addCancelButtonListener(ActionListener listenForCancel) {
		cancelButton.addActionListener(listenForCancel);
	}
}
