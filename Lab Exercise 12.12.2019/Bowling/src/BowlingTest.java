/**
 * @(#)BowlingTest.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2019/12/12
 */
import java.io.*;
public class BowlingTest {
    public static void main(String[] args)throws IOException{
        Scoresheet bowl = new Scoresheet();
        bowl.loadScores();
        //bowl.printFrames(); //Used to make sure everything loaded in OK
        bowl.calcScore();
        bowl.printScoresheet();
    }
}

//                Frame
//1   2   3   4   5   6   7   8   9   10  
//20  46  65  74  92  101 129 149 167 186 
