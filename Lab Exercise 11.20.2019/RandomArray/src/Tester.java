/**
 * @(#)Tester.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2019/11/20
 */
import java.util.*;

public class Tester {

    public static void main(String[] args) {
    	//Declare variables
    	int size;
    	
    	//Create a Scanner object input
    	Scanner input = new Scanner(System.in);
    	
    	//Get array size from user
    	System.out.print("Enter the size of your array: ");
    	size = input.nextInt();
    	
    	//Create a RandomArray object
        RandomArray ra = new RandomArray(size);
        
        //Fill the array
        ra.fillArray();
        
        //Print the array
        System.out.println("The array contains:");
        ra.printArray();
        System.out.println();
        System.out.println();
        
        //Print the largest and smallest elements of the array
        System.out.println("Largest value = " + ra.largest());
        System.out.println("Smallest value = " + ra.smallest());
    }
}

//Sample Output
//Enter the size of your array: 100
//The array contains:
//228 633 845 659 368 891 876 347 
//109 171 742 281 931 369 75 839 
//213 531 76 292 492 644 253 275 
//962 849 553 308 669 821 378 551 
//487 908 780 868 926 172 988 736 
//604 143 258 658 325 421 856 628 
//40 79 374 837 869 902 636 483 
//946 498 579 926 617 862 248 375 
//473 257 942 231 119 984 767 316 
//40 510 902 134 670 829 820 584 
//214 398 446 522 658 997 671 203 
//615 336 7 372 125 110 576 648 
//30 844 496 823 
//
//
//Largest value = 997
//Smallest value = 7