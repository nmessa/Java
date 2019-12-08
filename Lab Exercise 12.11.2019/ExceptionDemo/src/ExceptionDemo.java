/**
 * @(#)ExceptionDemo.java
 *
 * ExceptionDemo application
 *
 * @author 
 * @version 1.00 2016/12/9
 */
import java.util.*;

public class ExceptionDemo {
    public static int score;
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the student score: ");
    	int score = sc.nextInt();
		setStudentScore(score);
    	System.out.println(score);
    }
    
    /*
* precondition: 0 <= score < =100
*/
public static void setStudentScore(int theScore){
	if( (theScore<0) || (theScore>100))
	{
		String s = "score must be between 0 and 100 inclusive";
		IllegalArgumentException e = new IllegalArgumentException(s);
		throw e;
	}
	else
	{
		score = theScore;
	}
}
}
