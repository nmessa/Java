/**
 * @(#)ForLoopDemo.java
 *
 * ForLoopDemo application
 *
 * @author 
 * @version 1.00 2017/9/18
 */
 
public class ForLoopDemo {
    
    public static void main(String[] args) {
    	
    	//print the numbers from 1 to 10
    	for (int i = 1; i <= 10; i++)
    		System.out.print(i + " ");
    	System.out.println();
    	
    	
    	//print the numbers from 10 to 1
    	for (int i = 10; i >= 1; i--)
    		System.out.print(i + " ");
    	System.out.println();
    	
    	//print numbers from 0 to 100 in increments of 5
    	for (int i = 0; i <= 100; i += 5)
    		System.out.print(i + " ");
    	System.out.println();
    	
    	//print numbers starting with 1 and doubling each interation
    	//until they reach a million
    	for (int i = 1; i <= 1e6; i *= 2)
    		System.out.print(i + " ");
    }
}

// Output
// 1 2 3 4 5 6 7 8 9 10 
// 10 9 8 7 6 5 4 3 2 1 
// 0 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 
// 1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536 131072 262144 524288
