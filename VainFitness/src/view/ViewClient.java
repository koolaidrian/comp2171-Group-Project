package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JList;

public class ViewClient {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClient window = new ViewClient();
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
	public ViewClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Client");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 26, 359, 200);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Daily Consum", null, panel, null);
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
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Goals", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Nutritional");
		lblNewLabel_5.setBounds(40, 11, 58, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Weight");
		lblNewLabel_6.setBounds(281, 11, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Daily Consump:");
		lblNewLabel_7.setBounds(10, 36, 88, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Carb %");
		lblNewLabel_8.setBounds(10, 69, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Protein %");
		lblNewLabel_9.setBounds(10, 105, 57, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Initial:");
		lblNewLabel_10.setBounds(235, 36, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Current:");
		lblNewLabel_11.setBounds(235, 69, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Goal:");
		lblNewLabel_12.setBounds(235, 105, 46, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Fat %");
		lblNewLabel_13.setBounds(10, 140, 46, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(92, 36, 46, 14);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(52, 69, 46, 14);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBounds(66, 105, 46, 14);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setBounds(52, 140, 46, 14);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setBounds(281, 36, 46, 14);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setBounds(281, 69, 46, 14);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setBounds(270, 105, 46, 14);
		panel_1.add(lblNewLabel_20);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Meal Plans", null, panel_2, null);
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setBounds(22, 24, 302, 98);
		panel_2.add(list);
		
		JButton btnNewButton = new JButton("Authorise Plan");
		btnNewButton.setBounds(169, 133, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("View Plan");
		btnNewButton_3.setBounds(53, 133, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Reports", null, panel_3, null);
		panel_3.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(24, 22, 302, 96);
		panel_3.add(list_1);
		
		JButton btnNewButton_1 = new JButton("View Report");
		btnNewButton_1.setBounds(69, 138, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New Report");
		btnNewButton_2.setBounds(190, 138, 89, 23);
		panel_3.add(btnNewButton_2);
	}

}
