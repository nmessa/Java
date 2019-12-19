/**
 * @(#)GR56A.java
 *
 *
 * @author 
 * @version 1.00 2016/12/11
 */


public class GR56A implements RobotArm{

    public GR56A() {
    	System.out.println("A new GR56A has been created");
    	
    }
    
	public void moveUp(double rate, double howFar) {
		 System.out.println("GR56A moving up " + howFar + " inches " +
		 	rate + " inches per second");
	}
	
	
	public void moveDown(double rate, double howFar) {
		System.out.println("GR56A moving down " + howFar + " inches " +
		 	rate + " inches per second");
	}
	
	public void twistLeft(double deg) {
		 System.out.println("GR56A twisting left " + deg + 
		 	" degrees "); 
	}
	
	public void twistRight(double deg) {
		 System.out.println("GR56A twisting left " + deg + 
		 	" degrees ");
	}
}