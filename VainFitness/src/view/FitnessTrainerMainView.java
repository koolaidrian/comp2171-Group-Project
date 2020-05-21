package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;

public class FitnessTrainerMainView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FitnessTrainerMainView window = new FitnessTrainerMainView();
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
	public FitnessTrainerMainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Fitness Trainer Main View");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hi Trainer");
		lblNewLabel.setBounds(167, 19, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 41, 394, 186);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("My Clients", null, panel, null);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(34, 11, 317, 89);
		panel.add(list);
		
		JButton btnNewButton = new JButton("Add new Client");
		btnNewButton.setBounds(21, 111, 110, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("See Client");
		btnNewButton_1.setBounds(160, 111, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Delete client");
		btnNewButton_3.setBounds(274, 111, 105, 23);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("My Meal Plans", null, panel_1, null);
		panel_1.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(24, 11, 332, 98);
		panel_1.add(list_1);
		
		JButton btnNewButton_2 = new JButton("Create Plan");
		btnNewButton_2.setBounds(34, 120, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("View Plan");
		btnNewButton_4.setBounds(152, 120, 89, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Edit Plan");
		btnNewButton_5.setBounds(267, 120, 89, 23);
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Session Hours", null, panel_2, null);
		panel_2.setLayout(null);
		
		JList list_2 = new JList();
		list_2.setBounds(39, 11, 137, 93);
		panel_2.add(list_2);
		
		JButton btnNewButton_6 = new JButton("Add hours");
		btnNewButton_6.setBounds(196, 27, 101, 23);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Remove hours");
		btnNewButton_7.setBounds(196, 61, 101, 23);
		panel_2.add(btnNewButton_7);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Profile", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID #");
		lblNewLabel_1.setBounds(32, 31, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setBounds(32, 67, 69, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setBounds(32, 108, 56, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(111, 31, 46, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(111, 67, 46, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(111, 108, 46, 14);
		panel_3.add(lblNewLabel_6);
		
		JButton btnNewButton_8 = new JButton("Edit");
		btnNewButton_8.setBounds(259, 63, 89, 23);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("Delete Account");
		btnNewButton_10.setBounds(254, 104, 105, 23);
		panel_3.add(btnNewButton_10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Personal Info", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("First Name:");
		lblNewLabel_7.setBounds(10, 11, 55, 14);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Last Name:");
		lblNewLabel_8.setBounds(10, 38, 55, 14);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contact #");
		lblNewLabel_9.setBounds(10, 63, 55, 14);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Email:");
		lblNewLabel_10.setBounds(10, 88, 46, 14);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gender:");
		lblNewLabel_11.setBounds(10, 114, 46, 14);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(93, 11, 46, 14);
		panel_4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(93, 38, 46, 14);
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(93, 63, 46, 14);
		panel_4.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(93, 88, 46, 14);
		panel_4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBounds(93, 114, 46, 14);
		panel_4.add(lblNewLabel_16);
		
		JButton btnNewButton_9 = new JButton("Edit");
		btnNewButton_9.setBounds(210, 110, 89, 23);
		panel_4.add(btnNewButton_9);
	}

}
