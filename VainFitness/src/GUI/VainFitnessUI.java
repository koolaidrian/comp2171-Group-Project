package GUI;

import java.awt.EventQueue;
import model.fitnessController;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class VainFitnessUI {
	private fitnessController vainFitnessController;
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VainFitnessUI window = new VainFitnessUI();
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
	public VainFitnessUI() {
		this.vainFitnessController = fitnessController.getInstance();
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 672, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton CaloricValue = new JButton("Search Caloric Value ");
		CaloricValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaloricValueUI CalFrame = new CaloricValueUI();
				
				//CalFrame.setVisible(true);
				//CalFrame.main(null);
				frame.setVisible(false);
				CalFrame.showFrame(frame);
				
				
			}
		});
		CaloricValue.setBounds(45, 152, 175, 25);
		frame.getContentPane().add(CaloricValue);
		
		JLabel Title = new JLabel("VainFitness");
		Title.setBackground(Color.LIGHT_GRAY);
		Title.setFont(new Font("Tahoma", Font.ITALIC, 17));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(45, 13, 545, 73);
		frame.getContentPane().add(Title);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateClientProfileUI profileCreation = new CreateClientProfileUI();
				frame.setVisible(false);
				profileCreation.showFrame(frame);
			}
		});
		btnNewButton.setBounds(45, 201, 175, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton ExitBtn = new JButton("Exit");
		ExitBtn.setForeground(UIManager.getColor("List.selectionBackground"));
		ExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBtn.setBackground(Color.BLACK);
		ExitBtn.setBounds(493, 365, 97, 25);
		frame.getContentPane().add(ExitBtn);
		
		JLabel VainFitnessIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/VF.png")).getImage();
		VainFitnessIcon.setIcon(new ImageIcon(img));
		VainFitnessIcon.setBounds(289, 64, 301, 296);
		frame.getContentPane().add(VainFitnessIcon); 
		
		JButton btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.setBounds(45, 252, 175, 25);
		frame.getContentPane().add(btnNewButton_1);
	}

}
