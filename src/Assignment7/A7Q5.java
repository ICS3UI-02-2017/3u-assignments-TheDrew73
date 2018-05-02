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
public class A7Q5 {

    public static void chaotic(int random) {

        //creates 5 random numbers between 1 and 5
        for (int i = 0; i < random; i++) {
            String empty = "";
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            //changes the numbers to the same number of *
            for (i = 0; i < randNum; i++) {
                empty = empty + "*";
            }
            System.out.println(empty);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creates a scanner
        Scanner input = new Scanner(System.in);

        //asks the user for a number and outputs that many lines of *
        System.out.println("Input a number.");

        int random = input.nextInt();

        chaotic(random);
    }
}
