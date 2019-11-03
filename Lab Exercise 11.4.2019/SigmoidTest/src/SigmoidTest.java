/**
 * @(#)SigmoidTest.java
 *
 * SigmoidTest application
 *
 * @Author: nmessa 
 * @version 1.00 2019/11/4
 */
 
public class SigmoidTest {
    
    public static void main(String[] args) {
    	
    	Sigmoid sig = new Sigmoid(0.01);
        for (int i = -10; i < 10; i++)
        	System.out.println("Sigmoid(" + i + ") = " + sig.getValue(i));
    }
}

//Output
//Sigmoid(-10) = 4.5397868702434395E-5
//Sigmoid(-9) = 1.233945759862291E-4
//Sigmoid(-8) = 3.3535013046646385E-4
//Sigmoid(-7) = 9.110511944005872E-4
//Sigmoid(-6) = 0.002472623156634564
//Sigmoid(-5) = 0.006692850924284147
//Sigmoid(-4) = 0.0179862099620893
//Sigmoid(-3) = 0.047425873177560036
//Sigmoid(-2) = 0.11920292202209966
//Sigmoid(-1) = 0.26894142136996174
//Sigmoid(0) = 0.4999999999999578
//Sigmoid(1) = 0.7310585786299719
//Sigmoid(2) = 0.8807970779778648
//Sigmoid(3) = 0.9525741268224246
//Sigmoid(4) = 0.9820137900379048
//Sigmoid(5) = 0.9933071490757137
//Sigmoid(6) = 0.9975273768433647
//Sigmoid(7) = 0.9990889488055992
//Sigmoid(8) = 0.9996646498695334
//Sigmoid(9) = 0.9998766054240137