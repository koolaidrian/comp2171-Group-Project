package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;

public class DeleteDailyConsumptionView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDailyConsumptionView window = new DeleteDailyConsumptionView();
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
	public DeleteDailyConsumptionView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Delete Daily Consumption");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JList list = new JList();
		list.setBounds(85, 44, 257, 123);
		frame.getContentPane().add(list);

		JButton btnNewButton = new JButton("Delete Meal(s)");
		btnNewButton.setBounds(106, 178, 101, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(228, 178, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
