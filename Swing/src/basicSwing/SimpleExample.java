/*
 * Programmer: Jeffrey Meng
 * Date: Nov 3, 2017
 * Purpose: Learn Swing. Code from http://zetcode.com/tutorials/javaswingtutorial/firstprograms/.
 */
//http://zetcode.com/tutorials/javaswingtutorial/firstprograms/
//comments by me
package basicSwing;

//import the swing classes that we use
import java.awt.EventQueue;
import javax.swing.JFrame;

//it inherits from the JFrame component. JFrame is a top level container, 
//whose purpose is to hold components of the application
public class SimpleExample extends JFrame {

    public SimpleExample() {
    	
        initUI();//it's good pratice not to put the application code into the constructor, 
        //instead delegate to a specific method.
    }

    private void initUI() {
        
        setTitle("Simple example");
        //title of the window. (this is an inherited JFrame method I think)
        
        setSize(300, 200);
        //resize the window to 300px wide and 200px tall
        
        setLocationRelativeTo(null);
        //this centers the window on the screen.
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this will let us close the window when we click the close button.
        //by default when we click the close button nothing happens.
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SimpleExample ex = new SimpleExample();
            //this creates an instance of our code example(which inherits methods from JFrame)
            //the invokeLater() method places the app on the swing event queue, which ensures 
            //that all UI components are concurrency safe, so the GUI won't hang.
            
            ex.setVisible(true);
            //this makes the window visible on the screen.
        });
    }
}