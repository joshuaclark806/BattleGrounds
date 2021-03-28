
/**
 * class for cards
 *
 * @author Josh Clark
 * @version 18/03/2021
 */
public class Cards
{
    // instance variable, hp
    private int hp;
    private String name;
    
    /**
     * Constructor for objects of class Team1
     */
    public Cards(String nm) //variable parameters
    {
        // initialise instance variable, hp
        final int MIN = 100;
        final int MAX = 500;
        hp = (int) (MIN + Math.random() * MAX);
        name = nm;
    }
    
    /**
     * method for getting name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * method for returning hp
     */
    public int getHP()
    {
        return hp;
    }
    
    /**
     * method for returning damage
     */
    public void gotHit(int amt)
    {
        this.hp -= amt;
    }
    
    /**
     * method for the attack value
     */
    public int attack()
    {
        // set min and max
        final int MIN = 20;
        final int MAX = 80;
        return (int) (MIN + Math.random() * MAX);
        // find random val between min and max
    }
    
    /**
     * boolean method for seeing if card is alive
     */
    public boolean isAlive()
    {
        if (this.hp <= 0)
        {
            return false;
        }
        return true;
    }
    
}
