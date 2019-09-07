/**
 * @(#)HelloSA.java
 *
 * HelloSA application
 *
 * @Author: 
 * @version 1.00 2019/9/10 Hello World standalone applet
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class HelloSA extends Applet{
	//define a paint method
	//all applets have paint method
	//this overloads the built in paint method that paints a blank screen
    public void paint(Graphics screen)
	{
		
		//Add code here
        
	}

    public static void main(String[] args)
    {
    	//Construct a Frame to put Applet in
        //Add code here
        
        
        //Set frame size to 400 x 300
        //Add code here
        
        
        //Construct an Applet
        //Add code here
        
        
        //Add to frame
        //Add code here
        
        
        //Make it visible
        //Add code here
        

		//Create a WindowListener method
		//this defines the windowClosing event
        myFrame.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        	}
        });
    }//end of main
} //end of class
