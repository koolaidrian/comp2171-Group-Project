package GUI;

import java.awt.EventQueue;
import edamanAPI.edaman;
import model.FoodItem;
import model.fitnessController;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UpdateDCUI {
	
	private fitnessController controller;
	private edaman api;
	private JFrame MainFrame;

	private String FoodItemName;
	private FoodItem item = null;
	private JFrame frame;
	private JTextField foodItemName;
	private JTextField query;
	JTextArea Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDCUI window = new UpdateDCUI();
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
	public UpdateDCUI() {
		initialize();
	}
	
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
		this.controller = fitnessController.getInstance();
		frame.setVisible(true);
	}
	
	public void hideFrame() {
		frame.setVisible(false);
		MainFrame.setVisible(true);
		frame.dispose();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Daily Consumption");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(129, 13, 357, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(27, 95, 599, 307);
		frame.getContentPane().add(splitPane);
		
		JPanel LeftPanel = new JPanel();
		splitPane.setLeftComponent(LeftPanel);
		LeftPanel.setLayout(null);
		
		JButton searchBtn = new JButton("Search");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Query;
				api = new edaman();
				
				
				Query = query.getText();
				
				FoodItemName = foodItemName.getText();
				item = api.getCaloricValue(FoodItemName, Query);
				
				//Result.setText(api.searchCaloricValue(Query));
				
				Result.setText(item.toString());
			}
		});
		searchBtn.setBounds(12, 197, 97, 25);
		LeftPanel.add(searchBtn);
		
		JButton addItemBtn = new JButton("Add Item");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Query;
				//Query = query.getText();
				//FoodItemName = foodItemName.getText();
				
				//item = api.getCaloricValue(FoodItemName,Query);
				//controller.addFoodItem(item);
				
				JOptionPane.showMessageDialog(null, "FoodItem Added");
				
				
			}
		});
		addItemBtn.setBounds(12, 239, 97, 25);
		LeftPanel.add(addItemBtn);
		
		foodItemName = new JTextField();
		foodItemName.setBounds(12, 102, 160, 22);
		LeftPanel.add(foodItemName);
		foodItemName.setColumns(10);
		
		query = new JTextField();
		query.setForeground(Color.LIGHT_GRAY);
		query.setText("Quantity + Name of Food Item");
		query.setBounds(12, 148, 194, 36);
		LeftPanel.add(query);
		query.setColumns(10);
		
		JLabel itemName = new JLabel("Food Item Name:");
		itemName.setBounds(12, 83, 143, 16);
		LeftPanel.add(itemName);
		
		JLabel lblNewLabel_1 = new JLabel("Food Item Query:");
		lblNewLabel_1.setBounds(12, 129, 179, 16);
		LeftPanel.add(lblNewLabel_1);
		
		JPanel RightPanel = new JPanel();
		splitPane.setRightComponent(RightPanel);
		RightPanel.setLayout(null);
		
		Result = new JTextArea();
		Result.setBounds(26, 42, 294, 237);
		RightPanel.add(Result);
		splitPane.setDividerLocation(250);
		
		JButton updateBtn = new JButton("Update ");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.addFoodItem(item);
				
				JOptionPane.showMessageDialog(null, "Daily Consumption Updated");
				hideFrame();
			}
		});
		updateBtn.setBounds(419, 415, 166, 25);
		frame.getContentPane().add(updateBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hideFrame();
			}
		});
		cancelBtn.setBounds(64, 415, 155, 25);
		frame.getContentPane().add(cancelBtn);
	}
	
	public void hide() {
		frame.setVisible(false);
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
