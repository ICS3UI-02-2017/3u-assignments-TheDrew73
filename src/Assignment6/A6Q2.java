/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many people are in the group
        System.out.println("How many people are in the group?");

        //set variable "people" to zero
        int people = 0;

        /*set i equal to zero and when i is equal to the amount of people 
         *entered in by the user, the double array will create that amount of number
         * arrays
         */
        for (int i = 0; i == people;) {
            people = input.nextInt();
        }

        double[] heights = new double[people];

        //average height is 5'10
        double average = 5.10;

        //asks the user to enter the heights 
        System.out.println("Enter the heights");

        //places the numbers entered by the user into an array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();

            //if one of the heights entered is over 5'10 then they are above average height
            if (heights[i] > 5.10) {
                System.out.println(heights[i] + " is above average height!");
            }

             //if one of the heights entered is under 5'10 then they are below average height
            if (heights[i] < 5.10) {
                System.out.println(heights[i] + " is below average height...");
            }

        }
    }
}
