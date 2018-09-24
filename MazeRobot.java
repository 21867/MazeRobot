import kareltherobot.*; 
/**
 * @author : 
 * teacher : Coglianese
 * due date:
 */
public class MazeRobot extends MazeWalker //extends ???
{
    /**
    * Constructor for objects of class VeryDangerousRobot
     */
    public MazeRobot (int ave, int st, Direction direction, int beeps)
    {
        super(ave, st, direction, beeps);
    }

    /**
     * An required method - replace this comment with your own
     * You are not allowed to count the number of beepers
     * Any code that involves counting will receive no credit!!!
     */
    public void escape()
    {
        move();
        move();
        move();
        move();
        
        turnLeft();
        move();
        
        while(!nextToABeeper())
        {
            followWallRight();
        }
        
        // put your code here
    }
}
