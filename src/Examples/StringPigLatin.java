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
public class StringPigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = "hello world";



        if (word.endsWith("th")) {
        }
        if (word.contains("th")) {
        }
        char aCharacter = word.charAt(4);

        if (word.equals("EXIT")) {
        }


        Scanner input = new Scanner(System.in);
        //repeat the translator
        while (true) {
            //get the word to translate
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();
            //sanitize the input
            origWord = origWord.toLowerCase();

            //do we start with a vowel?
            if (origWord.startsWith("a")
                    || origWord.startsWith("e")
                    || origWord.startsWith("i")
                    || origWord.startsWith("o")
                    || origWord.startsWith("u")) {
                //stick ay on the end
                String transWord = origWord + "ay";
                System.out.println(origWord + " in Pig Latin is " + transWord);
            } else {
                //walk down the word looking for the vowel
                int length = origWord.length();
                //use a loop to go through the characters
                for (int i = 0; i < length; i++) {
                    //is the character at position "i" a vowel?
                    if (origWord.charAt(i) == 'a'
                            || origWord.charAt(i) == 'e'
                            || origWord.charAt(i) == 'i'
                            || origWord.charAt(i) == 'o'
                            || origWord.charAt(i) == 'u') {
                        //i is the position of the vowel
                        String start = origWord.substring(0, i);
                        //break the word apart at the vowel
                        String end = origWord.substring(i);

                        //compute translated word
                        String reverse = end + start + "ay";
                        System.out.println(origWord + " in Pig latin is " + reverse);

                        //done looking so stop the for loop
                        break;
                    }
                }
            }
        }
    }
}