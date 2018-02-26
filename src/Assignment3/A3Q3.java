/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int repeat = 0;
        int pickThing = 0;
        
       //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 1, 1, Direction.EAST,20);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");
        
         repeat = 0;
        while (repeat < 5) {
            repeat = repeat + 1;

            // andy will pick up a thing, move, put the thing down, and then go grab another thing    
            pickThing = 0;
            while (pickThing < 1) {
               andy.putThing();
               andy.move();
                pickThing = pickThing + 1;
            }
        }
        
    }
}
