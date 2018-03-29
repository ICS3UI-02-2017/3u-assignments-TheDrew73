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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numberOfMoves = 0;
        int repeat = 0;

        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 3, 3, Direction.SOUTH);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

        //create the first square
        new Wall(townsburg, 1, 1, Direction.WEST);
        new Wall(townsburg, 1, 1, Direction.NORTH);
        new Wall(townsburg, 1, 2, Direction.EAST);
        new Wall(townsburg, 1, 2, Direction.NORTH);
        new Wall(townsburg, 2, 1, Direction.SOUTH);
        new Wall(townsburg, 2, 1, Direction.WEST);
        new Wall(townsburg, 2, 2, Direction.EAST);
        new Wall(townsburg, 2, 2, Direction.SOUTH);

        //create the Second square
        new Wall(townsburg, 1, 4, Direction.WEST);
        new Wall(townsburg, 1, 4, Direction.NORTH);
        new Wall(townsburg, 1, 5, Direction.EAST);
        new Wall(townsburg, 1, 5, Direction.NORTH);
        new Wall(townsburg, 2, 4, Direction.WEST);
        new Wall(townsburg, 2, 4, Direction.SOUTH);
        new Wall(townsburg, 2, 5, Direction.EAST);
        new Wall(townsburg, 2, 5, Direction.SOUTH);

        //create the third square
        new Wall(townsburg, 4, 1, Direction.WEST);
        new Wall(townsburg, 4, 1, Direction.NORTH);
        new Wall(townsburg, 5, 1, Direction.WEST);
        new Wall(townsburg, 5, 1, Direction.SOUTH);
        new Wall(townsburg, 4, 2, Direction.EAST);
        new Wall(townsburg, 4, 2, Direction.NORTH);
        new Wall(townsburg, 5, 2, Direction.EAST);
        new Wall(townsburg, 5, 2, Direction.SOUTH);

        //create the fourth square
        new Wall(townsburg, 4, 4, Direction.WEST);
        new Wall(townsburg, 4, 4, Direction.NORTH);
        new Wall(townsburg, 4, 5, Direction.EAST);
        new Wall(townsburg, 4, 5, Direction.NORTH);
        new Wall(townsburg, 5, 4, Direction.WEST);
        new Wall(townsburg, 5, 4, Direction.SOUTH);
        new Wall(townsburg, 5, 5, Direction.EAST);
        new Wall(townsburg, 5, 5, Direction.SOUTH);

        //andy will repeat the entire sequence 4 times
        repeat = 0;
        while (repeat < 4) {
            repeat = repeat + 1;

            //and will round the corner of a square 3 times
            numberOfMoves = 0;
            while (numberOfMoves < 3) {
                andy.move(3);
                andy.turnLeft();
                numberOfMoves = numberOfMoves + 1;


            }
            // andy will move forward 3 spaces
            for (int count = 0; count < 3; count++) {
                andy.move();
            }
        }


    }
}