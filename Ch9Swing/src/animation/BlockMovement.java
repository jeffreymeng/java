/*
 * Programmer: Jeffrey Meng
 * Date: Feb 15, 2018
 * Purpose:
 */

package animation;

import graphics.GraphicsPanel;

import java.awt.*;

import javax.swing.*;

public class BlockMovement extends JPanel  {

	int rectwidth = 50;
	int rectheight = 50;
	int width = 600;
	int height = 400;
	
	JFrame frame = new JFrame("Main Frame");
	Block block;
	
	public static void main(String[] args) {
		BlockMovement panel = new BlockMovement();
		panel.setupWindow(panel);
		
		
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(block.getX(), block.getY(), rectwidth, rectheight);

	}

	public void setupWindow(BlockMovement panel) { 
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		block = new Block(60, frame, rectwidth, rectheight);
		
		frame.setVisible(true);
		
		block.start();

	}

	

}
