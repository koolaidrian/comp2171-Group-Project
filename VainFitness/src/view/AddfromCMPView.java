package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

/**
 * 
 */
public class AddfromCMPView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddfromCMPView window = new AddfromCMPView();
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
	public AddfromCMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add from Custom Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(90, 37, 232, 125);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(114, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Pick Plan");
		lblNewLabel.setBounds(160, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(228, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

	}
}