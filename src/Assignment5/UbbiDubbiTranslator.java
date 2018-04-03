/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author watsa9604
 */
public class UbbiDubbiTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //repeat the translator
        while (true) {

            //get the word to translate
            System.out.println("Enter a word to translate");
            String startWord = input.nextLine();

            //sanitize the input
            startWord = startWord.toLowerCase();

            //walk down the word looking for the vowel
            int length = startWord.length();

            //create an empty string
            String complete = "";

            boolean flag = false;


            //use a loop to go through the characters
            for (int i = 0; i < length; i++) {

                
                 if (startWord.contains("oo")) {
                flag = true;
                
            } else {
                flag = false;
                 }
                
                //is the character at position "i" a vowel?
                if (startWord.charAt(i) == 'a'
                        || startWord.charAt(i) == 'e'
                        || startWord.charAt(i) == 'i'
                        || startWord.charAt(i) == 'o'
                        || startWord.charAt(i) == 'u') {
                
                     
                    
                    //"ub" will be placed in front of any vowel
                    complete += "ub";
                    
                }   
                //adds the vowels that the user put in, to the empty string
                complete += startWord.charAt(i);
           
                } 
          
            /*
             * because the original word was put into the empty string, all 
             * of the vowels had "ub" added in front of them.
             */

            System.out.println(startWord + " in Ubbi Dubbi is " + complete);
        }
            
    }
}
