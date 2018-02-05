/*
 * Programmer: Jeffrey Meng
 * Date: Feb 1, 2018
 * Purpose: Basic swing window.
 */

package basicSwing;

import javax.swing.*;

public class FirstWindow {
	public static void main(String[] args) {
		//instantiate a copy of this class to call non static method
		FirstWindow w = new FirstWindow();
		
		//run setup method
		w.setupWindow();
	}

	public void setupWindow() {
		//instantiate a jFrame object with the title First
		JFrame f = new JFrame("First");
		
		//change the title and size
		f.setTitle("First Window!");
		f.setSize(300, 200);
		
		//centers the window
		f.setLocationRelativeTo(null);
		
		//exits the program when the window is closed.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//makes the window visible.
		f.setVisible(true);

	}
}
