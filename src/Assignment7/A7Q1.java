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
public class A7Q1 {

    public static double circleArea(double radius) {

        //calculates the area of the circle
        double area = 3.14159*Math.pow(radius, 2);
        Math.ceil(area);
        return area;
    }
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double area = 0;
        
        //creates a scanner
        Scanner input = new Scanner(System.in);
        
        //asks the user for the radius
        System.out.println("Please enter the radius.");
        
        //outputs the area of the circle to the user
        double radius = input.nextInt();
        area = circleArea(radius);
        System.out.println("The area of the circle is " + area);
    }
}
