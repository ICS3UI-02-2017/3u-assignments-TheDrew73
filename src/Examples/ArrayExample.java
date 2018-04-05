/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);

        // make an array to store expenses
        double[] expenses = new double[6];

        //let the user know to get the costs
        System.out.println("PLease enter costs for Prom");

        //use a for loop for input
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = input.nextDouble();
        }
        //adding all of the expenses
        double sum = 0;

        for (int i = 0; i < expenses.length; i++) {

            //get the expense
            double expense = expenses[i];

            //add it to the sum
            sum = sum + expense;
        }
        System.out.println("Total cost is " + sum);

        double tickets = Math.ceil(sum / 35);

        System.out.println("Need to sell " + tickets + "tickets.");
    }
}
