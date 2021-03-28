
/**
 * Write a description of class Simulate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simulate
{
    /**
     * method for running the battlegrounds game
     */
    public static void main(String[] args)
    {
        BattleGround b1 = new BattleGround();
        b1.fillDecks();
        b1.stats();
        b1.fight();
       
        // two battles in each round, i.e. team1 attacks (team2 retaliates)
    }
}
