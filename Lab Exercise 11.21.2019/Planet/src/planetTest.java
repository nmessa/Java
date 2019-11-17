/**
 * @(#)planetTest.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2019/11/21
 */

public class planetTest {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 3390, 6.39e23, 2.279e8);
        System.out.println(mars);
        
        double vol = mars.calcVolume();
        System.out.println("Volume of " + mars.getName() + " = " 
        	+ vol + " cubic kilometers");
        double sa = mars.calcSurfaceArea();
        System.out.println("Surface Area of " + mars.getName() + " = " 
        	+ sa + " square kilometers");
        double density = mars.calcDensity();
        System.out.println("Density of " + mars.getName() + " = " 
        	+ density + " kilgrams per cubic kilometer");
        double orbit = mars.calcOrbit();
        System.out.println("The orbit of " + mars.getName() + " = " 
        	+ orbit + " kilometers");
    }
}

//Output
//Name: Mars
//Radius: 3390.0
//Mass: 6.39E23
//Distance to Sun: 2.279E8
//
//Volume of Mars = 1.6318780614312305E11 cubic kilometers
//Surface Area of Mars = 1.4441398773727706E8 square kilometers
//Density of Mars = 3.915733749368309E12 kilgrams per cubic kilometer
//The orbit of Mars = 21299.998191338796 kilometers
