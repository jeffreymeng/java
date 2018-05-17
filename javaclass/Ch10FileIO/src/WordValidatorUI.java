/*
 * Date: May 11, 2018
 * Programmer: Jeffrey Meng
 * Purporse: A UI for the WordValidator class.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WordValidatorUI implements ActionListener, KeyListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel, resultLabel, loadingLabel;
	private JTextField inputField;
	private JButton submitButton;
	private String filepath;	
	private WordValidator validator;
	private JProgressBar progressBar;	

	public static void main(String[] args) {
		WordValidatorUI wordValidatorUI = new WordValidatorUI("words.txt");
		wordValidatorUI.setupWindow();
	
	}
	public WordValidatorUI(String filepath) {

		this.filepath = filepath;
		boolean validateAgain = true;
		String input;

		validator  = new WordValidator("words.txt");
		validator.init();
		

	}

	public void setupWindow() {

		frame = new JFrame("Word Validator");
		panel = new JPanel();
		
		panel.setLayout(new FlowLayout());

		inputLabel = new JLabel("Enter a word:");
		panel.add(inputLabel);
		
		inputField = new JTextField(15);
		inputField.addKeyListener(this);		
		panel.add(inputField);	
	
		submitButton = new JButton("Validate!");
		submitButton.addActionListener(this);
		panel.add(submitButton);
		
		resultLabel = new JLabel("");
		panel.add(resultLabel);	

		frame.add(panel);
		
		frame.setSize(400, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		// get the source of the button and see if it is the same.

		if (e.getSource() == submitButton) {
			validate();
	
		}
	}
	
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			validate();
		}

	}

	public void keyReleased(KeyEvent e) {


	}

	public void keyTyped(KeyEvent e) {
		
	}	

	public void validate() {
		if (validator.validate(inputField.getText())) {
			resultLabel.setText("That's a word!");
		} else {
			resultLabel.setText("That's not a word!");
		}

	}



}
