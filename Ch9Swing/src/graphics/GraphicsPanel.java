/*
 * Programmer: Jeffrey Meng
 * Date: Feb 6, 2018
 * Purpose:
 */

package graphics;

import java.awt.*;

import javax.swing.*;

public class GraphicsPanel extends JPanel{
	final int width = 800;
	final int height = 600;
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		graphics.setColor(new Color(222, 184, 135));
		/*Draw a rectangle flush to the bottom of the panel*/
		graphics.fillRect(0, height - 100, width, height);
		
		graphics.setColor(Color.RED);
		
		Polygon triangle = new Polygon();
		triangle.addPoint(100, 100);
		triangle.addPoint(200, 100);
		triangle.addPoint(150, 200);
		
		graphics.drawPolygon(triangle);
	}
	
	public void setupWindow(GraphicsPanel panel) {
		JFrame frame = new JFrame("Main Frame");
		
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GraphicsPanel panel = new GraphicsPanel();
		panel.setupWindow(panel);
		

	}

}