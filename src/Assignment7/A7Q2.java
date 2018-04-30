/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class A7Q2 {

    public static void examGrade(int grade) {

        //sets all of the grades equal to their respective values, and tells the user their grade
        if (grade < 50) {
            System.out.println("Your grade is an F.");
        }

        for (int gradeD = 51; gradeD <= 59; gradeD++) {
            if (grade == gradeD) {
                System.out.println("Your grade is a D");
            }
        }

        for (int gradeC = 60; gradeC <= 69; gradeC++) {
            if (grade == gradeC) {
                System.out.println("Your grade is a C");
            }
        }

        for (int gradeB = 70; gradeB <= 79; gradeB++) {
            if (grade == gradeB) {
                System.out.println("Your grade is a B");
            }
        }

        if (grade > 80) {
            System.out.println("Your grade is an A.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        //asks the ser for their grade
        System.out.println("Please enter your grade percentage.");

        int grade = input.nextInt();

        examGrade(grade);
    }
}
