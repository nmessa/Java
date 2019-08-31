/**
 * @(#)Trigonometry.java
 *
 * Trigonometry application
 *
 * @nmessa
 * @version 1.00 2019/9/4
 */

public class Trigonometry {

    public static void main(String[] args) {
		//Initialize variables
    	double sinx, cosx, sum, radians;
    	
    	//assign the value of 0.5236 to radians
    	radians = 0.5236;

		//Calculate sine and cosine of 0.5236 radians
    	sinx = Math.sin(radians);
    	cosx = Math.cos(radians); 
    	
    	//Calculate sin^2 + cos^2
    	sum = sinx*sinx + cosx*cosx;
    	
    	//Output result
    	System.out.println("sine: " + sinx + " cosine: " + cosx +
    		 " sum: " + sum );
    }
}

//Output
//sine: 0.5000010603626028 cosine: 0.866024791582939 sum: 1.0000000000000002