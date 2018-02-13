/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author watsa9604
 */
public class Threadpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create city for Robot
    City townsburg = new City();
    
    //create new Robot
    final RobotSE andy = new RobotSE (townsburg, 0, 0, Direction.SOUTH);
    
    //create second Robot
    RobotSE bob = new RobotSE (townsburg, 0, 1, Direction.SOUTH);
    
    //Label Robot
    andy.setLabel("A");   
    
    //Label Second Robot
    bob.setLabel ("B");
    
    //make bob a different colour
    bob.setColor (Color.CYAN);
    
     //create wall
    new Wall (townsburg, 0, 1, Direction.WEST);
    new Wall (townsburg, 1, 1, Direction.WEST);
    new Wall (townsburg, 1, 1, Direction.SOUTH);
        
        new Thread(){
            public void run(){
                // things to do
    andy.move(); 
    andy.move();
    andy.turnLeft();
    andy.move();
            }
        }.start();
        
    bob.move();
    bob.turnLeft();
    bob.move();
    bob.turnRight();
    bob.move();
    bob.turnRight();
    bob.move();
        
    }
}
