package GUI;

import java.awt.EventQueue;
import model.fitnessController;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreateClientProfileUI {
	
	private fitnessController controller;
	//

	private JFrame frame;
	private JFrame MainFrame;
	private String Firstname;
	private String Lastname;
	private String Contact;
	private String Email;
	private int Day;
	private int Month;
	private int Year;
	private Double Height;
	private String Gender;
	private String Address;
	private int Carbs;
	private int Protein;
	private int Fat;
	private Double DailyConsumption;
	private Double InitialWeight;
	private Double CurrentWeight;
	private Double IdealWeight;
	private String Username;
	private String Password;
	//
	private JTextField firstname;
	private JTextField lastname;
	private JTextField contact;
	private JTextField email;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JTextField height;
	private JTextField gender;
	private JTextField address;
	private JTextField carbs;
	private JTextField protein;
	private JTextField fat;
	private JTextField dailyConsumption;
	private JTextField initialWeight;
	private JTextField currentWeight;
	private JTextField idealWeight;

	private JProgressBar progressBar;
	private JTextField username;
	private JPasswordField password1;
	private JPasswordField password2;
	
	JLabel passwordLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateClientProfileUI window = new CreateClientProfileUI();
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
	public CreateClientProfileUI() {
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
		frame.setBounds(100, 100, 670, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton confirmationBtn = new JButton("Confirm");
		confirmationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controller.createClientProfile("Client",Username,Password,Firstname,Lastname,Contact,Email,Height, Gender, Day, Month, Year, Address, DailyConsumption, Carbs, Protein, Fat, InitialWeight, CurrentWeight,IdealWeight);
				System.out.println(controller.getClientInfo());
				if(controller.checkCurrentUser()) {
					JOptionPane.showMessageDialog(null, "Profile Created!");
					ClientProfileUI clientProfileUI = new ClientProfileUI();
					clientProfileUI.showFrame(MainFrame);
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Profile was not created successfully. Please try again!");
					hideFrame();
				}
			}
		});
		confirmationBtn.setBounds(484, 358, 123, 32);
		frame.getContentPane().add(confirmationBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hideFrame();
			}
		});
		cancelBtn.setBounds(57, 358, 115, 32);
		frame.getContentPane().add(cancelBtn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(29, 68, 589, 277);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Member Info", null, panel_4, null);
		panel_4.setLayout(null);
		
		username = new JTextField();
		username.setBounds(154, 65, 231, 22);
		panel_4.add(username);
		username.setColumns(10);
		
		password1 = new JPasswordField();
		password1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		password1.setBounds(154, 113, 231, 22);
		panel_4.add(password1);
		
		password2 = new JPasswordField();
		password2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(!(String.valueOf(password1.getPassword()).contentEquals(String.valueOf(password2.getPassword())))) {
					passwordLabel.setText("Password Mismatch!");
					
				}else {
					passwordLabel.setText("Password Match!");
				}
				
			}
		});
		password2.setBounds(156, 160, 231, 22);
		panel_4.add(password2);
		
		JLabel lblNewLabel_20 = new JLabel("Username");
		lblNewLabel_20.setBounds(12, 68, 87, 16);
		panel_4.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Password");
		lblNewLabel_21.setBounds(12, 116, 87, 16);
		panel_4.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Re-enter Password");
		lblNewLabel_22.setBounds(12, 163, 110, 16);
		panel_4.add(lblNewLabel_22);
		
		JButton saveMemberInfo = new JButton("save");
		saveMemberInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Username = username.getText();
				Password = String.valueOf(password2.getPassword());
			}
		});
		saveMemberInfo.setBounds(475, 209, 97, 25);
		panel_4.add(saveMemberInfo);
		
		passwordLabel = new JLabel("");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(208, 195, 125, 16);
		panel_4.add(passwordLabel);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PersonalInfo", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname:");
		lblNewLabel_1.setBounds(12, 25, 106, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lastname");
		lblNewLabel_2.setBounds(12, 79, 56, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact");
		lblNewLabel_3.setBounds(12, 148, 67, 16);
		panel.add(lblNewLabel_3);
		
		firstname = new JTextField();
		firstname.setBounds(12, 44, 116, 22);
		panel.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(12, 101, 116, 22);
		panel.add(lastname);
		lastname.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(12, 169, 116, 22);
		panel.add(contact);
		contact.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setBounds(231, 25, 56, 16);
		panel.add(lblNewLabel_4);
		
		email = new JTextField();
		email.setBounds(231, 44, 116, 22);
		panel.add(email);
		email.setColumns(10);
		
		JButton savePersonalInfo = new JButton("save");
		savePersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(email.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter values!");
				}else {
				Firstname = firstname.getText();
				Lastname = lastname.getText();
				Contact = contact.getText();
				Email = email.getText();
				progressBar.setValue(25);
				
				}
			}
		});
		savePersonalInfo.setBounds(475, 209, 97, 25);
		panel.add(savePersonalInfo);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Profile Info", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton saveProfileInfo = new JButton("save");
		saveProfileInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(address.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter values!");
				}else {
				
				Height = Double.parseDouble(height.getText());
				Gender = gender.getText();
				Address = address.getText();
				Day = Integer.parseInt(day.getText());
				Month = Integer.parseInt(month.getText());
				Year = Integer.parseInt(year.getText());
				progressBar.setValue(50);
				}
				
			}
		});
		saveProfileInfo.setBounds(475, 209, 97, 25);
		panel_1.add(saveProfileInfo);
		
		JLabel lblNewLabel_5 = new JLabel("Height (cm) :");
		lblNewLabel_5.setBounds(12, 24, 91, 16);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setBounds(12, 77, 56, 16);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address: ");
		lblNewLabel_7.setBounds(12, 133, 56, 16);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date of Birth:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(220, 24, 224, 16);
		panel_1.add(lblNewLabel_8);
		
		day = new JTextField();
		day.setBounds(224, 71, 64, 22);
		panel_1.add(day);
		day.setColumns(10);
		
		month = new JTextField();
		month.setBounds(300, 71, 64, 22);
		panel_1.add(month);
		month.setColumns(10);
		
		year = new JTextField();
		year.setBounds(380, 70, 64, 23);
		panel_1.add(year);
		year.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("DD");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(230, 53, 56, 16);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("MM");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(300, 53, 56, 16);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("YYYY");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(380, 53, 56, 16);
		panel_1.add(lblNewLabel_11);
		
		height = new JTextField();
		height.setBounds(12, 42, 116, 22);
		panel_1.add(height);
		height.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(12, 98, 116, 22);
		panel_1.add(gender);
		gender.setColumns(10);
		
		address = new JTextField();
		address.setBounds(12, 151, 116, 22);
		panel_1.add(address);
		address.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Nutritional Goal Info", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton saveNutrionalGoalInfo = new JButton("save");
		saveNutrionalGoalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(carbs.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter values!");
				}else {
				DailyConsumption = Double.parseDouble(dailyConsumption.getText());
				Fat = Integer.parseInt(fat.getText());
				Protein = Integer.parseInt(protein.getText());
				Carbs = Integer.parseInt(carbs.getText());
				progressBar.setValue(75);
				}
			}
		});
		saveNutrionalGoalInfo.setBounds(475, 209, 97, 25);
		panel_2.add(saveNutrionalGoalInfo);
		
		JLabel lblNewLabel_12 = new JLabel("Please enter your ideal daily consumption (Kcal)");
		lblNewLabel_12.setBounds(12, 27, 277, 16);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Please enter Fat percentage: ");
		lblNewLabel_13.setBounds(12, 73, 240, 16);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Please enter Protein percentage: ");
		lblNewLabel_14.setBounds(12, 122, 240, 16);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Please enter Carbs percentage: ");
		lblNewLabel_15.setBounds(12, 176, 185, 16);
		panel_2.add(lblNewLabel_15);
		
		carbs = new JTextField();
		carbs.setBounds(301, 173, 116, 22);
		panel_2.add(carbs);
		carbs.setColumns(10);
		
		protein = new JTextField();
		protein.setBounds(301, 119, 116, 22);
		panel_2.add(protein);
		protein.setColumns(10);
		
		fat = new JTextField();
		fat.setBounds(301, 70, 116, 22);
		panel_2.add(fat);
		fat.setColumns(10);
		
		dailyConsumption = new JTextField();
		dailyConsumption.setBounds(301, 24, 116, 22);
		panel_2.add(dailyConsumption);
		dailyConsumption.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Total: ");
		lblNewLabel_16.setBounds(258, 218, 56, 16);
		panel_2.add(lblNewLabel_16);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Weight Goal Info", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton saveWeightGoalInfo = new JButton("save");
		saveWeightGoalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(initialWeight.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter values!");
				}else {
				InitialWeight = Double.parseDouble(initialWeight.getText());
				CurrentWeight = Double.parseDouble(currentWeight.getText());
				IdealWeight = Double.parseDouble(idealWeight.getText());
				progressBar.setValue(100);
				}
			}
		});
		saveWeightGoalInfo.setBounds(475, 209, 97, 25);
		panel_3.add(saveWeightGoalInfo);
		
		JLabel lblNewLabel_17 = new JLabel("Initial Weight (pounds)");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(45, 37, 144, 16);
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Current Weight (pounds)");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(370, 37, 144, 16);
		panel_3.add(lblNewLabel_18);
		
		initialWeight = new JTextField();
		initialWeight.setBounds(55, 66, 134, 22);
		panel_3.add(initialWeight);
		initialWeight.setColumns(10);
		
		currentWeight = new JTextField();
		currentWeight.setBounds(370, 66, 144, 22);
		panel_3.add(currentWeight);
		currentWeight.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Ideal Weight (pounds)");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(223, 140, 144, 16);
		panel_3.add(lblNewLabel_19);
		
		idealWeight = new JTextField();
		idealWeight.setBounds(233, 169, 116, 22);
		panel_3.add(idealWeight);
		idealWeight.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Create Client Profile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 13, 578, 42);
		frame.getContentPane().add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(246, 358, 146, 14);
		frame.getContentPane().add(progressBar);
	}
}
