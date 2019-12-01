/**
 * @(#)ArrayListDemo.java
 *
 * ArrayListDemo application
 *
 * @nmessa 
 * @version 1.00 2017/12/7
 */
import java.util.*;

public class ArrayListDemo {
    
    public static void main(String[] args) {
    	//ArrayList with objects
    	//Create ArrayList for Person objects
       	ArrayList<Person> aryList = new ArrayList<Person>();
       	
       	//Create 5 people objects
    	Person p1 = new Person("John Smith", 35);
    	Person p2 = new Person("Mary Jones", 25);
    	Person p3 = new Person("Alice Charmer", 19);
    	Person p4 = new Person("Mack Knife", 22);
    	Person p5 = new Person("Michael Jordan", 45);
    	
    	//Add 5 people to the ArrayList
    	aryList.add(p1);
    	aryList.add(p2);
    	aryList.add(p3);
    	aryList.add(p4);
    	aryList.add(p5);
    	
    	//Print the ArrayList
    	for (int i = 0; i < aryList.size(); i++)
    	{
    		System.out.println(aryList.get(i));  //this returns an object
    											//that is returned with toString
    	}
    	
    	//Remove a person
    	aryList.remove(3);
    	
    	//Print the objects in the ArrayList
    	System.out.println("\n\n\n" + "List now contains: ");
    	for (int i = 0; i < aryList.size(); i++)
    	{
    		System.out.println(aryList.get(i));
    	}
    	
    	//ArrayList with primitive types
    	ArrayList<Integer> aryList2 = new ArrayList<Integer>();
    	for (int i = 0; i < 5; i++)
    	{
    		aryList2.add(i);
    	}
    	
    	for (int i = 0; i < aryList2.size(); i++)
    	{
    		System.out.println(aryList2.get(i));
    	}
    }
}

//Output
//John Smith 35
//Mary Jones 25
//Alice Charmer 19
//Mack Knife 22
//Michael Jordan 45
//
//
//
//List now contains: 
//John Smith 35
//Mary Jones 25
//Alice Charmer 19
//Michael Jordan 45
//0
//1
//2
//3
//4