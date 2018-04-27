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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a scanner
        Scanner input = new Scanner(System.in);

        //setting an integer equal to 0
        int primes = 0;

        //setting the first prime which is two
        int i = 2;

        //createing a boolean array that contains numbers from 2 - 999
        boolean[] flag = new boolean[999];

        //uses the boolean array to mark every number in the array 
        for (i = 2; i < flag.length; i++) {
            flag[i] = true;
        }
        System.out.println("The prime numbers from 2 - 1000 are; ");
        
        //looks though the array
        for (i = 2; i < flag.length; i++) {

            //sets primes equal to whatever "i" is
            primes = i;

            //counts up by an increment of whatever primes is
            int spot = 2 * primes;

            //if a number in the array is marked as true output them to the user
            if (flag[i] == true) {
                System.out.println(primes);

                //while marks every prime number in the boolean array as false
                while (spot < 999) {

                    flag[spot] = false;

                    spot = spot + primes;
                }
            }
        }
    }
}