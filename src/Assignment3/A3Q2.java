/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int repeat = 0;
        int pickThing = 0;
        //Create a city for the Robot      
        City townsburg = new City();

        townsburg.showThingCounts(true);

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 2, 1, Direction.EAST);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

        //create the 10 things
        for (int i = 1; i <= 10; i = i + 1) {
            new Thing(townsburg, 2, 1);
        }

        //andy will repeat the pickThing command 10 times
        repeat = 0;
        while (repeat < 10) {
            repeat = repeat + 1;

            // andy will pick up a thing, move, put the thing down, and then go grab another thing    
            pickThing = 0;
            while (pickThing < 1) {
                andy.pickThing();
                andy.move();
                andy.putThing();
                andy.turnAround();
                andy.move();
                andy.turnAround();
                pickThing = pickThing + 1;
            }
        }
        andy.move();
    }
}
