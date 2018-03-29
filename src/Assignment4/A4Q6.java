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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // use a scanner to read info
        Scanner input = new Scanner(System.in);

        //ask the user to put in the speed limit and how fast the car is going
        System.out.println("Enter the speed limit:");
        double limit = input.nextDouble();
        System.out.println("Enter the recorded speed of the car:");
        double car = input.nextDouble();

        //if the speed of the car is less than or equal to the speed limit, tell the user they are not speeding
        if (car <= limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        //if the speed of the car is 1-20mph more than the speed limit, tell the user their fine is $100
        for (int fine1 = 1; fine1 <= 20; fine1++) {
            if (car == limit + fine1) {
                System.out.println("You are speeding and your fine is $100.");
            }
        }
        //if the speed of the car is 21-230mph more than the speed limit, tell the user their fine is $270
        for (int fine2 = 21; fine2 <= 30; fine2++) {
            if (car == limit + fine2) {
                System.out.println("You are speeding and your fine is $270.");
            }
        }
        //if the speed of the car is 31mph or more than the speed limit, tell the user their fine is $500
        for (int fine3 = 31; fine3 >= 31; fine3++) {
            if (car == limit + fine3) {
                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}