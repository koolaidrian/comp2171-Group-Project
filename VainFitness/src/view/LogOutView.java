package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * 
 */
public class LogOutView {

	private JFrame frame;
	private JButton logOutButton;
	private JButton cancelButton;

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
		
		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(10, 84, 89, 23);
		frame.getContentPane().add(logOutButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(131, 84, 89, 23);
		frame.getContentPane().add(cancelButton);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public void addLogOutListener(ActionListener listenForLogOut) {
		logOutButton.addActionListener(listenForLogOut);
	}
	
	public void addCancelListener(ActionListener listenForCancel) {
		cancelButton.addActionListener(listenForCancel);
	}

}