/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author watsa9604
 */
public class A7Q7 {

    public static int firstDigit(int firstDig) {

        //divide the number by ten until it is less than or equal to 9
        for (int i = 0; i < 100; i++) {
            if (firstDig > 9) {
                firstDig = firstDig / 10;
            }
        }
        //output the first digit of the number to the user
        System.out.println(firstDig);

        return firstDig;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        firstDigit(907);

    }
}
