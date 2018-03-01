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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // use a scanner to read info
         Scanner input = new Scanner(System.in);
        
         //ask the user for their 4 numbers
        System.out.println("Please enter in 4 numbers on different lines");
        
        //create 4 variables for the numbers
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        
        //tell the user their numbers
        System.out.println("Your numbers were "+number1+", "+number2+", "+number3+", "+number4);
        
    }
}
