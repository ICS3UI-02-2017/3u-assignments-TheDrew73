/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author watsa9604
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //create city for Robot
    City townsburg = new City();
    
    //create new Robot
    RobotSE andy = new RobotSE (townsburg, 3, 0, Direction.EAST);
    
    //Label Robot
    andy.setLabel("A");   
    
    //create Flag
    new Thing (townsburg, 3,1);
        
    //create Mountain
    new Wall (townsburg, 3,2, Direction.WEST);
    new Wall (townsburg, 3,2, Direction.NORTH);
    new Wall (townsburg, 2,3, Direction.WEST);
    new Wall (townsburg, 1,3, Direction.WEST);
    new Wall (townsburg, 1,3, Direction.NORTH);
    new Wall (townsburg, 1,3, Direction.EAST);
    new Wall (townsburg, 2,4, Direction.NORTH);
    new Wall (townsburg, 2,4, Direction.EAST);
    new Wall (townsburg, 3,4, Direction.EAST);
    
    //make Robot pick up the flag and climb to the top of the mountain
    andy.move();
    andy.pickThing();
    andy.turnLeft();
    andy.move();
    andy.turnRight();
    andy.move();
    andy.turnLeft();
    andy.move(2);
    andy.turnRight();
    andy.move();
    
    //make robot place flag on top of mountain, and climb back down
    andy.putThing();
    andy.move();
    andy.turnRight();
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.turnRight();
    andy.move(2);
    andy.turnLeft();
    
    
    }
}
