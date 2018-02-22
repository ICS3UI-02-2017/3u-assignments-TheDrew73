/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 1, 1, Direction.EAST);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");

        //counted while loop
        int numberOfMoves = 5;
        //if there are still moves to do
        while (numberOfMoves > 0) {
            andy.move();
            numberOfMoves = numberOfMoves - 1;

        }

        andy.turnAround();

        //counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            andy.move();
            numberOfMoves = numberOfMoves + 1;
        }

        andy.turnAround();
        
        //use a loop to move
        for (int count = 0; count < 5; count++) {
            andy.move();

            
        int x = 10;
        x = x + 5; // adds 5
        x += 5; //adds 5
        
        x -= 10; // subtract 10 shortcut
        x = x - 10;
        
        x *= 2; //multiply by 2
        x = x * 2;
        
        x /= 4; // divide by 4 
        x = x / 4;
        
        int remainder = 5 % 2 ;
        int quotient = 5 / 2;
         
        //both must be true
       if(andy.frontIsClear()&& andy.canPickThing()){
        
        }
      
}
    }
}