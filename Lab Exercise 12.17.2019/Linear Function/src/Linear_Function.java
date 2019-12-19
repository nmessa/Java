/**
 * @(#)Linear_Function.java
 *
 * Linear_Function application
 *
 * @Author: nmessa 
 * @version 1.00 2019/12/17
 */
import java.io.*;
import java.util.*;
 
public class Linear_Function {
    
    public static void main(String[] args) {
    	
    	Scanner kbReader = new Scanner(System.in);
		System.out.print("What is the slope of your line? ");
		double slope = kbReader.nextDouble();
		System.out.print("What is the y-intercept of your line? ");
		double yInt = kbReader.nextDouble( );
		LinearFunction line = new LinearFunction(slope, yInt);
		System.out.println("\nSlope of this line is: " + 
			line.getSlope( ));
		System.out.println("Y-intercept of this line is: " + 
			line.getYIntercept( ));
		System.out.println("Root of this line is: " + 
			line.getRoot( ));
		System.out.print("\nWhat is an x value for which you wish" + 
			" to solve for y? ");
		double x = kbReader.nextDouble( );
		double yValue = line.getYValue(x);
		System.out.println("The y value corresponding to x = " + 
			x + " is " + yValue);
		System.out.print("\nWhat is a y value for which " + 
			"you wish to solve for x? ");
		double y = kbReader.nextDouble( );
		double xValue = line.getXValue(y);
		System.out.println("The x value corresponding to y = " + 
			y + " is " + xValue);
    }
}
