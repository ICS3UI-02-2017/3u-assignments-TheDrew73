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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
      // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
         System.out.println("Please enter the measurement in inches you wish to convert.");
       
        
         
         double conversion = input.nextInt();
         double number = conversion * 2.54;
         
          if(conversion <= 0) {
            System.out.println("Don't you have anything better to do?");
               System.out.println("try again...");
           
        } else {
         
         System.out.println( conversion + " inches is the same as " + number + " cm ");
         
          
        
        
    }
}
}