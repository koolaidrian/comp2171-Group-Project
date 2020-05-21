package view;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * 
 */
public class AddDailyConsumptionView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDailyConsumptionView window = new AddDailyConsumptionView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    /**
     * Create the application
     */
    public AddDailyConsumptionView() {
    	initialize();
    }
    
    /**
	 * Initialize the contents of the frame.
	 */
    private void initialize() {
    	frame = new JFrame("Add Daily Consumption");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose:");
		lblNewLabel.setBounds(169, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add entire Localised Meal Plan");
		btnNewButton.setBounds(102, 25, 184, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add meal from Localised Meal Plan");
		btnNewButton_1.setBounds(102, 59, 184, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Single Meal");
		btnNewButton_2.setBounds(102, 93, 184, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add entire Custom Meal Plan");
		btnNewButton_3.setBounds(102, 127, 184, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add meal from Custom Meal Plan");
		btnNewButton_4.setBounds(102, 161, 184, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Add FoodItem(s)");
		btnNewButton_5.setBounds(102, 195, 184, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Cancel");
		btnNewButton_6.setBounds(152, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
    }
}