/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizortest;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class Quiz1CommandingTheRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a city for the Robot      
        City townsburg = new City();

        // Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 4, 0, Direction.EAST);

        // Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

        // create the staircase
        new Wall(townsburg, 4, 2, Direction.WEST);
        new Wall(townsburg, 4, 2, Direction.NORTH);
        new Wall(townsburg, 3, 3, Direction.WEST);
        new Wall(townsburg, 3, 3, Direction.NORTH);
        new Wall(townsburg, 2, 4, Direction.WEST);
        new Wall(townsburg, 2, 4, Direction.NORTH);
        new Wall(townsburg, 2, 5, Direction.EAST);
        new Wall(townsburg, 2, 5, Direction.NORTH);
        new Wall(townsburg, 3, 6, Direction.EAST);
        new Wall(townsburg, 3, 6, Direction.NORTH);
        new Wall(townsburg, 4, 7, Direction.EAST);
        new Wall(townsburg, 4, 7, Direction.NORTH);

        // create the lights
        new Thing(townsburg, 4, 1);
        new Thing(townsburg, 3, 2);
        new Thing(townsburg, 2, 3);
        new Thing(townsburg, 1, 4);


        // make andy climb the stairs and pick up all of the lights
        andy.move();
        andy.pickThing();
        andy.turnLeft();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.pickThing();
        andy.turnLeft();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.pickThing();
        andy.turnLeft();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.pickThing();

        // make andy go down the stairs and put all of the lights in their proper place
        andy.move();
        andy.putThing();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.turnLeft();
        andy.putThing();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.turnLeft();
        andy.putThing();
        andy.move();
        andy.turnRight();
        andy.move();
        andy.turnLeft();
        andy.putThing();
        andy.move();

    }
}
