
/**
 * Write a description of class BattleGround here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleGround
{
    // instance variables for num of cards, random between 5-8
    private final int MINCARDS = 5, MAXCARDS = 8;
    private int NumCards = (int) (MINCARDS + Math.random() * MAXCARDS);
    // make array of team1cards and team2cards
    private Cards[] t1Cards = new Cards[NumCards];
    private Cards[] t2Cards = new Cards[NumCards];
    
    /**
     * method for calling the fill deck (arrays) method
     */
    public BattleGround()
    {
        fillDecks();
    }
    
    /**
     * method for filling the decks (arrays)
     */
    public void fillDecks()
    {
        // for loop to loop through the length of array1
        for (int i = 0; i < NumCards; i++)
        {
            // add a new card to the arrays
            t1Cards[i] = new Cards("T1 Card " + Integer.toString(i+1));
            t2Cards[i] = new Cards("T2 Card " + Integer.toString(i+1));
            
        }
    }
        
    /**
     * method for printing decks to see card stats
     */
    public void stats()
    {
        System.out.println("Team 1 Card Stats");
        // for loop to print off deck 1 card stats
        for (int i = 0; i < NumCards; i++)
        {
            System.out.println(t1Cards[i] + " has " + t1Cards[i].getHP() + "hp and does " + t1Cards[i].attack() + "dmg");
        }
        System.out.println("\nTeam 2 Card Stats:");
        // for loop for deck 2
        for (int i = 0; i < NumCards; i++)
        {
            System.out.println(t2Cards[i] + " has " + t2Cards[i].getHP() + "hp and does " + t2Cards[i].attack() + "dmg");
        }
    }
        
    /**
     * method for attacking
     * @param Team1 card, Team2 card
     */
    public void attack(Cards t1Card, Cards t2Card)
    {
        // team 1 attacks team 2
        System.out.println(t1Card.getName() + " attacks " + t2Card.getName());
        t2Card.gotHit(t1Card.attack());

        // and team2 attacks back
        System.out.println(t2Card.getName() + " retaliates against " + t1Card.getName());
        t2Card.gotHit(t1Card.attack());
    }
    
    /**
     * method for fighting
     */
    // continue fighting until all cards from one team are dead
    // call attack method with random cards, i
    // call return result method to print stats
    
    /**
     * method for returning results of battle
     */
    // print the hp of the cards that attacked
    
    
}
