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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int flip = 0;

        //ask the user for 10 marks
        System.out.println("please enter the 10 marks.");

        //creates an array for the two integers
        int[] marks = new int[10];

        for (i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();

            for (j = 0; j > marks[i]; j++) {
                if (marks[j] > marks[i]) {
                }
            }
        }

        System.out.println("The marks from lowest to highest are " + marks[j]);
    }
}