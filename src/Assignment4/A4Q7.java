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
         
       for(int gameBoard = 1; gameBoard <= 100;){
           
           
             int[] gameBoards = new int[3];
             
           System.out.println("Enter sum of dice:");
           int roll1 = input.nextInt();
           gameBoards[0] = roll1 + gameBoard;
           System.out.println("You are now on square " +gameBoards[0]);
           
           System.out.println("Enter sum of dice:");
           int roll2 = input.nextInt();
           gameBoards[1] = roll2 + gameBoards[0];
           System.out.println("You are now on square " +gameBoards[1]);
           
           System.out.println("Enter sum of dice:");
           int roll3 = input.nextInt();
           gameBoards[2] = roll3 + gameBoards[1];
           System.out.println("You are now on square " +gameBoards[2]);
           
          
      
    
  
         
            
    }
}
}
