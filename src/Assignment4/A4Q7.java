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

        for (int gameBoard = 1; gameBoard <= 100;) {

           
                
            int[] gameBoards = new int[12];

            System.out.println("Enter sum of dice:");
            int roll1 = input.nextInt();
            gameBoards[0] = roll1 + gameBoard;
            System.out.println("You are now on square " + gameBoards[0]);

            System.out.println("Enter sum of dice:");
            int roll2 = input.nextInt();
            gameBoards[1] = roll2 + gameBoards[0];
            System.out.println("You are now on square " + gameBoards[1]);

            System.out.println("Enter sum of dice:");
            int roll3 = input.nextInt();
            gameBoards[2] = roll3 + gameBoards[1];
            System.out.println("You are now on square " + gameBoards[2]);

            System.out.println("Enter sum of dice:");
            int roll4 = input.nextInt();
            gameBoards[3] = roll4 + gameBoards[2];
            System.out.println("You are now on square " + gameBoards[3]);

            System.out.println("Enter sum of dice:");
            int roll5 = input.nextInt();
            gameBoards[4] = roll5 + gameBoards[3];
            System.out.println("You are now on square " + gameBoards[4]);

            System.out.println("Enter sum of dice:");
            int roll6 = input.nextInt();
            gameBoards[5] = roll6 + gameBoards[4];
            System.out.println("You are now on square " + gameBoards[5]);

            System.out.println("Enter sum of dice:");
            int roll7 = input.nextInt();
            gameBoards[6] = roll7 + gameBoards[5];
            System.out.println("You are now on square " + gameBoards[6]);

            System.out.println("Enter sum of dice:");
            int roll8 = input.nextInt();
            gameBoards[7] = roll8 + gameBoards[6];
            System.out.println("You are now on square " + gameBoards[7]);

            System.out.println("Enter sum of dice:");
            int roll9 = input.nextInt();
            gameBoards[8] = roll9 + gameBoards[7];
            System.out.println("You are now on square " + gameBoards[8]);
            
            if(gameBoards[8] == 100){
                System.out.println("You Win!");
            }
            
            System.out.println("Enter sum of dice:");
            int roll10 = input.nextInt();
            gameBoards[9] = roll10 + gameBoards[8];
            System.out.println("You are now on square " + gameBoards[9]);

            if(gameBoards[9] == 100){
                System.out.println("You Win!");
            }
            
            System.out.println("Enter sum of dice:");
            int roll11 = input.nextInt();
            gameBoards[10] = roll11 + gameBoards[9];
            System.out.println("You are now on square " + gameBoards[10]);

            if(gameBoards[10] == 100){
                System.out.println("You Win!");
            }
            
            System.out.println("Enter sum of dice:");
            int roll12 = input.nextInt();
            gameBoards[11] = roll12 + gameBoards[10];
            System.out.println("You are now on square " + gameBoards[11]);

            if(gameBoards[11] == 100){
                System.out.println("You Win!");
            }


        }

    }
}
