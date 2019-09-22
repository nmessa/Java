/**
 * @(#)Base_Conversion.java
 *
 * Base_Conversion application
 *
 * @nmessa 
 * @version 1.00 2019/9/23
 */
 
public class Base_Conversion {
    
    public static void main(String[] args) {
    	
    	int binary, octal, hex, decimal;
    	String sbin, soct, shex, wierd;
    	decimal = 42;
    	
    	//convert decimal value to different base
    	sbin = Integer.toBinaryString(decimal);
    	soct = Integer.toOctalString(decimal);
    	shex = Integer.toHexString(decimal);
    	
    	//print results as strings
    	System.out.println(decimal + " = " + sbin + " base 2");
    	System.out.println(decimal + " = " + soct + " base 8");
    	System.out.println(decimal + " = " + shex + " base 16");
    	
    	//Turn strings back to numbers that are base 10
    	binary = Integer.parseInt(sbin, 2);
    	octal = Integer.parseInt(soct, 8);
    	hex = Integer.parseInt(shex, 16);
    	
    	//print results as numbers
    	System.out.println(binary);
    	System.out.println(octal);
    	System.out.println(hex);
    	
    	//Converting to a weird base
    	wierd = Integer.toString(5879187, 35);
    	System.out.println("5879187 = " + wierd + " base 35");
    	
    	//Convert base 35 number back to base 10
    	decimal = Integer.parseInt(wierd, 35);
    	System.out.println(wierd + " base 35 = " + decimal);
    }
}

// Output
// 42 = 101010 base 2
// 42 = 52 base 8
// 42 = 2a base 16
// 42
// 42
// 42
// 5879187 = 3w4br base 35
// 3w4br base 35 = 5879187