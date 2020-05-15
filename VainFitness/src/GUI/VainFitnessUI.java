package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VainFitnessUI {

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
		
		JButton CaloricValue = new JButton("Get Caloric Value ");
		CaloricValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaloricValue CalFrame = new CaloricValue();
				
				//CalFrame.setVisible(true);
				//CalFrame.main(null);
				frame.setVisible(false);
				CalFrame.showFrame();
				
				
			}
		});
		CaloricValue.setBounds(45, 188, 175, 25);
		frame.getContentPane().add(CaloricValue);
	}

}
