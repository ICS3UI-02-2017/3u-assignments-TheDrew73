/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author watsa9604
 */
public class A7Q3 {

    public static void factors(int num) {

        //tells the user the factors of whatever number they entered
        System.out.println("the factors of " + num + " are: ");

        //calculates all of the fators for the number that the user wants
        for (int i = 1; i < 9999; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //is the number that the user wants
        factors(10);
    }
}
