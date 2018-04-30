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

    public static void circleArea() {

        //creates a scanner
        Scanner input = new Scanner(System.in);
        
        //asks the user for the radius
        System.out.println("Please enter the radius.");
        
        //calculates the area of the circle and outputs it to the user
        double radius = input.nextInt();
        double area = 3.14159*radius*radius;
        Math.ceil(area);
        System.out.println("The area of the circle is " + area);
    }
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circleArea();
    }
}
