/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numberOfMoves = 2;
        int repeat = 1;

        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 0, 2, Direction.WEST);

        //set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

        //create the square wall
        new Wall(townsburg, 1, 1, Direction.NORTH);
        new Wall(townsburg, 1, 1, Direction.WEST);
        new Wall(townsburg, 1, 2, Direction.EAST);
        new Wall(townsburg, 1, 2, Direction.NORTH);
        new Wall(townsburg, 2, 1, Direction.WEST);
        new Wall(townsburg, 2, 1, Direction.SOUTH);
        new Wall(townsburg, 2, 2, Direction.SOUTH);
        new Wall(townsburg, 2, 2, Direction.EAST);


        //andy will move 2 spaces forward 
        for (int count = 0; count < 2; count++) {
            andy.move();
        }
        //andy will turn left
        andy.turnLeft();

        //andy will repeat the numberOfMoves command 7 times
        repeat = 0;
        while (repeat < 7) {
            repeat = repeat + 1;

            // andy will move 3 space and turn left    
            numberOfMoves = 0;
            while (numberOfMoves < 1) {
                andy.move(3);
                andy.turnLeft();
                numberOfMoves = numberOfMoves + 1;



            }
        }
        andy.move();
    }
}
