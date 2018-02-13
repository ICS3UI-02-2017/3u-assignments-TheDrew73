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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //create city for Robot
    City townsburg = new City();
    
    //create new Robot
    RobotSE andy = new RobotSE (townsburg, 1, 2, Direction.SOUTH);
    
    //Label Robot
    andy.setLabel("A");   
        
    //create walls
    new Wall (townsburg, 1,1, Direction.NORTH);
    new Wall (townsburg, 1,1, Direction.WEST);
    new Wall (townsburg, 1,2, Direction.NORTH);  
    new Wall (townsburg, 1,2, Direction.EAST);    
    new Wall (townsburg, 1,2, Direction.SOUTH);    
    new Wall (townsburg, 2,1, Direction.WEST);    
    new Wall (townsburg, 2,1, Direction.SOUTH);  
    
    //create the newspaper
    new Thing (townsburg, 2,2);
    
    //make the Robot get the newspaper
    andy.turnRight();
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.pickThing();
    
    //make Robot return to "bed"
    andy.turnAround();
    andy.move();
    andy.turnRight();
    andy.move();
    andy.turnRight();
    andy.move();
    andy.turnRight();
    
    }
}
