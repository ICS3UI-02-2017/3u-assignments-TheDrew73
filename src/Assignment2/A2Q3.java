/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 8, 5, Direction.SOUTH);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

//While andy is facing the west direction...
        while (andy.isFacingWest()) {

            /**
             * He will find out which avenue he is on, and if that number is
             * greater than zero he will move until its equal to zero, and then
             * he will turn right.
             */
            while (andy.getAvenue() > 0) {
                andy.move();

                if (andy.getAvenue() == 0) {
                    andy.turnRight();

                }
            }
            /**
             * He will find out which street he is on, and if that number is
             * greater than zero he will move until its equal to zero.
             */
            while (andy.getStreet() > 0) {

                andy.move();
                if (andy.getStreet() == 0) {
                }
            }
        }
//While andy is facing the west direction he will turn around to face west
        while (andy.isFacingEast()) {
            andy.turnAround();

            /**
             * He will find out which avenue he is on, and if that number is
             * greater than zero he will move until its equal to zero, and then
             * he will turn right.
             */
            while (andy.getAvenue() > 0) {
                andy.move();

                if (andy.getAvenue() == 0) {
                    andy.turnRight();

                }
            }
            /**
             * He will find out which street he is on, and if that number is
             * greater than zero he will move until its equal to zero.
             */
            while (andy.getStreet() > 0) {

                andy.move();
                if (andy.getStreet() == 0) {
                }

            }
        }
//While andy is facing the north direction...
        while (andy.isFacingNorth()) {

            /**
             * He will find out which street he is on and will move until that
             * number is equal to zero, and then turn left.
             */
            while (andy.getStreet() > 0) {
                andy.move();

                if (andy.getStreet() == 0) {
                    andy.turnLeft();
                }
            }
            /**
             * He will find out which avenue he is on, and if that number is
             * greater than zero he will move until its equal to zero, and then
             * turn right.
             */
            while (andy.getAvenue() > 0) {
                andy.move();

                if (andy.getAvenue() == 0) {
                    andy.turnRight();

                }
            }

        }
//While andy is facing the north direction he will turn around to face north.
        while (andy.isFacingSouth()) {
            andy.turnAround();

            /**
             * He will find out which street he is on and will move until that
             * number is equal to zero.
             */
            while (andy.getStreet() > 0) {
                andy.move();

                if (andy.getStreet() == 0) {
                    andy.turnLeft();
                }
            }
            /**
             * He will find out which avenue he is on, and if that number is
             * greater than zero he will move until its equal to zero, and then
             * turn right.
             */
            while (andy.getAvenue() > 0) {
                andy.move();

                if (andy.getAvenue() == 0) {
                    andy.turnRight();

                }
            }

        }

    }
}