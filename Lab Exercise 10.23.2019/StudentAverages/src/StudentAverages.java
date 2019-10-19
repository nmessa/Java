/**
 * @(#)StudentAverages.java
 *
 * StudentAverages application
 *
 * @Author: 
 * @version 1.00 2019/10/23
 */
import java.io.*;
import java.util.*;

public class StudentAverages {
    
    public static void main(String[] args) throws IOException
    {
    	
    	Scanner input = new Scanner(System.in);
        StudentAverage avg = new StudentAverage();
        System.out.print("Console or File Output (c/f): ");
        String str = input.next();
        if (str.equals("c"))
        	avg.readLines();
        if (str.equals("f"))
        	avg.readAndWriteLines();
    }
}

//Output
//Console or File Output (c/f): c
//Agnes, average = 76
//Bufford, average = 91
//Julie, average = 94
//Alice, average = 39
//Bobby, average = 93
