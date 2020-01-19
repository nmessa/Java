/**
 * @(#)Problem_3.java
 *
 * Problem_3 application
 *
 * @Author:  
 * @version 1.00 2020/1/10
 */
 
public class Problem_3 {
    
    public static void main(String[] args) {
    	int a1[] = {1,2,3,4,5};
    	int a2[] = {5,3,2,1,4};
    	int a3[] = {2,2,1,2,1};
    	a1 = remove_smallest(a1);
		a2 = remove_smallest(a2);
		a3 = remove_smallest(a3);
		printArray(a1);
		printArray(a2);
		printArray(a3);
    }
    
    public static void printArray(int[] ary)
    {
    	for (int i = 0; i < ary.length; i++)
    	{
    		System.out.print(ary[i] + " ");
    	}
    	System.out.println();
    }
    
    public static int[] remove_smallest(int[] ary)
    {
    	//Add code here
    	
    	
    }
}

//Output
//2 3 4 5 
//5 3 2 4 
//2 2 2 1