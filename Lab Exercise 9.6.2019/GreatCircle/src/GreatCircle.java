/**
 * @(#)GreatCircle.java
 *
 * GreatCircle application
 *
 * @Author:  
 * @version 1.00 2019/9/6
 */
import java.text.DecimalFormat;  //needed to round output value
 
public class GreatCircle {
    
    public static void main(String[] args) {
    	//Declare and initialize variables
    	//comment out r declaration for the units you desire
    	//int r = 6371; //Kilometers
    	int r = 3950; //Miles
    	double a, c, d;
    	
    	double lat1 = 48.87;	//Paris
    	double lon1 = -2.33;
    	
    	double lat2 = 37.8;	//San Francisco
    	double lon2 = 122.4;
    	
    	double dlon, dlat;  //used to hold delta values of latitude and longitude
    	
    	//Convert latitudes and longtiudes from degrees to radians
    	//use Math.toRadians() method
    	//Add code here
    	
    	
    	//calculate delta latitude and delta longtitude (be sure to take absolute value 
    	//of difference
    	//Add code here
    	
    	
    	
    	//Make calculations
    	//Add code here
    	
    	
    	//round to two decimal places
    	DecimalFormat df = new DecimalFormat("###.##");
    	
    	//System.out.println(df.format(d) + " kilometers");
    	System.out.println(df.format(d) + " miles");
    }
}

//Output
//5547.69 miles