//Lab Exercise 11/20/2019 Problem 5
//Author: 
//Planet Class definition file

class Planet {
	private String name;
	private double radius;
	private double mass;
	private double distance;
	
	//Constructor
	Planet(String n, double r, double m, double d)
	{
		//Add code here
		
	}
	
	public String getName()
	{
		//Add code here
		
	}
	
	public double getRadius()
	{
		//Add code here
		
	}
	
	public double getMass()
	{
		//Add code here
		
	}
	
	public double getDistance()
	{
		//Add code here
		
	}
	
	public double calcVolume()
	{
		//Add code here
		
	}
	
	public double calcSurfaceArea()
	{
		//Add code here
		
	}
	
	public double calcDensity()
	{
		//Add code here
		
	}
	
	public double calcOrbit()
	{
		//Add code here
		
	}
	
	public String toString()
	{
		String p = "";
		p += "Name: " + name + "\n";
		p += "Radius: " + Double.toString(radius) + "\n";
		p += "Mass: " + Double.toString(mass) + "\n";
		p += "Distance to Sun: " + Double.toString(distance) + "\n";
		return p;
	}
	
}
