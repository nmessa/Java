/**
 * @(#)Weight.java
 *
 * Weight application
 *
 * @Author:  
 * @version 1.00 2019/9/12 Problem 1
 */
import java.util.*;
 
public class Weight {
    
    public static void main(String[] args) {
    	//Declare variables
        int weight, choice;
        String planet = "";
        
        //Create a Scanner object
    	//Add code here
        
    	
    	//Get users weight on earth
        //Add code here
        
        
        //Display menu to screen
        //Add code here
        
        
        //Read in user choice
        //Add code here
        
        
        //Calculate weight and assign planet name using switch
        switch (choice)
        {
        	case 1: weight *= 0.091;
        			planet = "Voltar";
        			break;
        	//Add code here
        
        }
        
        //Output result
        System.out.println("Your weight on " 
        	+ planet + " would be " + weight);
    }
}

//Sample Output
//What is you weight on earth? 200
//1. Voltar
//2. Krypton
//3. Fertos
//4. Servontos
//Selection? 3
//Your weight on Fertos would be 173