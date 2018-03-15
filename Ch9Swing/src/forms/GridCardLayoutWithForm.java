/*
 * Programmer: Jeffrey Meng
 * Date: Mar 14, 2018
 * Purpose:
 */

/*
 * Programmer: Jeffrey Meng
 * Date: Mar 14, 2018
 * Purpose:
 */

package forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridCardLayoutWithForm implements ActionListener {
	
	private JFrame frame;
	private JPanel controlPanel, inputPanel, displayPanel;
	private JLabel inputLabel, displayLabel;
	private JTextField inputField;
	private JButton submitButton, clearButton, exitButton;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			displayLabel.setText(inputField.getText());
		} else if (e.getSource() == clearButton) {
			inputField.setText("");
			displayLabel.setText("");
		} else {
			System.exit(0);
		}

	}

	public void setupWindow() {
		
	}

	public static void main(String[] args) {
		GridCardLayoutWithForm window = new GridCardLayoutWithForm();
		window.setupWindow();
	}
}
