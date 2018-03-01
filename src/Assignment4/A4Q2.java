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
        
         //opening line to the user
         System.out.println("Please enter the measurement in inches you wish to convert.");
         
         //setting the variables
         double conversion = input.nextDouble();
         double number = conversion * 2.54;
         
         //if the user tries to get smart...
          if(conversion <= 0) {
               System.out.println("Try again...");
           conversion = input.nextInt();
           number = conversion * 2.54;
           
        } 
         //final statement that will give the user the conversion info
         System.out.println( conversion + " inches is the same as " + number + " cm ");
         
          
        
        
    
          
}
}