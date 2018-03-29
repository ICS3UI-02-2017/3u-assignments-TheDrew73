/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // use a scanner to read info
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");

        //make a string
        String name = input.nextLine();

        //say hello
        System.out.println("Hello " + name + " How are you today? ");
    }
}
