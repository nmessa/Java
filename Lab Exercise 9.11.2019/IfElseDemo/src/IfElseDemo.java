/**
 * @(#)IfElseDemo.java
 *
 * IfElseDemo application
 *
 * @author 
 * @version 1.00 2017/9/14
 */
 
public class IfElseDemo {
    
    public static void main(String[] args) {
    	int x, y, num, den, max;
    	double a, b, c, discriminant;
    	//Absolute value
    	x = -3;
    	if (x < 0)
    		x = -x;
    	System.out.println("The absolute value is " + x);
    	System.out.println();
    	
    	//Order values with x smallest and y largest
    	x = 5;
    	y = 3;
    	if (x > y)
    	{
    		int t = x;
    		x = y;
    		y = t;
    	}
    	System.out.println(x + "  " + y);
    	System.out.println();
    	
    	//Find maximum of x and y
    	x = 13;
    	y = 42;
    	if (x > y)
    		max = x;
    	else
    		max = y;
    	System.out.println("Maximum value is " + max);
    	System.out.println();
    	
    	
    	//Check for division by 0
    	num = 13;
    	den = 0;
    	if (den == 0)
    		System.out.println("Division by zero error");
    	else
    		System.out.println("Quotient = " + num/den);
    		
    	System.out.println();
    	
    	//Error check quadratic formula
    	a = 1.0;
    	b =-3.0;
    	c = -10.0;
    	discriminant = b*b - 4*a*c;
    	if (discriminant < 0.0)
    	{
    		System.out.println("No real roots");
    	}
    	else
    	{
    		System.out.println((-b + Math.sqrt(discriminant))/2.0);
    		System.out.println((-b - Math.sqrt(discriminant))/2.0);
    	}
    	
    		
    	
    	
    	
    }
}
