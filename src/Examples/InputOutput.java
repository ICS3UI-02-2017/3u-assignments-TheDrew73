/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //print a line of text
        System.out.println("Hello World!");
        System.out.println("Another Line!");
        //empty space
        System.out.println();
        
        //printing on the same line
        System.out.print("I Like ");
        System.out.println("food!");
        
        //special characters (Quotation marks)
        System.out.println("\"I'm in quotation marks!\" ");
        
        //slash
        System.out.println("A slash! \\");
        
        //tab
        System.out.println("food!\t food!\t food!\t");
        
        //a new line
        System.out.println("One Line\nfoooooood");
        
        //outputting numbers
        int number = 10;
        System.out.println("number = "+ number);
        
        System.out.println("number = "+ number +" FOOD GIVE!");
        
        System.out.println("");
        System.out.println("");
        
        
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name! I am human like you!");
        //make a string
        String name = input.nextLine();
        //say hello
        System.out.println("Hello Friend! " + name);
        
        //ask what year they were born
        System.out.println("Hey Friend, What year were you born?");
        
        //mkae a variable for an integer
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        //your an idiot loop
        while(age < 0){
            System.out.println("Try again...");
        birthYear = input.nextInt();
        age = 2018 - birthYear;
        }
        System.out.println("Cool! so you are " + age + "!");
        
        if(age < 0) {
            System.out.println("WHY DO YOU LIE!");
           
        }
         if(age > 45) {
            System.out.println("lol you old");
        }
    }
}
