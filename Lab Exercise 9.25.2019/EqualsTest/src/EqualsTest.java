/**
 * @(#)EqualsTest.java
 *
 * EqualsTest application
 *
 * @author 
 * @version 1.00 2019/9/22
 */
 
public class EqualsTest {
    
    public static void main(String[] args) {
    	
    	String myString = "Yellow";
		String yourString = "Yellow";
		String hisString = new String("Yellow");
		String ourString = myString;
		System.out.println(myString == yourString);  //true
		System.out.println(myString == ourString);   //true
		System.out.println( myString.equals(yourString) );   //true
		System.out.println( myString.equals(ourString) );   //true
		System.out.println( myString == hisString );    //false
		System.out.println( myString.equals(hisString));   //true

    }
}
//Output
//true
//true
//true
//true
//false
//true