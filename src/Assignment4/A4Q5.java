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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read info
         Scanner input = new Scanner(System.in);
         
         //ask the user for their name
         System.out.println("Please enter your name.");
          //make a string
        String name = input.nextLine();
         
        //ask the user what each of their tests was out of, and what their scores were
         System.out.println("What was your first test out of?");
         double outOf = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark = input.nextDouble();
         System.out.println();
         System.out.println("What was your second test out of?");
         double outOf2 = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark2 = input.nextDouble();
         System.out.println();
         System.out.println("What was your third test out of?");
         double outOf3 = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark3 = input.nextDouble();
         System.out.println();
         System.out.println("What was your fourth test out of?");
         double outOf4 = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark4 = input.nextDouble();
         System.out.println();
         System.out.println("What was your fifth test out of?");
         double outOf5 = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark5 = input.nextDouble();
         System.out.println();
         
         //calculate what percentage the user got on each test
          double[] marks = new double[5];
         marks[0] = mark / outOf * 100;
         marks[1] = mark2 / outOf2 * 100;
         marks[2] = mark3 / outOf3 * 100;
         marks[3] = mark4 / outOf4 * 100;
         marks[4] = mark5 / outOf5 * 100;
         
       
         //tell the user their test scores
         System.out.println("Test scores for " + name);
       
         
         System.out.println("Test 1: " + marks[0] + "%");
         System.out.println("Test 2: " + marks[1] + "%");
         System.out.println("Test 3: " + marks[2] + "%");
         System.out.println("Test 4: " + marks[3] + "%");
         System.out.println("Test 5: " + marks[4] + "%");
            
         //calculate the users average mark
         double total = marks[0] + marks[1] +marks[2] + marks[3] + marks [4];
         double Total = total / 5;
         
         //tell the user their avergae mark
         System.out.println();
         System.out.println("Average:" + Total + "%");
         
        
         
        
                
         
         
    }
}
