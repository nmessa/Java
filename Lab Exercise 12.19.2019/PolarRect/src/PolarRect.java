/**
 * @(#)PolarRect.java
 *
 * PolarRect application
 *
 * @Author:  
 * @version 1.00 2019/12/19
 */
 
public class PolarRect {
    
    public static void main(String[] args) {
    	
    	Rect one = new Rect(3, 4);
    	Polar two = new Polar(5, 30);
    	System.out.println(one.rectToPolar());
    	System.out.println(two.polarToRect());
    }
}
/* Output
5.0 /_ 53.13010235415598
(4.330127018922194 , 2.4999999999999996)
*/