package GUI;

import java.awt.EventQueue;
import edamanAPI.edaman;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CaloricValueUI {

	private JFrame frame;
	private JFrame MainFrame;
	private JTextField Query;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaloricValueUI window = new CaloricValueUI();
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
	public CaloricValueUI() {
		initialize();
	}
	
	public void showFrame(JFrame mainFrame) {
		this.MainFrame = mainFrame;
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
		frame.getContentPane().setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		frame.setBounds(100, 100, 569, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Get Caloric Value");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(62, 13, 409, 37);
		frame.getContentPane().add(Title);
		
		JLabel TextFieldLbl = new JLabel("Please enter food item");
		TextFieldLbl.setBounds(12, 79, 153, 16);
		frame.getContentPane().add(TextFieldLbl);
		
		Query = new JTextField();
		Query.setBounds(177, 76, 191, 22);
		frame.getContentPane().add(Query);
		Query.setColumns(10);
		
		
		JTextArea Result = new JTextArea();
		Result.setBounds(62, 243, 409, 121);
		
		JButton CaloricValBtn = new JButton("Submit");
		CaloricValBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String query;
				edaman api = new edaman();
				
				query = Query.getText();
				
				Result.setText(api.getCaloricValue(query));
				
				
			}
		});
		CaloricValBtn.setBounds(212, 148, 97, 25);
		frame.getContentPane().add(CaloricValBtn);
		
		
		frame.getContentPane().add(Result);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hideFrame();
			}
		});
		BackButton.setBounds(384, 377, 97, 25);
		frame.getContentPane().add(BackButton);
	}
}


//String query;
//edaman api = new edaman();
//
//query = Query.getText();
//
//Result.setText(api.getCaloricValue(query));

