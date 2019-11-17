/**
 * @(#)FunctionGrowth.java
 *
 * FunctionGrowth application
 *
 * @Author: 
 * @version 1.00 2019/11/21
 */
 
import java.text.*;

public class FunctionGrowth {
    
    public static void main(String[] args) {
    	//Declare variables
    	int a;
    	String b;
    	String c, d, e;
    	
    	//Create a DecimalFormat object
    	String pattern = "###.##";
		DecimalFormat df= new DecimalFormat(pattern);

		//Create a table heading
		System.out.println("\tN\t\tlog(N)\tN log(N)\t\tN^2\t\t\t\tN^3");
		//Generate the table
		for (double n = 16.0; n <= 2048.0; n *= 2.0)
    	{
    		//Add code here
    	
    	}
    }
}

//Output
//    N       log(N)  N log(N)        N^2             N^3
//   16       1.2       19.27            256           4096
//   32      1.51       48.16           1024          32768
//   64      1.81       115.6           4096         262144
//  128      2.11      269.72          16384        2097152
//  256      2.41      616.51          65536       16777216
//  512      2.71     1387.15         262144      134217728
// 1024      3.01     3082.55        1048576     1073741824
// 2048      3.31      6781.6        4194304     8589934592
