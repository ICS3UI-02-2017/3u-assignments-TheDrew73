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
public class A7Q4 {

    public static double compoundInterest(double initialValue) {

        return initialValue;
    }
    public static double compoundInterest2(double rateValue) {
        
       return rateValue;
    }
    public static double compoundInterest3(double years) {
        
        return years;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your initial amount.");
        double initialValue = input.nextDouble();

        System.out.println("Please enter the current interest rate.");
        double rateValue = input.nextDouble();
        
        System.out.println("In years, how long do you plan on using the account for?");
        double years = input.nextDouble();
        
        double balance = initialValue * rateValue + 1; Math.pow(rateValue + 1, years);
        System.out.println("Your total balance after " + years + " years is " + balance);
        
    }   
}
