/**
 * @(#)RectangleTest.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2020/1/8
 */

public class RectangleTest {
    public static void main(String[] args) {
    	//Test constructor
        MyRectangle one = new MyRectangle(100, 300, 300, 100);
        System.out.println(one);
        //Test empty rectangle by left/right
        MyRectangle two = new MyRectangle(300, 100, 300, 100);
        System.out.println(two);
        //Test empty rectangle by top/bottom
        MyRectangle three = new MyRectangle(100, 300, 100, 300);
        System.out.println(three);
        //Test isInside for a point
        System.out.println(one.isInside(200, 200)); //true
        System.out.println(one.isInside(400, 400)); //false
        //Test isInside for a circle
        System.out.println(one.isInside(200, 200, 20));  //true
        System.out.println(one.isInside(200, 200, 200)); //false
        //Test copy constructor
        MyRectangle four = new MyRectangle(one);
        System.out.println(four);
    }
}

//Output
//Left = 100
//Right = 300
//Top = 300
//Bottom = 100
//
//Left = 0
//Right = 0
//Top = 0
//Bottom = 0
//
//Left = 0
//Right = 0
//Top = 0
//Bottom = 0
//
//true
//false
//true
//false
//Left = 100
//Right = 300
//Top = 300
//Bottom = 100