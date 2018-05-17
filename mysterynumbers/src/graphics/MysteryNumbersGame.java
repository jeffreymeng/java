/*
 * Programmer: Jeffrey Meng and Dylan Yang
 * Date: Mar 30, 2018
 * Purpose: This class creates an instance of the game to run.
 */

package graphics;

import java.awt.CardLayout;

import javax.swing.*;

public class MysteryNumbersGame {
	final int numCards = 3;
	JFrame frame;
	JPanel panel, gamePanel;

	public MysteryNumbersGame() {
		frame = new JFrame("Mystery Numbers");

	}

	public void setupWindow() {
		int width = 800;
		int height = 600;

		
		TitlePanel titlePanel = new TitlePanel(frame, this);
		GamePanel gamePanel = new GamePanel(frame, this);
		
		
		panel = new JPanel();
		panel.setLayout(new CardLayout());
		panel.add(titlePanel, "titleCard");
		panel.add(gamePanel, "gameCard");

		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);

	}
	public void startGame() {
		CardLayout layout = (CardLayout) (panel.getLayout());
		layout.show(panel, "gameCard");
	}

}
