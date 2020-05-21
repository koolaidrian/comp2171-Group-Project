package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientMainView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMainView window = new ClientMainView();
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
	public ClientMainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Client Main View");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 414, 223);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Daily Consumption", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Breakfast");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lunch");
		lblNewLabel_2.setBounds(208, 11, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dinner");
		lblNewLabel_3.setBounds(10, 88, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Snacks/Dessert");
		lblNewLabel_4.setBounds(208, 88, 79, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Edit Consumption");
		btnNewButton.setBounds(253, 161, 128, 23);
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 36, 117, 41);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(208, 36, 117, 41);
		panel.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 113, 117, 41);
		panel.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(208, 109, 117, 41);
		panel.add(textArea_3);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("My Meal Plans", null, panel2, null);
		panel2.setLayout(null);
		
		List list = new List();
		list.setBounds(0, 10, 409, 155);
		panel2.add(list);
		
		Button button = new Button("View Plan");
		button.setBounds(24, 171, 70, 22);
		panel2.add(button);
		
		Button button_1 = new Button("Edit Plan");
		button_1.setBounds(170, 172, 70, 22);
		panel2.add(button_1);
		
		JButton btnNewButton_2 = new JButton("Add Plan");
		btnNewButton_2.setBounds(284, 171, 89, 23);
		panel2.add(btnNewButton_2);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("My Reports", null, panel3, null);
		panel3.setLayout(null);
		
		List list_1 = new List();
		list_1.setBounds(0, 0, 409, 172);
		panel3.add(list_1);
		
		Button button_2 = new Button("View Report");
		button_2.setBounds(74, 173, 70, 22);
		panel3.add(button_2);
		
		Button button_3 = new Button("New Report");
		button_3.setBounds(238, 173, 70, 22);
		panel3.add(button_3);
		
		JPanel panel6 = new JPanel();
		tabbedPane.addTab("Profile", null, panel6, null);
		panel6.setLayout(null);
		
		JLabel lblNewLabel_37 = new JLabel("ID #");
		lblNewLabel_37.setBounds(10, 11, 46, 14);
		panel6.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Username");
		lblNewLabel_38.setBounds(10, 49, 46, 14);
		panel6.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("Password");
		lblNewLabel_39.setBounds(10, 89, 46, 14);
		panel6.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("New label");
		lblNewLabel_40.setBounds(78, 11, 46, 14);
		panel6.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("New label");
		lblNewLabel_41.setBounds(78, 49, 46, 14);
		panel6.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("New label");
		lblNewLabel_42.setBounds(78, 89, 46, 14);
		panel6.add(lblNewLabel_42);
		
		JButton btnNewButton_4 = new JButton("Edit");
		btnNewButton_4.setBounds(31, 161, 89, 23);
		panel6.add(btnNewButton_4);
		
		JLabel lblNewLabel_43 = new JLabel("Trainer");
		lblNewLabel_43.setBounds(10, 123, 46, 14);
		panel6.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel("New label");
		lblNewLabel_44.setBounds(78, 123, 46, 14);
		panel6.add(lblNewLabel_44);
		
		JButton btnNewButton_5 = new JButton("Delete Account");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(183, 161, 105, 23);
		panel6.add(btnNewButton_5);
		
		JPanel panel4 = new JPanel();
		tabbedPane.addTab("PersonalInfo", null, panel4, null);
		panel4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("First Name:");
		lblNewLabel_5.setBounds(10, 11, 63, 14);
		panel4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Last Name:");
		lblNewLabel_6.setBounds(10, 36, 63, 14);
		panel4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Contact #:");
		lblNewLabel_7.setBounds(10, 61, 63, 14);
		panel4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setBounds(10, 86, 46, 14);
		panel4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Gender:");
		lblNewLabel_9.setBounds(10, 111, 46, 14);
		panel4.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setBounds(47, 147, 89, 23);
		panel4.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(90, 11, 46, 14);
		panel4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(90, 36, 46, 14);
		panel4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(90, 61, 46, 14);
		panel4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(90, 86, 46, 14);
		panel4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(90, 111, 46, 14);
		panel4.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Height:");
		lblNewLabel_15.setBounds(210, 11, 46, 14);
		panel4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBounds(266, 11, 46, 14);
		panel4.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("DOB:");
		lblNewLabel_17.setBounds(210, 36, 46, 14);
		panel4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setBounds(266, 36, 46, 14);
		panel4.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Address:");
		lblNewLabel_19.setBounds(210, 61, 46, 14);
		panel4.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setBounds(266, 61, 46, 14);
		panel4.add(lblNewLabel_20);
		
		JPanel panel5 = new JPanel();
		tabbedPane.addTab("Goals", null, panel5, null);
		panel5.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("Nutritional");
		lblNewLabel_21.setBounds(40, 11, 58, 14);
		panel5.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Weight");
		lblNewLabel_22.setBounds(281, 11, 46, 14);
		panel5.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Daily Consump:");
		lblNewLabel_23.setBounds(10, 36, 88, 14);
		panel5.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Carb %");
		lblNewLabel_24.setBounds(10, 69, 46, 14);
		panel5.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Protein %");
		lblNewLabel_25.setBounds(10, 105, 57, 14);
		panel5.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Initial:");
		lblNewLabel_26.setBounds(235, 36, 46, 14);
		panel5.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Current:");
		lblNewLabel_27.setBounds(235, 69, 46, 14);
		panel5.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("Goal:");
		lblNewLabel_28.setBounds(235, 105, 46, 14);
		panel5.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Fat %");
		lblNewLabel_29.setBounds(10, 140, 46, 14);
		panel5.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("New label");
		lblNewLabel_30.setBounds(92, 36, 46, 14);
		panel5.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setBounds(52, 69, 46, 14);
		panel5.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setBounds(66, 105, 46, 14);
		panel5.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("New label");
		lblNewLabel_33.setBounds(52, 140, 46, 14);
		panel5.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setBounds(281, 36, 46, 14);
		panel5.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		lblNewLabel_35.setBounds(281, 69, 46, 14);
		panel5.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("New label");
		lblNewLabel_36.setBounds(270, 105, 46, 14);
		panel5.add(lblNewLabel_36);
		
		JButton btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.setBounds(138, 161, 89, 23);
		panel5.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Hi Client");
		lblNewLabel.setBounds(159, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
