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

        //set integer x to 0
        int x = 0;
        //set integer y to 0
        int y = 0;
        //set integer sort to 0
        int sort = 0;

        //ask the user for 10 marks
        System.out.println("please enter the 10 marks.");

        //creates an array for the ten integers
        int[] marks = new int[10];

        //saves the numbers that the user typed in, into an array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        //creates two variables that run through the array and keep track of all the numbers
        for (x = 0; x < marks.length; x++) {
            for (y = 0; y < marks.length; y++) {
                /*if a number in the first array is smaller than a number in the second
                 * then switch the two numbers around
                 */
                if (marks[x] < marks[y]) {
                    sort = marks[x];
                    marks[x] = marks[y];
                    marks[y] = sort;
                }

            }

        }
        //tell the user the numbers in order of lowest to highest
        System.out.println("The marks from lowest to highest are ");
        for (x = 0; x < 10; x++) {
            System.out.println(marks[x]);
        }
    }
}