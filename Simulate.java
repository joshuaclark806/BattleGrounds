
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
        new Simulate().run();
    }
    
    /**
     * method for running the sim
     */
    public void run()
    {
        //variables
        int aWins = 0, bWins = 0;
        int reps = 10000;
        
        BattleGround myBattle = new BattleGround();
        
        // repeat 10,000 times
        for (int i = 0; i < reps; i++)
        {
            myBattle.run();
            myBattle.fight();
            boolean aBool = myBattle.getA();
            boolean bBool = myBattle.getB();
            if (aBool)
            {
                aWins++;
            }
            else
            {
                bWins++;
            }
        }
        
        System.out.println("Team A won " + aWins + " times");
        System.out.println("Team B won " + bWins + " times");
    }
}
