/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the Robots
 * @author watsa9604
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  // Create a city for the Robot      
  City townsburg = new City();
  
  // Put a Robot in Townsburg
  RobotSE boop = new RobotSE(townsburg, 0, 3, Direction.EAST);
  
  //create wall
  new Wall(townsburg, 2, 5, Direction.WEST);
  
  //create a thing
  new Thing(townsburg,1,4);
  new Thing(townsburg,2,4);
  new Thing(townsburg,3,4);
  new Thing(townsburg,4,4);
  
  boop.setLabel("B");
  
  //Set the color of the Robot
  boop.setColor(Color.CYAN);
  
  //move the Robot forward 1 space
  boop.move();
  
  //pick up the thing
  //boop.pickThing();
  
  //move the robot "n" number of spaces
  //boop.move(2);
  
  //turn the Robot
  boop.turnRight();
  
  boop.move();
  boop.pickThing();
  boop.move();
  boop.pickThing();
  boop.move();
  boop.pickThing();
  boop.move();
  boop.pickThing();
  boop.turnLeft();
  boop.move();
  boop.turnLeft();
  boop.move(2);
  boop.putThing();
  boop.move();
  boop.turnRight();
  boop.move();
  boop.putThing();
  boop.turnRight();
  boop.move();
  boop.putThing();
  boop.move();
  boop.turnLeft();
  
  //put the thing down
  boop.putThing();
  
  boop.move();
  boop.turnAround();
  boop.turnAround();
    }
}
/**questions
 * countThingsInBackpack();
 * frontIsClear();
 * isBesideThing();
 * 
 * if(Condition){
 * }
 * while(Condition){
 * } Will repeat.
 */