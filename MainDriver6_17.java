/**
   @Author:
      Date:	10-02-06
   Teacher:	Coglianese
       Lab: Ch6_17
      Misc: 
  */
import kareltherobot.*;
import java.awt.Color;

public class MainDriver6_17 implements Directions
{
    public static void main(String args[])  
	{
		MazeRobot alice= new MazeRobot(1, 1, East, 0);
		alice.escape();
	}
	
    static {
        World.reset(); 
        World.readWorld("Ch6_17.kwld"); 
        //World.setBeeperColor(Color.magenta);
        //World.setStreetColor(Color.blue);
        //World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}