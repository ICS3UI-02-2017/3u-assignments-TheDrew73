/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 2, 1, Direction.WEST);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");
        
        new Wall (townsburg, 1,1, Direction.NORTH);
        new Wall (townsburg, 1,1, Direction.SOUTH);
        new Wall (townsburg, 1,1, Direction.EAST);
        new Wall (townsburg, 1,1, Direction.WEST);
        new Wall (townsburg, 4,1, Direction.NORTH);
        new Wall (townsburg, 4,1, Direction.SOUTH);
        new Wall (townsburg, 4,1, Direction.EAST);
        new Wall (townsburg, 4,1, Direction.WEST);
        new Wall (townsburg, 1,4, Direction.NORTH);
        new Wall (townsburg, 1,4, Direction.SOUTH);
        new Wall (townsburg, 1,4, Direction.EAST);
        new Wall (townsburg, 1,4, Direction.WEST);
        new Wall (townsburg, 4,4, Direction.NORTH);
        new Wall (townsburg, 4,4, Direction.SOUTH);
        new Wall (townsburg, 4,4, Direction.EAST);
        new Wall (townsburg, 4,4, Direction.WEST);
        new Wall (townsburg, 2,2, Direction.NORTH);
        new Wall (townsburg, 2,2, Direction.WEST);
        new Wall (townsburg, 3,2, Direction.SOUTH);
        new Wall (townsburg, 3,2, Direction.WEST);
        new Wall (townsburg, 3,3, Direction.SOUTH);
        new Wall (townsburg, 3,3, Direction.EAST);
        new Wall (townsburg, 2,3, Direction.NORTH);
        new Wall (townsburg, 2,3, Direction.EAST);
        
     while(andy.getStreet()==2)  { 
       andy.move();
       andy.turnRight();
       andy.move(2);
       andy.turnRight();
       andy.move(2);
       andy.turnRight();
       andy.move();
       andy.turnLeft();

}

     while(andy.getAvenue()==2)  {
     
       andy.move();
       andy.turnLeft();
       andy.move(1);
       andy.turnRight();
       andy.move(2);
       andy.turnRight();
       andy.move(2);
       andy.turnRight();
       
     
}

}
}