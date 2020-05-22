package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * 
 */
public class LogInView {

	private JFrame frame;
	private JLabel notifLabel;
	private JButton notifButton;

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
		frame.setBounds(100, 100, 174, 161);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		notifLabel = new JLabel();
		notifLabel.setHorizontalAlignment(SwingConstants.CENTER);
		notifLabel.setBounds(10, 45, 125, 14);
		frame.getContentPane().add(notifLabel);
		
		notifButton = new JButton();
		notifButton.setBounds(20, 69, 115, 23);
		frame.getContentPane().add(notifButton);
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @return the notifLabel
	 */
	public JLabel getNotifLabel() {
		return notifLabel;
	}

	/**
	 * @return the notifButton
	 */
	public JButton getNotifButton() {
		return notifButton;
	}

	public void addButtonListener(ActionListener listenForClick) {
		notifButton.addActionListener(listenForClick);
	}

}