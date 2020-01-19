/**
 * @(#)Problem_8.java
 *
 * Problem_8 application
 *
 * @Author:  
 * @version 1.00 2020/1/13
 */
 
public class Problem_8 {
    
    public static void main(String[] args) {
    	int a1[] = {1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15};
    	int a2[] = {92,6,73,-77,81,-90,99,8,-85,34};
    	int a3[] = {91,-4,80,-73,-28};
    	int a4[] = {};
    	
    	a1 = sum_neg(a1);
		a2 = sum_neg(a2);
		a3 = sum_neg(a3);
		a4 = sum_neg(a4);
		
		printArray(a1);
		printArray(a2);
		printArray(a3);
		printArray(a4);
    }
    
    public static int[] sum_neg(int [] ary)
    {
    	//add code here
    	
    }
    
    public static void printArray(int[] ary)
    {
    	if (ary.length == 0)
    	{
    		System.out.println("[]");
    	}
    	else
    	{
    		System.out.print("[" + ary[0] + ", " + ary[1] + "]\n");
    	}		
    }
}

//Output
//[10, -65]
//[7, -252]
//[2, -105]
//[]
