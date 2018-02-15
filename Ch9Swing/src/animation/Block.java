/*
 * Programmer: Jeffrey Meng
 * Date: Feb 15, 2018
 * Purpose:
 */

package animation;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Block implements ActionListener {
	int windowWidth, windowHeight, framerate, rectWidth, rectHeight;
	int x, y;
	double xs = 1, ys = 1;
	JFrame frame;
	Timer timer;

	public Block() {
		this.windowWidth = 600;
		this.windowHeight = 400;
		this.framerate = 30;
		this.rectWidth = 50;
		this.rectHeight = 50;
		this.frame = new JFrame();

	}

	public Block(int framerate, JFrame frame, int rectWidth, int rectHeight) {

		this.framerate = framerate;
		this.rectWidth = rectWidth;
		this.rectHeight = rectHeight;
		this.frame = frame;

	}

	public void start() {
		timer = new Timer((int) 1000.0 / framerate, this);
		timer.start();
	}

	public void stop() {
		timer.stop();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getXspeed() {
		return xs;
	}

	public double getYspeed() {
		return ys;
	}
	public void setXspeed(double speed) {
		xs = speed;
	}
	public void setYspeed(double speed) {
		ys = speed;
	}
	public void actionPerformed(ActionEvent e) {
		x += (int) xs;
		y += (int) ys;

		if ((x + rectWidth) >= frame.getContentPane().getWidth() || (x) <= 0) {
			xs *= -1;

		}
		if ((y + rectHeight) >= frame.getContentPane().getHeight() || (y) <= 0) {
			ys *= -1;

		}
		System.out.println(x);
		frame.repaint();

	}

}
