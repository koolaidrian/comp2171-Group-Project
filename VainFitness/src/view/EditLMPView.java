package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * 
 */
public class EditLMPView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditLMPView window = new EditLMPView();
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
	public EditLMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 204);
		frame.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Breakfast", null, panel, null);
		panel.setLayout(null);

		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setBounds(310, 142, 89, 23);
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Create New Meal");
		btnNewButton_6.setBounds(174, 142, 126, 23);
		panel.add(btnNewButton_6);

		JList list = new JList();
		list.setBounds(10, 11, 389, 120);
		panel.add(list);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Lunch", null, panel_1, null);
		panel_1.setLayout(null);

		JButton btnNewButton_4 = new JButton("Save");
		btnNewButton_4.setBounds(310, 142, 89, 23);
		panel_1.add(btnNewButton_4);

		JButton btnNewButton_7 = new JButton("Create New Meal");
		btnNewButton_7.setBounds(174, 142, 126, 23);
		panel_1.add(btnNewButton_7);

		JList list_1 = new JList();
		list_1.setBounds(10, 11, 389, 120);
		panel_1.add(list_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dinner", null, panel_2, null);
		panel_2.setLayout(null);

		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setBounds(310, 142, 89, 23);
		panel_2.add(btnNewButton_3);

		JButton btnNewButton_8 = new JButton("Create New Meal");
		btnNewButton_8.setBounds(174, 142, 126, 23);
		panel_2.add(btnNewButton_8);

		JList list_2 = new JList();
		list_2.setBounds(10, 11, 389, 120);
		panel_2.add(list_2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Snack/Dessert", null, panel_3, null);
		panel_3.setLayout(null);

		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(310, 142, 89, 23);
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_9 = new JButton("Create New Meal");
		btnNewButton_9.setBounds(174, 142, 126, 23);
		panel_3.add(btnNewButton_9);

		JList list_3 = new JList();
		list_3.setBounds(10, 11, 389, 120);
		panel_3.add(list_3);

		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(185, 226, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(284, 226, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_10 = new JButton("Delete Plan");
		btnNewButton_10.setBounds(86, 226, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
	}

}