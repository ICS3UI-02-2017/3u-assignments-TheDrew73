/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author watsa9604
 */
public class A7Q6 {

    public static double lastDigit(double lastDig) {
   
        //finds the last digit
        lastDig = lastDig % 10;
        
        //outputs the last diget 
        System.out.println(lastDig);
   
        return lastDig;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //is the number
        lastDigit(4576);
        
        
    }
}
