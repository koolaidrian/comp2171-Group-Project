package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DeleteClientTrainerView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteClientTrainerView window = new DeleteClientTrainerView();
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
	public DeleteClientTrainerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Delete Client");
		frame.setBounds(100, 100, 255, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Are you sure?");
		lblNewLabel.setBounds(83, 11, 77, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Delete from trainer list");
		btnNewButton.setBounds(41, 36, 149, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Delete completely");
		btnNewButton_1.setBounds(41, 70, 149, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBounds(71, 104, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
