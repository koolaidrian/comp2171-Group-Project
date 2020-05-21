package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListDataListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 * 
 */
public class AddCMPView {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JList list;

	private DefaultListModel listModel;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCMPView window = new AddCMPView();
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
	public AddCMPView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Custom Meal Plan");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		listModel = new DefaultListModel();
		
		list = new JList();
		list.setModel(listModel);
		list.setBounds(81, 35, 250, 118);
		frame.getContentPane().add(list);
		
		btnNewButton = new JButton("Add Plan");
		btnNewButton.setBounds(110, 164, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(221, 164, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public JButton getAddPlanButton() {
		return btnNewButton;
	}

	public JButton getCancelButton_1() {
		return btnNewButton_1;
	}
	
	/**
	 * @return the list
	 */
	public JList getList() {
		return list;
	}

	/**
	 * @return the listModel
	 */
	public DefaultListModel getListModel() {
		return listModel;
	}

	/**
	 * @param listModel the listModel to set
	 */
	public void addElemListModel(String text) {
		this.listModel.addElement(text);
	}
	
	public void addListListener(ActionListener listenForListElem) {
		listModel.addListDataListener((ListDataListener) listenForListElem);
	}
	
	public void addAddPlanListener(ActionListener listenForPlan) {
		btnNewButton.addActionListener(listenForPlan);
	}
	
	public void addCancelListener(ActionListener listenForCancel) {
		btnNewButton_1.addActionListener(listenForCancel);
	}

}