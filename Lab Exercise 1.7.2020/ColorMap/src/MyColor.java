/**
 * @(#)MyColor.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2020/1/7
 */


public class MyColor {
	private int red;
	private int green;
	private int blue;

	//Constructor
    public MyColor(int r, int g, int b) {
    	//Add code here
    	
    }
    
    //Returns the Euclidean distance to another color
    public double distanceTo(MyColor c)
    {
    	//Add code here
    	
    }
    
    //Returns the color (r, g, b) value
    public String toString()
    {
    	String str = "(" + Integer.toString(red) + ", " + Integer.toString(green) + 
    		", " + Integer.toString(blue) + ")";
    	return str;
    }
    
    
}