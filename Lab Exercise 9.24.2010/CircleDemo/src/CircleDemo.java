/**
 * @(#)CircleDemo.java
 *
 * CircleDemo application
 *
 * @nmessa 
 * @version 1.00 2017/9/26
 */
import java.text.*;
 
public class CircleDemo {
    
    public static void main(String[] args) {
    	//Instantiate two circle objects
    	Circle cir1 = new Circle(5.1);
		Circle cir2 = new Circle(20.6);
		
		//Create a DecimalFormat object
		DecimalFormat df = new DecimalFormat("#.##");
		
		//Print areas of two circles
		System.out.println("Area of circle 1 = " + 
			df.format(cir1.area()));
		System.out.println("Area of circle 2 = " + 
			df.format(cir2.area()));
		
		//Print circumference of two circles
		System.out.println("Circumference of circle 1 = " + 
			df.format(cir1.circumference()));
		System.out.println("Circumference of circle 2 = " + 
			df.format(cir2.circumference()));
			
		//Print radius of two circles
		System.out.println("Radius Circle 1 = " + cir1.radius);
		System.out.println("Radius Circle 2 = " + cir2.radius);
    }
}
