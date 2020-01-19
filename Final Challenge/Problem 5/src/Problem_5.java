/**
 * @(#)Problem_5.java
 *
 * Problem_5 application
 *
 * @Author:  
 * @version 1.00 2020/1/13
 */
 
public class Problem_5 {
    
    public static void main(String[] args) {
    	int maurice1[] = {3,5,10};
    	int maurice2[] = {6,8,9};
    	int maurice3[] = {1,8,20};
    	int steve1[] = {4,7,11};
    	int steve2[] = {7,12,14};
    	int steve3[] = {2,9,100};
    	
    	System.out.println(maurice_wins(maurice1, steve1));
		System.out.println(maurice_wins(maurice2, steve2));
		System.out.println(maurice_wins(maurice3, steve3));
    }
    
    public static boolean maurice_wins(int [] mArray, int [] sArray)
    {
    	//add code here
    	
    }
}

//Output
//true
//false
//true