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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // use a scanner to read info
         Scanner input = new Scanner(System.in);
         
         //ask the user for all of the prom information and make variables for each thing
          System.out.println("How much does food for the prom cost?");
          double food = input.nextDouble();
          System.out.println("How much does the DJ cost?");
          double DJ = input.nextDouble();
          System.out.println("How much does it cost to rent the hall?");
          double Hall = input.nextDouble();
          System.out.println("How much do the decorations cost?");
          double Decor = input.nextDouble();
          System.out.println("How much does it cost for staff?");
          double Staff = input.nextDouble();
          System.out.println("How much for miscellaneous costs?");
          double Misc = input.nextDouble();
          
          //add all of the costs together
          double total = food + DJ + Hall + Decor + Staff + Misc;
          
          //Calculate the number of tickets needed to sell in order to break even
          double tickets = total / 35;
          
          //round the final value to a whole number
          tickets = Math.round(tickets);
          
          //tell the user the total costs and the amount of tickets they need to sell
          System.out.println("The total cost is " + total + ". you will need to sell " + tickets + " tickets to break even");
          
    }
}
