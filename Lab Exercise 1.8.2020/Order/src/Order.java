/**
 * @(#)Order.java
 *
 *
 * @Author: 
 * @version 1.00 2020/1/8
 */

public class Order {
    public static void main(String[] args) {
        System.out.println(getOrderTotal(0, 1)); //21.95
        System.out.println(getOrderTotal(1, 0)); //15.95
        System.out.println(getOrderTotal(1, 1)); //35.95
        System.out.println(getOrderTotal(2, 1)); //41.85
        System.out.println(getOrderTotal(6, 6)); //153.00
    }
    
    public static double getOrderTotal(int bp, int nb)
    {
    	//Add code here
    	
    }
}
