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
public class ThreadpracticeA1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city for Robot
        City townsburg = new City();

        //create new Robot
        RobotSE andy = new RobotSE(townsburg, 0, 1, Direction.WEST);

        //create second Robot
        final RobotSE bob = new RobotSE(townsburg, 3, 3, Direction.EAST);

        //Label Robot
        andy.setLabel("A");

        //Label Second Robot
        bob.setLabel("B");

        //make bob a different colour
        bob.setColor(Color.CYAN);

        //create expensive items
        new Thing(townsburg, 0, 0);
        new Thing(townsburg, 1, 0);
        new Thing(townsburg, 1, 1);
        new Thing(townsburg, 1, 2);
        new Thing(townsburg, 2, 2);

        //create neighboring house
        new Wall(townsburg, 2, 3, Direction.WEST);
        new Wall(townsburg, 2, 3, Direction.EAST);
        new Wall(townsburg, 2, 3, Direction.NORTH);
        new Wall(townsburg, 3, 3, Direction.EAST);
        new Wall(townsburg, 3, 3, Direction.SOUTH);

        //add thread
        new Thread() {
            public void run() {
                //make bob pick up the things
                bob.turnAround();
                bob.move();
                bob.turnRight();
                bob.move();
                bob.pickThing();
                bob.move();
                bob.pickThing();
                bob.turnLeft();
            }
        }.start();

        //make andy pick up the things
        andy.move();
        andy.pickThing();
        andy.turnLeft();
        andy.move();
        andy.pickThing();
        andy.turnLeft();
        andy.move();
        andy.pickThing();
    }
}
