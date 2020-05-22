package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;

/**
 * 
 */
public class AddfromLMPView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddfromLMPView window = new AddfromLMPView();
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
	public AddfromLMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add from Localised Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(90, 37, 232, 125);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(110, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Pick Plan");
		lblNewLabel.setBounds(173, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(215, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}