
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
    private int numCards = (int) (MINCARDS + Math.random() * MAXCARDS);
    // make array of team1cards and team2cards
    private Cards[] t1Cards = new Cards[numCards];
    private Cards[] t2Cards = new Cards[numCards];
    
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
        for (int i = 0; i < numCards; i++)
        {
            // add a new card to the arrays
            t1Cards[i] = new Cards("A" + Integer.toString(i+1));
            t2Cards[i] = new Cards("B" + Integer.toString(i+1));
            
        }
    }
        
    /**
     * method for printing decks to see card stats
     */
    public void stats()
    {
        System.out.println("Team A Card Stats");
        // for loop to print off deck 1 card stats
        for (int i = 0; i < numCards; i++)
        {
            System.out.println(t1Cards[i].getName() + " has " + t1Cards[i].getHP() + "HP and does " + t1Cards[i].attack() + "dmg");
        }
        System.out.println("\nTeam B Card Stats:");
        // for loop for deck 2
        for (int i = 0; i < numCards; i++)
        {
            System.out.println(t2Cards[i].getName() + " has " + t2Cards[i].getHP() + "hp and does " + t2Cards[i].attack() + "dmg");
        }
    }
        
    /**
     * method for attacking
     * @param Team1 card, Team2 card
     */
    public void attack(Cards t1Card, Cards t2Card)
    {
        int numBoundary = 1;
        int randInt = (int) (1 + Math.random() * 2);
        
        if (randInt < numBoundary)
        {
            // team 1 attacks team 2
            System.out.println(t1Card.getName() + " attacks " + t2Card.getName());
            t2Card.gotHit(t1Card.attack());
            // if t2 card is dead, print it
            if (!t2Card.isAlive())
            {
                System.out.println(t2Card.getName() + " is dead");
            }
            
            // and team2 attacks back
            if (t2Card.isAlive())
            {
                System.out.println(t2Card.getName() + " retaliates against " + t1Card.getName());
                t2Card.gotHit(t1Card.attack());
                // if t1 card is dead, print it
                if (!t1Card.isAlive())
                {
                    System.out.println(t1Card.getName() + " is dead");
                }
            }
        }
        else if (randInt > numBoundary)
        {
            // team 2 attacks team 1
            System.out.println(t2Card.getName() + " attacks " + t1Card.getName());
            t1Card.gotHit(t2Card.attack());
            // if t1 card is dead, print it
            if (!t1Card.isAlive())
            {
                System.out.println(t1Card.getName() + " is dead");
            }
    
            // and team1 attacks back
            if (t1Card.isAlive())
            {
                System.out.println(t1Card.getName() + " retaliates against " + t2Card.getName());
                t1Card.gotHit(t2Card.attack());
                // if t2 card is dead, print it
                if (!t2Card.isAlive())
                {
                    System.out.println(t2Card.getName() + " is dead");
                }
            }
        }
    }
    
    /**
     * method for fighting
     */
    public void fight()
    {
        int t1Card, t2Card;
        boolean gameover = false;
        // continue fighting until all cards from one team are dead
        while (!gameover)
        {
            // call attack method with random cards, i
            do
            {
                t1Card = (int) (Math.random() * numCards);
            } while (t1Cards[t1Card].isAlive() == false);
            do
            {
                t2Card = (int) (Math.random() * numCards);
            } while (t2Cards[t2Card].isAlive() == false);
            
            // call fight method
            attack(t1Cards[t1Card], t2Cards[t2Card]);
            
            // check if one team has won with check winner method
            if (checkWinner() == 0)
            {
                System.out.println("Team 1 is defeated, Team 2 wins!");
                gameover = true;
            }
            else if (checkWinner() == 1)
            {
                System.out.println("Team 2 is defeated, Team 1 wins!");
                gameover = true;
            }
            
            // call return result method to print stats
        }
    }
    
    /**
     * method for determining if game is over
     */
    public int checkWinner()
    {
        int t1CardsAlive = numCards, t2CardsAlive = numCards;
        
        // for loops for checking if cards are alive
        for (Cards t1Card : t1Cards)
        {
            if (!t1Card.isAlive())
            {
                t1CardsAlive --;
            }
        }
        for (Cards t2Card : t2Cards)
        {
            if (!t2Card.isAlive())
            {
                t2CardsAlive --;
            }
        }
        
        // check if either ints == 0, return appropriate output
        if (t1CardsAlive == 0)
        {
            return 0;
        }
        else if (t2CardsAlive == 0)
        {
            return 1;
        }
        return -1;
    }
    
    /**
     * method for returning results of battle
     */
    // print the hp of the cards that attacked
    
    
}
