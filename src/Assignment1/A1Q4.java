/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //create city for Robot
    City townsburg = new City();
    
    //create new Robot
    RobotSE andy = new RobotSE (townsburg, 0, 0, Direction.SOUTH);
    
    //create second Robot
    RobotSE bob = new RobotSE (townsburg, 0, 1, Direction.SOUTH);
    
    //Label Robot
    andy.setLabel("A");   
    
    //Label Second Robot
    bob.setLabel ("B");
    
    //make bob a different colour
    bob.setColor (Color.CYAN);
    
    //create wall
    new Wall (townsburg, 0, 1, Direction.WEST);
    new Wall (townsburg, 1, 1, Direction.WEST);
    new Wall (townsburg, 1, 1, Direction.SOUTH);
    
    //move andy and bob so that they meet
    andy.move();       bob.move();
    andy.move();       bob.turnLeft();
    andy.turnLeft();   bob.move();
    bob.turnRight();
    bob.move();
    bob.turnRight();
    andy.move();       bob.move();
    }
}