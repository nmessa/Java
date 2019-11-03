/**
 * @(#)HistogramSA.java
 *
 * HistogramSA application
 *
 * @Author: 
 * @version 1.00 2019/11/7
 */

import javax.swing.JFrame;
import java.awt.*;
import java.util.Random;

public class HistogramSA extends Canvas{
	
	//Declare static variables 
    private static int total[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static final int TRIALS = 10000;
	private static Color colors[] = {Color.RED, Color.GREEN};
	
    public static void main(String[] args) {
    	//Construct a JFrame object
    	JFrame frame = new JFrame("My Histogram");
    	
    	//Construct a Canvas object from a HistogramSA
        Canvas canvas = new HistogramSA();
        
        //Set the size of canvas to 1000 x 800
        canvas.setSize(1000, 800);
        
        //Add the canvas to the frame
        frame.add(canvas);
        
        //pack hte frame and make visible
        frame.pack();
        frame.setVisible(true);  
        	
        //Call the generateHistogram method
        generateHistogram();
    }
    
    
    public static void generateHistogram()
    {
    	//Initialize variables
        Random rndm = new Random();
        int die1=0, die2=0, dice;
        
        //Run simulation
        //Add code here
        
        
    }
    
    //paint the histogram on the canvas
    public void paint(Graphics g) 
    {
		g.drawString("Dice Roll Simulation with " + TRIALS + " trials", 450, 30 );
		
		//Paint numbers from 2 to 12
		//Add code here
		
		
		
		//Paint the rectangles for the histogram
		//Add code here
		
		
	}
    
    
}
