package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 * 
 */
public class ViewLMPList {

	private JFrame frame;
	private DefaultListModel listModel;
	private JButton viewButton;
	private JButton backButton;
	private JList list;

	/**
	 * Create the application.
	 */
	public ViewLMPList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Localised Meal Plans");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		list = new JList();
		list.setModel(listModel);
		list.setBounds(33, 23, 363, 158);
		frame.getContentPane().add(list);
		
		viewButton = new JButton("View");
		viewButton.setBounds(66, 212, 89, 23);
		frame.getContentPane().add(viewButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(241, 212, 89, 23);
		frame.getContentPane().add(backButton);
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @return the list
	 */
	public JList getList() {
		return list;
	}

	public void addElemListModel(String text) {
		this.listModel.addElement(text);
	}
	
	public void addViewListener(ActionListener listenForView) {
		viewButton.addActionListener(listenForView);
	}
	
	public void addBackListener(ActionListener listenForBack) {
		backButton.addActionListener(listenForBack);
	}
}