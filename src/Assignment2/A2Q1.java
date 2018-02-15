/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Create a city for the Robot      
  City townsburg = new City();
  
  // Put a Robot in Townsburg
  RobotSE andy = new RobotSE(townsburg, 1, 1, Direction.EAST);
  
  andy.setLabel("A");
  
  //Set the color of the Robot
  andy.setColor(Color.CYAN);
  
  //create the 10 things
  new Thing (townsburg,1,2);
  new Thing (townsburg,1,3);
  new Thing (townsburg,1,4);
  new Thing (townsburg,1,5);
  new Thing (townsburg,1,6);
  new Thing (townsburg,1,7);
  new Thing (townsburg,1,8);
  new Thing (townsburg,1,9);
  new Thing (townsburg,1,10);
  new Thing (townsburg,1,11);
  
  
  andy.move();
  
  while(andy.canPickThing()){
  
  //is there something to pick up?
  if(andy.canPickThing()){
  andy.pickThing();
  andy.move();
  
  if(andy.countThingsInBackpack()==7){
  andy.move(3);
 
  
  } 
  }
  
}
}
}