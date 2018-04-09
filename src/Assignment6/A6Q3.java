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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creates a scanner
        Scanner input = new Scanner(System.in);

        //ask the user for two integers
        System.out.println("please enter two integers.");

        //creates an array for the two integers
        int[] bothNums = new int[2];

        //Places both intergers into one varaiable
        for (int i = 0; i < bothNums.length; i++) {
            bothNums[i] = input.nextInt();
        }
        //if the first number is bigger than the second, put it second
        if (bothNums[0] > bothNums[1]) {
            System.out.println("Two integers in acending order are " + bothNums[1] + " " + bothNums[0]);
        }
        //if the second number is bigger than the first, put it second
        if (bothNums[1] > bothNums[0]) {
            System.out.println("Two integers in acending order are " + bothNums[0] + " " + bothNums[1]);
        }

    }
}