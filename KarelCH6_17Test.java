/*
   @Author: Coglianese
      Date: Oct 2, 2006
   Teacher:
       Lab:
      Misc: based on work by C. Nelson
  */

import kareltherobot.*;

public class KarelCH6_17Test extends KTest implements Directions
{
    public KarelCH6_17Test (String name)
    {
    		super(name);
   	}
   	
   	private MazeRobot alice;

   	public void setUp()
   	{
   		 World.reset();
   		 World.setDelay(1);
   		 World.setVisible(false);    			
   		 World.setTrace(false);
 		 World.readWorld("ch6_17.kwld");  		 
         alice= new MazeRobot(1, 1, East, 0);
         alice.escape();
  	}
   	
    public void testLeftMaze()
    {    
         assertAt(alice, 7, 9);

    }
    public void testFoundBeep()
    {    
         assertAt(alice, 7, 9);
		 assertBeepersAt(7, 9, 1);
    }
}
