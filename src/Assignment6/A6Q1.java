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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] percents = new double[6];

        double students = 0;

        System.out.println("How many students are in the class?");

        for (int i = 0; i == students;) {
            students = input.nextDouble();
        }

        System.out.println("Enter the marks");

        for (int i = 0; i < percents.length; i++) {
            percents[i] = input.nextDouble();

        }

        //adding all of the expenses
        double sum = 0;
        double average = 0;

        for (int i = 0; i < percents.length; i++) {

            //get the expense
            average = average + percents[i];

        }
        
        sum = average / students;

        System.out.println("The class average is " + sum);
    }
}
