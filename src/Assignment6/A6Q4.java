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

        //ask the user for 10 marks
        System.out.println("please enter the 10 marks.");

        //creates an array for the two integers
        double[] marks = new double[10];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();

    }
        if (marks[0] > marks[1]){
            System.out.println("" + marks[1] + marks[0]);
    }
}
}