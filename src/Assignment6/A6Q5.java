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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        int number = 0;
        //set integer x to 0
        int x = 0;
        //set integer y to 0
        int y = 0;
        //set integer sort to 0
        int sort = 0;
        
        //ask the user for the number of marks
        System.out.println("please enter the number of marks.");
        number = input.nextInt();

        //creates an array for the integers
        int[] marks = new int[number];

        System.out.println("please enter the class marks.");
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
        for (x = 0; x < number; x++) {
            System.out.println(marks[x]);
        }


        //if the number of marks is odd take the middle number of the marks and output i to the user
        if (number % 2 == 1) {
            int odd = number / 2;
            System.out.println("The medium of this set of marks is " + marks[odd]);
        } else {
            //otherwise if the number is even, then output the media to the user
                int even = number / 2;
                System.out.println("The media of this set of marks is " + marks[even-1] + ", " + marks[even]);
            
        }
    }
}