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
                
                String complete = "";
                
                //use a loop to go through the characters
                for (int i = 0; i < length; i++) {
                
                    //is the character at position "i" a vowel?
                    if (startWord.charAt(i) == 'a'
                            || startWord.charAt(i) == 'e'
                            || startWord.charAt(i) == 'i'
                            || startWord.charAt(i) == 'o'
                            || startWord.charAt(i) == 'u') {
                        
                  
                        
                        
                        
                        
                        //i is the position of the vowel
                        //String start = startWord.substring(0, i);
                        //break the word apart at the vowel
                        //String end = startWord.substring(i);                        
                                              
                             //System.out.println(startWord + " in Ubbi Dubbi is " + complete3);
                            
                        
                      
           
                        
                       
                        
            
          
}
}
}
}
}

