/**
 * @(#)Robotics.java
 *
 * Robotics application
 *
 * @author 
 * @version 1.00 2016/12/11
 */
 
public class Robotics {
    
    public static void main(String[] args) {
    	
    	RobotArm lx = new Lexmar234( );
		RobotArm gr = new GR56A( );
		
		// Do something with the Lexmar robot
		lx.moveDown(3, 27.87);
		lx.twistRight(22.0);

		// Do something with General Robotics machine
		gr.moveUp(16.1, -23.19);
		gr.twistLeft(18);
    }
}
