/**
 * @(#)Lexmar234.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2016/12/11
 */


public class Lexmar234 implements RobotArm {

	public Lexmar234( ) { 
		System.out.println("A new Lexmar 234 has been created");
	}
	
	public void moveUp(double rate, double howFar) {
		System.out.println("Lexmar 234 moving up " + howFar + " inches " +
		 	rate + " inches per second");
	}
	
	public void moveDown(double rate, double howFar) {
		 System.out.println("Lexmar 234 moving down " + howFar + " inches " +
		 	rate + " inches per second");
	}
	
	public void twistLeft(double deg) {
		 System.out.println("Lexmar 234 twisting left " + deg + 
		 	" degrees ");
	}
	
	public void twistRight(double deg) {
		 System.out.println("Lexmar 234 twisting right " + deg + 
		 	" degrees "); 
	}
}