//Frog.java
//Author: nmessa
//Date: 10/15/2010

public class Frog
{
	private String name;
	private Location position;
	private Location initial;
	private double distance;
	
	public Frog()
	{
		Location temp = new Location();
		position = temp;
		Location start = new Location();
		initial = start;
		name = "Kermit";
		distance = 0.0;
	}
	
	public Frog(String n, Location p)
	{
		position = p;
		name = n;
		initial = new Location();
		distance = 0.0;
	}
	
	public void hop(Marsh s)
	{
		int rNumber;
		rNumber = (int)(Math.random() * 4 + 1);
		switch (rNumber)
		{
			case 1: 
				position.x++;
				calcDistance(); 
				break;	
			case 2: 
				position.x--; 
				calcDistance();
				break;				
			case 3: 
				position.y++;
				calcDistance(); 
				break;
			case 4: 
				position.y--; 
				calcDistance();
				break;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public Location getPosition()
	{
		return position;
	}
	
	private void calcDistance()
	{
		Location temp = getPosition();
		double dx = Math.abs((double)initial.x - (double)temp.x);
		double dy = Math.abs((double)initial.y - (double)temp.y);
		distance = Math.sqrt(dx*dx + dy*dy);
	}
			
	public double getDistance()
	{
		return distance;
	}	
	
	public String toString()
	{
		String output;
		output = name + " is located at " + position;
		return output;
	}
}