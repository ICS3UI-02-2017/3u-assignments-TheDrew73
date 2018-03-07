/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //set variable position equal to one
        int position = 1;
        
        /*while position is less than or equal to 100, the user will be asked to input
         * their dice roll, and will be moved accrodingly
         */
        while(position <= 100){
            System.out.println("Enter sum of Dice:");
          int roll = input.nextInt();
          position = roll+position;
            System.out.println("You are now on square " + position);
            
            //if the user tries to move more than 12 spaces, they get a game over
             if(roll >=13){
                System.out.println("You Lose!");
                System.exit(0);
    } 
            //if the user tries to move less than 2 spaces, they get a game over
            if(roll <=1){
                System.out.println("You Lose!");
                System.exit(0);
    } 
            //if the postion of the user is higher than 100 they must roll again
             if(position >= 101){
                 position = position - roll;
               System.out.println("Roll again");
        }
            //if the user is on the 100th square they win
           if(position == 100){
               System.out.println("You win!");
        }
           //The user hits a ladder if the are on square 9
           if(position == 9){
               position = 34;
               System.out.println("Ladder!");
               System.out.println("you are now on square 34");
    }
           //The user hits a ladder if the are on square 40
           if(position == 40){
               position = 64;
               System.out.println("Ladder!");
               System.out.println("you are now on square 64");
    }
           //The user hits a snake if the are on square 54
           if(position == 54){
               position = 19;
               System.out.println("Snake!");
               System.out.println("you are now on square 19");
    }
           //The user hits a ladder if the are on square 67
           if(position == 67){
               position = 86;
               System.out.println("Ladder!");
               System.out.println("you are now on square 86");
    }
           //The user hits a snake if the are on square 90
           if(position == 90){
               position = 48;
               System.out.println("Snake!");
               System.out.println("you are now on square 48");
    }
           //The user hits a snake if the are on square 99
           if(position == 99){
               position = 77;
               System.out.println("Snake!");
               System.out.println("you are now on square 77");
    }
}
}
}