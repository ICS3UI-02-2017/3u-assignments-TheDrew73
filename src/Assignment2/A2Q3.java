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
        RobotSE andy = new RobotSE(townsburg, 8, 5, Direction.WEST);

        //Set the color of the Robot
        andy.setColor(Color.CYAN);
                
        andy.setLabel("A");
        
        while(andy.getAvenue()!=0){
            
        if(andy.getAvenue()!=0){
        andy.move();
        andy.getAvenue();
    }
        while(andy.getStreet()!=0){
        andy.move();
        andy.getStreet();
        
}
}
}
}