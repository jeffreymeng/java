/*
 * Programmer: Jeffrey Meng
 * Date: Feb 26, 2018
 * Purpose:
 */

package image;

import java.awt.*;
import javax.swing.*;

public class BackgroundPanel extends JPanel{
	static JFrame frame;
	private Image img;
	private int imgWidth;
	private int imgHeight;
	
	private BackgroundPanel() {
		ImageIcon i = new ImageIcon("src/background.jpg");
		img = i.getImage();
		imgWidth = img.getWidth(null);
		imgHeight = img.getHeight(null);
		
	}
	
	public int getWidth() {
		return imgWidth;
	}
	
	public int getHeight() {
		return imgHeight;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img,  0,  0,  null);
	}
	
	public void setupWindow(BackgroundPanel  panel) {
		frame.setSize(panel.getWidth(), panel.getHeight());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		frame = new JFrame("Background");
		BackgroundPanel panel = new BackgroundPanel();
		panel.setupWindow(panel);
	}
	
	
	
	
}
