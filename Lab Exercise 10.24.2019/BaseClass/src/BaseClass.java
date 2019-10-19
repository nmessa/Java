/**
 * @(#)BaseClass.java
 *
 * BaseClass application
 *
 * @nmessa 
 * @version 1.00 2017/10/25
 */
import java.util.*;
import java.io.*;
import java.text.*;

public class BaseClass {
    
    public static void main(String[] args) throws IOException {
    	
    	NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(3);
        formatter.setMaximumFractionDigits(3);
        Scanner sf = new Scanner(new File("input.in"));
        int maxIndex = -1;
        String text[] = new String[100];
        
        while(sf.hasNext())
        {
        	maxIndex++;
        	text[maxIndex] = sf.nextLine();
        }
        sf.close();
        
        for (int j = 0; j <= maxIndex; j++)
        {
        	//Use one of the following
        	//StringTokenizer st = new StringTokenzer(text[j]);
        	//Scanner sc = new Scanner(text[j]);
        }
    }
}
