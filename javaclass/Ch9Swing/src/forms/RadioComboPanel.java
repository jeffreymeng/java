/*
 * Programmer: Jeffrey Meng
 * Date: Mar 15, 2018
 * Purpose:
 */
package forms;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadioComboPanel implements ActionListener {

	private final int NUM_CARDS = 5;
	private JFrame frame;
	private JPanel controlPanel, displayPanel;
	private JPanel[] cards = new JPanel[NUM_CARDS];
	private JLabel[] labels = new JLabel[NUM_CARDS];
	private ButtonGroup radioGroup;
	private JRadioButton[] radioButtons = new JRadioButton[NUM_CARDS];
	private String[] comboBoxChoices = new String[NUM_CARDS];
	private JComboBox<String> select;
	//private RoundIcon icon = new RoundIcon(Color.RED);

	public void actionPerformed(ActionEvent e) {
		CardLayout layout = (CardLayout) (displayPanel.getLayout());
		if (e.getSource() == select) {
			layout.show(displayPanel, "Card" + (select.getSelectedIndex() + 1));
			radioButtons[select.getSelectedIndex()].setSelected(true);
		} else {
			for (int i = 0; i < cards.length; i++) {
				if (e.getSource() == radioButtons[i]) {
					
					layout.show(displayPanel, "Card" + (i + 1));
					select.setSelectedIndex(i);
				}

			}
		}

	}

	public void setupWindow() {
		frame = new JFrame("Easy Form 2");

		controlPanel = new JPanel();
		displayPanel = new JPanel();

		frame.setLayout(new GridLayout(2, 1));

		controlPanel.setLayout(new FlowLayout());
		displayPanel.setLayout(new CardLayout());

		radioGroup = new ButtonGroup();
		for (int i = 0; i < cards.length; i++) {
			labels[i] = new JLabel("Card " + (i + 1));
			
			cards[i] = new JPanel();
			cards[i].add(labels[i]);
			displayPanel.add(cards[i], "Card" + (i + 1));

			radioButtons[i] = new JRadioButton("Card " + (i + 1));
			radioButtons[i].addActionListener(this);
			//radioButtons[i].setIcon(icon);
			
			radioGroup.add(radioButtons[i]);
			controlPanel.add(radioButtons[i]);

			comboBoxChoices[i] = "Card " + (i + 1);

		}
		radioButtons[0].setSelected(true);

		select = new JComboBox<String>(comboBoxChoices);
		select.addActionListener(this);
		controlPanel.add(select);
		
		frame.add(controlPanel);
		frame.add(displayPanel);
		

		frame.getContentPane().add(controlPanel);
		frame.getContentPane().add(displayPanel);

		frame.setSize(300, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		RadioComboPanel window = new RadioComboPanel();
		window.setupWindow();
	}
}
