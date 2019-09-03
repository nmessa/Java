/**
 * @(#)StringDemo.java
 *
 * StringDemo application
 *
 * @author nmessa
 * @version 1.00 2019/9/3
 */
 
public class StringDemo {
    
    public static void main(String[] args) {
    	//Concatenation Demo
    	String first = "Hello";
    	String second = "World";
    	String third;
    	third = first + " " + second;
    	System.out.println(third);
    	
    	//Using length
    	int len = third.length();
    	System.out.println(third + " has " + len + " characters");
    	
    	//Using substring
    	System.out.println(third.substring(6));
    	System.out.println(third.substring(0,5));
    	
    	//Changing case
    	first = first.toUpperCase();
    	second = second.toLowerCase();
    	System.out.println(first + " " + second);
    	
    	//Concatenating a string with a numeric
    	System.out.println("Twenty seven = " + 27);
    	
    	//Escape sequences
    	System.out.println("\"Quotes\"");
    	String path = "C:\\Program Files\\Java\\jdk1.8.3u202";
    	System.out.println(path);
    }
}
