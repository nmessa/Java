/**
 * @(#)CircleStats.java
 *
 * CircleStats application
 *
 * @Author: 
 * @version 1.00 2019/9/10 Problem 2
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CircleStats extends Applet{
	
	//define static class variables that can 
	//be used by all methods
    private static String diameter, circumference, area;
    
    //Define paint method
	public void paint(Graphics screen)
	{
		//Add code here
        
        
	}

    public static void main(String[] args)
    {
    	//Declare local variable
    	double radius;
    	
    	//Create a Scanner object
    	//Add code here
        
    	
    	//Get radius from user and store in variable radius
    	//Add code here
        
    	
    	//calculate diameter and convert to String store in 
    	//global variable diameter
    	//Add code here
        
    	
    	//calculate circumference and convert to String store in 
    	//global variable circumference
    	//Add code here
        
    	
    	//calculate area and convert to String store in 
    	//global variable area
    	//Add code here
        
    	
    	//Define a Frame to put Applet in
        //Add code here
        
        
        //set applet frame size to 400 x 300
        //Add code here
        
        
        //Construct the CircleStats Applet and add to frame
        //Add code here
        
        
        //Add applet to frame
        //Add code here
        
        
        //make frame visible
        //Add code here
        

		//define a WindowListener
        myFrame.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        	}
        });
    }//end of main
}//end of class
