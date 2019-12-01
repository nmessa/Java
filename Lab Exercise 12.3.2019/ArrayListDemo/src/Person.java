/**
 * @(#)Person.java
 *
 *
 * @nmessa 
 * @version 1.00 2017/12/7
 */


public class Person {
	public String name;
	public int age;
	
    public Person(String n, int a) {
    	name = n;
    	age = a;
    }
    
    public String toString()
    {
    	String str = name + " " + Integer.toString(age);
    	return str;
    }
}