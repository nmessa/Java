/**
 * @(#)RotateArray.java
 *
 * RotateArray application
 *
 * @Author: 
 * @version 1.00 2019/11/19
 */
 
public class RotateArray {

    public static void main(String[] args) {
    	int myArray[] = {1,2,3,4,5,6,7,8,9};
    	System.out.print("Original array: ");
    	printArray(myArray);
    	rotate(myArray,3);
    	System.out.print("Array after rotate right by 3: ");
    	printArray(myArray);
    	rotate(myArray,-3);
    	System.out.print("Array after rotate left by 3: ");
    	printArray(myArray);
    }
    
    public static void printArray(int[] myArray)
    {
    	//Add code here
    	
    		
    }
    
    public static void rotate(int[] myArray, int d)
    {
    	int temp=0;
    	int len = myArray.length;
    	
    	//Postive rotation
    	//Add code here
    	
    	
    	//Negative rotation
    	//Add code here
    	
    	
    }
}

//Output
//Original array: [1 2 3 4 5 6 7 8 9 ]
//Array after rotate right by 3: [4 5 6 7 8 9 1 2 3 ]
//Array after rotate left by 3: [1 2 3 4 5 6 7 8 9 ]