package GulaSidor.GulaSidor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUI {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private DefaultListModel defaultListModel;
	private JTextField textField;
	
	public GUI() {
		GUI();
	}

	public void GUI() {
		mainFrame = new JFrame("Contact Book");
		mainFrame.setSize(400, 600);
		mainFrame.setLayout(new FlowLayout());
		textField = new JTextField();
		
		DefaultListModel <String> defaultListModel = new DefaultListModel<String>();
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		defaultListModel.addElement("Erik 0768765118");
		defaultListModel.addElement("Peter 031-1337");
		defaultListModel.addElement("Simon 031-112");
		
		
		JList<String> list = new JList<String>(defaultListModel);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250, 300));
		list.setBounds(100, 100, 75, 75);
		mainFrame.add(listScroller);
		textField.setPreferredSize(new Dimension(250, 20));
		textField.setBackground(new Color(250, 243, 25));
		list.setBackground(new Color(250, 243, 25));
		mainFrame.add(textField);
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(300, 300);

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
		mainFrame.setBackground(new Color(250, 243, 25));
//		mainFrame.setContentPane(controlPanel);
		controlPanel.setBackground(new Color(250, 243, 25));
	}

	private void eventDemo() {
//		headerLabel.setText("headerLabel setText");
		
		JButton chooseButton = new JButton("Choose");
		JButton addButton = new JButton("Add");
		JButton searchButton = new JButton("Search");
		JButton removeButton = new JButton("Remove");

		chooseButton.setActionCommand("Choose");
		addButton.setActionCommand("Add");
		searchButton.setActionCommand("Search");
		removeButton.setActionCommand("Remove");
		
		chooseButton.setBackground(new Color(250, 243, 25));
		addButton.setBackground(new Color(250, 243, 25));
		searchButton.setBackground(new Color(250, 243, 25));
		removeButton.setBackground(new Color(250, 243, 25));

		chooseButton.addActionListener(new ButtonClickListener());
		addButton.addActionListener(new ButtonClickListener());
		searchButton.addActionListener(new ButtonClickListener());
		removeButton.addActionListener(new ButtonClickListener());

		controlPanel.add(chooseButton);
		controlPanel.add(addButton);
		controlPanel.add(searchButton);
		controlPanel.add(removeButton);

		mainFrame.setVisible(true);

	}

	private class ButtonClickListener implements ActionListener {

		AddRemoveSearch ars = new AddRemoveSearch();
		
		public void actionPerformed(ActionEvent e) {

			String command = e.getActionCommand();

			if (command.equals("Choose")) {
				statusLabel.setText("Du tryckte Choose");
			} else if (command.equals("Add")) {
				statusLabel.setText("Du tryckte Add");
				statusLabel.setText(textField.getText());
			} else if (command.equals("Search")) {
				statusLabel.setText("Du tryckte Search");
			} else if (command.equals("Remove")) {
				statusLabel.setText("Du tryckte Remove");
			}
		}
	}
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.eventDemo();
	}
}
