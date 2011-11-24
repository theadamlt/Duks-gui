package com.edtu.duks.gui;

import javax.swing.*;

public class JPanelGui {
	
	public JPanelGui() {
		// And God said "Let there be a GUI!" and there was a GUI.
		JFrame frame = new JFrame();
		frame.setLayout(null);
		
		// Makes the generate button.
		JButton genButton = new JButton("Generér");
		genButton.setBounds(100, 200, 200, 100);
		
		
		// Makes the "edit" button which will open an edit screen to edit the list of schools in the system.
		JButton schoolChangeButton = new JButton("Redigér");
		schoolChangeButton.setBounds(250, 40, 100, 50);
		
		// Makes the selection list for schools.
		JComboBox schoolComboBox = new JComboBox();
		schoolComboBox.setBounds(50, 40, 100, 50);
		
		
		// Makes the "edit" button which will open an edit screen to edit the list of classes for the current selected school.
		JButton classChangeButton = new JButton("Redigér");
		classChangeButton.setBounds(250, 115, 100, 50);
		
		// Makes the selection list for classes in the current selected school.
		JComboBox classComboBox = new JComboBox();
		classComboBox.setBounds(50, 115, 100, 50);
		
		
		// Makes the labels that'll tell you whose the "duks".
		
		JLabel duksLabel = new JLabel("DUKS:");
		duksLabel.setBounds(575, 75, 50, 50);
		
		JLabel duksNameLabel1 = new JLabel("McKarl-Smart Fuckhovedson");
		duksNameLabel1.setBounds(425, 100, 500, 50);
		
		JLabel duksNameLabel2 = new JLabel("McKarl-Smart Fuckhovedson");
		duksNameLabel2.setBounds(600, 100, 500, 50);
		
		JLabel xDuksLabel = new JLabel("RERSERVE:");
		xDuksLabel.setBounds(560, 150, 75, 50);
		
		JLabel xDuksNavn = new JLabel("McKarl-Smart Fuckhovedson");
		xDuksNavn.setBounds(510, 175, 500, 50);
		
		
		// Makes the ekstra button for info, web, etc.
		
		JButton infoButton = new JButton("INFORMATION");
		infoButton.setBounds(50, 400, 200, 50);
		
		JButton webButton = new JButton("HJEMMESIDE");
		webButton.setBounds(260, 400, 200, 50);
		
		
		// And God said "I better set my new items on my GUI!" and it happened.
		frame.add(genButton);
		
		frame.add(schoolChangeButton);
		frame.add(schoolComboBox);
		
		frame.add(classChangeButton);
		frame.add(classComboBox);
		
		frame.add(duksLabel);
		frame.add(duksNameLabel1);
		frame.add(duksNameLabel2);
		frame.add(xDuksLabel);
		frame.add(xDuksNavn);
		
		frame.add(infoButton);
		frame.add(webButton);
		
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
