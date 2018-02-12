/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 * A1Q1
 * @author watsa9604
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //create city for Robot
    City townsburg = new City();
    
    //create new Robot
    RobotSE andy = new RobotSE (townsburg, 0, 2, Direction.WEST);
    
    //Label Robot
    andy.setLabel("A");
    
    //create walls
    new Wall (townsburg, 1, 1, Direction.NORTH);
    new Wall (townsburg, 1, 2, Direction.NORTH);
    new Wall (townsburg, 1, 2, Direction.EAST);
    new Wall (townsburg, 2, 2, Direction.EAST);
    new Wall (townsburg, 2, 2, Direction.SOUTH);
    new Wall (townsburg, 2, 1, Direction.SOUTH); 
    new Wall (townsburg, 2, 1, Direction.WEST);
    new Wall (townsburg, 1, 1, Direction.WEST);
    
    //move the Robot counter clockwise around the walls
    andy.move(2);
    andy.turnLeft();
    andy.move(3);
    andy.turnLeft();
    andy.move(3);
    andy.turnLeft();
    andy.move(3);
    andy.turnLeft();
    andy.move(1);
    }
}
