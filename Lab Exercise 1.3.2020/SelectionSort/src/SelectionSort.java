/**
 * @(#)SelectionSort.java
 *
 * SelectionSort application
 *
 * @Author:  
 * @version 1.00 2019/1/3
 */
import java.util.*;
 
public class SelectionSort {
    
    public static void main(String args[])
	{
		int theArray[] = new int[10];
		fillArray(theArray);
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		sort(theArray);
		
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		//Print the array
		/*for(int j = 0; j < theArray.length; j++)
		{
			System.out.print(theArray[j] + " ");
		}
		System.out.println(" ");*/
		
		//System.out.println("Execution time: " + (end-start) 
		//	+ " milliseconds");
		System.out.println("Execution time: " + (end-start) 
			+ " nanoseconds");
	}
	
	public static void fillArray(int a[])
	{
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++)
		{
			a[i] = rnd.nextInt();
		}
	}
	
	public static void sort(int a[ ])  //selection sort
	{
		//Add code here
		
		
	}
}

//Output
//Execution time: 10510 nanoseconds
