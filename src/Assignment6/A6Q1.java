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

        //creates a scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many students are in the class
        System.out.println("How many students are in the class?");
        
        //set variable "students" to zero
        int students = 0;

        /*set i equal to zero and when i is equal to the amount of students 
         *entered in by the user, the double array will create that amount of number
         * arrays
         */
        
         for (int i = 0; i == students;) {
            students = input.nextInt();
        }
        
        double[] percents = new double[students];

        //asks the user to put in the marks of the students
        System.out.println("Enter the marks");

        //places the numbers entered by the user into an array
        for (int i = 0; i < percents.length; i++) {
            percents[i] = input.nextDouble();

        }

        //set two new variables equal to zero
        double sum = 0;
        double average = 0;
        
        //will add each number in the array into a single variable
        for (int i = 0; i < percents.length; i++) {            
            average = average + percents[i];
        }
        
        //calculates the average
        sum = average / students;

        //tell the user the class average
        System.out.println("The class average is " + sum);
    }
}
