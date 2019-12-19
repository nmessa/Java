/**
 * @(#)BingoCardTest.java
 *
 *
 * @Author:  
 * @version 1.00 2019/12/18
 */

public class BingoCardTest {
    public static void main(String[] args) {
        BingoCard card = new BingoCard();
        card.printCard();
        
        //Test card update
        System.out.println("After updates");
        //Test the B's
        card.updateCard("B1");
        card.updateCard("B2");
        card.updateCard("B3");
        card.updateCard("B4");
        card.updateCard("B5");
        card.updateCard("B12");
        card.updateCard("B13");
        card.updateCard("B14");
        
        //Test the I's
        card.updateCard("I17");
        card.updateCard("I22");
        card.updateCard("I23");
        card.updateCard("I24");
        card.updateCard("I25");
        card.updateCard("I28");
        card.updateCard("I29");
        card.updateCard("I30");
        
        //Test the N's
        card.updateCard("N31");
        card.updateCard("N32");
        card.updateCard("N33");
        card.updateCard("N34");
        card.updateCard("N35");
        card.updateCard("N38");
        card.updateCard("N39");
        card.updateCard("N45");
        
        //Test the G's
        card.updateCard("G47");
        card.updateCard("G52");
        card.updateCard("G53");
        card.updateCard("G54");
        card.updateCard("G55");
        card.updateCard("G48");
        card.updateCard("G49");
        card.updateCard("G60");
        
        //Test the O's
        card.updateCard("O67");
        card.updateCard("O62");
        card.updateCard("O63");
        card.updateCard("O64");
        card.updateCard("O75");
        card.updateCard("O68");
        card.updateCard("O69");
        card.updateCard("O70");
        card.printCard();
        
        System.out.println("Row win: " + card.checkRowWin());
        System.out.println("Column win: " + card.checkColWin());
        System.out.println("Diagonal win: " + card.checkDiagWin());
    }
}

//Sample Output
//B    I   N   G   O
//14  24  37  50  73
//1   27  32  58  68
//15  22  0   55  67
//8   29  35  52  75
//12  18  38  47  70
//
//After updates
//B    I   N   G   O
//0   0   37  50  73
//0   27  0   58  0
//15  0   0   0   0
//8   0   0   0   0
//0   18  0   0   0
//
//Row win: false
//Column win: false
//Diagonal win: false