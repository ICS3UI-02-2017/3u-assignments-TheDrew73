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
         
         System.out.println("Please enter your name.");
         int name = input.nextInt();
         
         System.out.println("What was your first test out of?");
         double outOf = input.nextDouble();
         System.out.println("What mark did you get?");
         double mark = input.nextDouble();
         
         double[] marks = new double[5];
         marks[0] = 263.3;
         marks[1] = marks[0] * marks[1];
         for (int i = 0; i < 5; i++) {
            marks[i] = input.nextDouble();
            
        }
    }
}
