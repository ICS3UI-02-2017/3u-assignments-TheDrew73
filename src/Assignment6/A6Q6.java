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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        int total = 0;

        int number = 0;
        //set integer x to 0
        int x = 0;
        //set integer y to 0
        int y = 0;
        //set integer sort to 0
        int sort = 0;

        //ask the user for the number of marks
        System.out.println("please enter the number of students in the class.");
        number = input.nextInt();

        //creates an array for the integers
        int[] marks = new int[number];

        System.out.println("please enter the class marks.");
        //saves the numbers that the user typed in, into an array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            total = total + marks[i];
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
        //find the mark at spot 0 after its sorted, and that will be the lowest mark
        System.out.println("The lowest mark is " + marks[0]);

        //find the mark at the last spot in the array after its sorted and that will be the highest mark
        int highest = number;
        System.out.println("The highest mark is " + marks[highest - 1]);

        //add up all of the marks and divide them by how many marks there are and that will give you the average
        int average = total / number;
        System.out.println("The class average is " + average);
    }
}
