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
        int putThing = 0;

        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 1, 1, Direction.EAST, 20);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");



        //andy will repeat all of the code 3 times
        repeat = 0;
        while (repeat < 3) {
            repeat = repeat + 1;

            // andy will put five things in a line
            putThing = 0;
            while (putThing < 5) {
                andy.putThing();
                andy.move();
                putThing = putThing + 1;

            }
            //but if andy only has 10 things in his backpack...
            if (andy.countThingsInBackpack() <= 10) {
                
                //he will repeat this section of code 2 times
                repeat = 0;
                while (repeat < 2) {
                    repeat = repeat + 1;
                    andy.turnLeft();
                    andy.move();
                }
                /**then he will stop if he has 0 things in his backpack, 
                *but he will put 5 things in a line if he has more than 0 things
                */
                putThing = 0;
                while (putThing < 5) {
                    if (andy.countThingsInBackpack() == 0) {
                    } else {
                        andy.putThing();
                        andy.move();
                        putThing = putThing + 1;

                    }
                }
            }
            //if andy has more than 10 things in his backpack he will repeat this code 2 times
            repeat = 0;
            while (repeat < 2) {
                repeat = repeat + 1;
                andy.turnRight();
                andy.move();
            }


        }
    }
}
