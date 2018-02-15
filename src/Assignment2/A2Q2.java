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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Create a city for the Robot      
  City townsburg = new City();
  
  //Put a Robot in Townsburg
  RobotSE andy = new RobotSE(townsburg, 4, 1, Direction.EAST);
  
  //Set the color of the Robot
  andy.setColor(Color.CYAN);
  
  andy.setLabel("A");
  
  for(int i = 1; i <= 8; i = i + 1){
      new Wall (townsburg, 4,i, Direction.SOUTH);
  }
  new Wall (townsburg, 4, 2, Direction.EAST);
  new Wall (townsburg, 4, 4, Direction.EAST);
  new Wall (townsburg, 4, 5, Direction.EAST);
  new Wall (townsburg, 4, 7, Direction.EAST);
  
  new Thing (townsburg, 4, 8);
  
  andy.move();
  
  while(andy.frontIsClear()){
  andy.move();

    } 
  while(!andy.frontIsClear()){
  andy.turnLeft();
  andy.move();
  andy.turnRight();
  andy.move();
  andy.turnRight();
  andy.move();
  andy.turnLeft();
  
  if(!andy.frontIsClear()){
 
  }else{
  andy.move();
    }
}
    }
}