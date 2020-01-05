/**
 * @(#)SoccerTest.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2017/1/5
 */

public class SoccerTest {
    public static void main(String[] args) {
        SoccerTeam strikers = new SoccerTeam();
        SoccerTeam ducks = new SoccerTeam();
        SoccerTeam penquins = new SoccerTeam();
        
        //Tournament 1
        System.out.println("\n\n\nTournament 1");
        SoccerTeam.startTournament();
        strikers.played(ducks, 4, 2);
        ducks.played(penquins, 3, 3);
        penquins.played(strikers, 2, 1);
        strikers.played(penquins, 2, 1);
        penquins.played(ducks, 2, 1);
        ducks.played(strikers, 3, 4);
        System.out.println("Strikers points = " + strikers.getPoints());
        System.out.println("Ducks points = " + ducks.getPoints());
        System.out.println("Penquins points = " + penquins.getPoints());
        System.out.println("Games played = " + SoccerTeam.getGames());
        System.out.println("Goals made = " + SoccerTeam.getGoals());
        
        //Tournament 2
        System.out.println("\n\n\nTournament 2");
        SoccerTeam.startTournament();
        strikers.played(ducks, 3, 4);
        ducks.played(penquins, 1, 3);
        penquins.played(strikers, 1, 1);
        strikers.played(penquins, 3, 5);
        penquins.played(ducks, 2, 2);
        ducks.played(strikers, 3, 1);
        System.out.println("Strikers points = " + strikers.getPoints());
        System.out.println("Ducks points = " + ducks.getPoints());
        System.out.println("Penquins points = " + penquins.getPoints());
        System.out.println("Games played = " + SoccerTeam.getGames());
        System.out.println("Goals made = " + SoccerTeam.getGoals());
    }
}

/*Output
Tournament 1
Strikers points = 6
Ducks points = 1
Penquins points = 5
Games played = 6
Goals made = 28



Tournament 2
Strikers points = 7
Ducks points = 6
Penquins points = 11
Games played = 6
Goals made = 29
*/