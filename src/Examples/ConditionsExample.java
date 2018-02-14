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
 *
 * @author watsa9604
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //Create a city for the Robot      
  City townsburg = new City();
  
  //Put a Robot in Townsburg
  RobotSE andy = new RobotSE(townsburg, 2, 1, Direction.EAST);
  
  //Set the color of the Robot
  andy.setColor(Color.YELLOW);
  
  //create a wall infornt
  new Wall (townsburg, 2,5, Direction.EAST);
  
  //create things
  new Thing (townsburg, 2,2);
  new Thing (townsburg, 2,4);
          
  //move until front is not clear
  while(andy.frontIsClear()){
  //if front is clear
  andy.move();
  
  //is there something to pick up?
  if(andy.canPickThing()){
  andy.pickThing();
  }
  }
  //when front is not clear
  andy.turnRight();
  //do you have 1 thing in your backpack
  if(andy.countThingsInBackpack()==1){
  andy.move();
  }else if(andy.countThingsInBackpack()==2){
  andy.move(2);
  }else{
  andy.turnAround();
}
}
}