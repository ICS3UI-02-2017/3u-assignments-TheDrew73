/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

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
public class A2Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Create a city for the Robot      
        City townsburg = new City();

        //Put a Robot in Townsburg
        RobotSE andy = new RobotSE(townsburg, 1, 3, Direction.SOUTH);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);

        andy.setLabel("A");
        
         //Put a Robot in Townsburg
        RobotSE roberta = new RobotSE(townsburg, 1, 3, Direction.SOUTH);

        //Set the color of the Robot
        roberta.setColor(Color.RED);

        roberta.setLabel("R");
        
        for (int road2 = 1; road2 <= 10; road2 = road2 + 1) {
        new Wall(townsburg, road2, 1, Direction.WEST);
        }
        for (int road = 1; road <= 10; road = road + 1) {
        new Wall(townsburg, road, 2, Direction.EAST);
        }
        new Wall (townsburg, 1,3, Direction.EAST);
        new Wall (townsburg, 2,4, Direction.NORTH);
        new Wall (townsburg, 2,5, Direction.NORTH);
        new Wall (townsburg, 2,6, Direction.NORTH);
        new Wall (townsburg, 2,7, Direction.NORTH);
        new Wall (townsburg, 2,7, Direction.EAST);
        new Wall (townsburg, 3,7, Direction.EAST);
        new Wall (townsburg, 3,7, Direction.SOUTH);
        new Wall (townsburg, 3,6, Direction.SOUTH);
        new Wall (townsburg, 3,5, Direction.SOUTH);
        new Wall (townsburg, 3,4, Direction.SOUTH);
        new Wall (townsburg, 4,3, Direction.EAST);
        new Wall (townsburg, 5,4, Direction.NORTH);
        new Wall (townsburg, 5,5, Direction.NORTH);
        new Wall (townsburg, 5,6, Direction.NORTH);
        new Wall (townsburg, 5,6, Direction.EAST);
        new Wall (townsburg, 5,4, Direction.SOUTH);
        new Wall (townsburg, 5,5, Direction.SOUTH);
        new Wall (townsburg, 5,6, Direction.SOUTH);
        new Wall (townsburg, 6,3, Direction.EAST);
        new Wall (townsburg, 7,3, Direction.EAST);
        new Wall (townsburg, 8,4, Direction.NORTH);
        new Wall (townsburg, 8,5, Direction.NORTH);
        new Wall (townsburg, 8,6, Direction.NORTH);
        new Wall (townsburg, 8,7, Direction.NORTH);
        new Wall (townsburg, 8,8, Direction.NORTH);
        new Wall (townsburg, 8,8, Direction.EAST);
        new Wall (townsburg, 9,8, Direction.EAST);
        new Wall (townsburg, 9,8, Direction.SOUTH);
        new Wall (townsburg, 9,7, Direction.SOUTH);
        new Wall (townsburg, 9,6, Direction.SOUTH);
        new Wall (townsburg, 9,5, Direction.SOUTH);
        new Wall (townsburg, 9,4, Direction.SOUTH);
        new Wall (townsburg, 10,3, Direction.EAST);
        new Wall (townsburg, 10,3, Direction.SOUTH);
        
        new Thing (townsburg, 2,3);
        new Thing (townsburg, 2,4);
        new Thing (townsburg, 2,5);
        new Thing (townsburg, 2,6);
        new Thing (townsburg, 3,3);
        new Thing (townsburg, 3,5);
        new Thing (townsburg, 3,7);
        new Thing (townsburg, 5,3);
        new Thing (townsburg, 5,4);
        new Thing (townsburg, 5,5);
        new Thing (townsburg, 8,3);
        new Thing (townsburg, 8,4);
        new Thing (townsburg, 8,8);
        new Thing (townsburg, 9,4);
        new Thing (townsburg, 9,5);
        new Thing (townsburg, 9,7);
        
       
           while(roberta.frontIsClear()){
               roberta.move();
               
               if(!roberta.frontIsClear()){
                      roberta.putAllThings();
                  }
               if(roberta.canPickThing()){
                  roberta.pickThing();
               
                  
}
               
}          
}        
}

