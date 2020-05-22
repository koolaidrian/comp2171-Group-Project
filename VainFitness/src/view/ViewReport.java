package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.GenerateReportController;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class ViewReport {

	private JFrame frame;
	private GenerateReportController control;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewReport window = new ViewReport();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public ViewReport(GenerateReportController control) {
		this.control = control;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Report");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton backButton = new JButton("Back");
		backButton.setBounds(176, 227, 89, 23);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 30, 298, 173);
		frame.getContentPane().add(textArea);
		textArea.append(control.seeReport());
		frame.setVisible(true);
	}
}
