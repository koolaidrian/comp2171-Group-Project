package GUI;

import java.awt.EventQueue;
import java.awt.Image;	

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.fitnessController;

import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ClientProfileUI {
	
	private fitnessController controller;
	private JFrame MainFrame;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientProfileUI window = new ClientProfileUI();
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
	public ClientProfileUI() {
		initialize();
	}
	
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
		//this.controller = fitnessController.getInstance();
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
		frame.setBounds(100, 100, 700, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.controller = fitnessController.getInstance();
		
		JLabel nameLabel = new JLabel("Client Name");
		
		nameLabel.setText(controller.getClientUsername());
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(192, 13, 268, 16);
		frame.getContentPane().add(nameLabel);
		
		JProgressBar nutritionalProgressBar = new JProgressBar();
		nutritionalProgressBar.setBounds(351, 105, 296, 49);
		frame.getContentPane().add(nutritionalProgressBar);
		
		JButton btnNewButton = new JButton("Add Meal ");
		btnNewButton.setBounds(50, 129, 153, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Meal Plan");
		btnNewButton_1.setBounds(50, 177, 153, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Today's Progress");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(393, 78, 166, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("View Profile");
		btnNewButton_2.setBounds(50, 228, 153, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton logoutBtn = new JButton("Log out");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.logoutUser();
				hideFrame();
			}
		});
		logoutBtn.setBounds(550, 9, 97, 25);
		frame.getContentPane().add(logoutBtn);
		
		JLabel profileIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/members.png")).getImage();
		profileIcon.setIcon(new ImageIcon(img));
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Camille\\git\\comp2171-Group-Project\\VainFitness\\img\\members.png"));
		profileIcon.setBounds(343, 167, 304, 224);
		frame.getContentPane().add(profileIcon);
	}
}
