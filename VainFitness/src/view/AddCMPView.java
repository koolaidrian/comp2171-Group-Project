package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;

/**
 * 
 */
public class AddCMPView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCMPView window = new AddCMPView();
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
	public AddCMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Custom Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(81, 35, 250, 118);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Add Plan");
		btnNewButton.setBounds(110, 164, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(221, 164, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}