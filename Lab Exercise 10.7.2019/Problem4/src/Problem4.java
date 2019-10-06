/**
 * @(#)Problem4.java
 *
 * Problem4 application
 *
 * @Author:  
 * @version 1.00 2019/10/7
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem4 extends JFrame implements ActionListener{
	//Create a JTextArea, JTextField, and a JButton
    JTextArea textarea = new JTextArea(1,3);
	JTextField inputField = new JTextField("", 1);
	JButton button1 = new JButton("Convert to ASCII");
	
	//Constructor
  	public Problem4()
	{
		super("ASCII Converter");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Create a Container and FlowLayout
		//Add code here
		
		
		//Attach the FLowLayout object to the Container object
		//Add code here
		
		//Add an ActionListener to the button
		//Add code here
			
		
		//Add the JTextArea, JTextField, JButton objects to the Container object
		//Add code here
		
		
		//Set the ContentPane
		//Add code here
		
	}
	
	//Overridden ActionListener abstract method
	public void actionPerformed(ActionEvent event)
	{
		
		//Add code here
		
	}
	
    public static void main(String[] args) {
    	
    	Problem4 eg = new Problem4();
    }
}
