/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author ahmaa1808
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner 
        Scanner input = new Scanner(System.in);


        //get a word from user
        System.out.println("Player 1: Enter a word for Player 2 to guess: ");
        String word = input.nextLine();
        String word1 = word;
        int lives = 6;
        String mistake = input.nextLine(); 
        
        
       
        int length = word.length();




        // clear the screen for player 2
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        // replace player's 1 word with dashes for player 2
        word = word.replace("a", "_");
        word = word.replace("b", "_");
        word = word.replace("c", "_");
        word = word.replace("d", "_");
        word = word.replace("e", "_");
        word = word.replace("f", "_");
        word = word.replace("g", "_");
        word = word.replace("h", "_");
        word = word.replace("i", "_");
        word = word.replace("j", "_");
        word = word.replace("k", "_");
        word = word.replace("l", "_");
        word = word.replace("m", "_");
        word = word.replace("n", "_");
        word = word.replace("o", "_");
        word = word.replace("p", "_");
        word = word.replace("q", "_");
        word = word.replace("r", "_");
        word = word.replace("s", "_");
        word = word.replace("t", "_");
        word = word.replace("u", "_");
        word = word.replace("v", "_");
        word = word.replace("w", "_");
        word = word.replace("x", "_");
        word = word.replace("y", "_");
        word = word.replace("z", "_ ");
        word = word.replace("_", "-");

        // output word

        // welcome player 2 
        System.out.println("Welcome to Hangman Player 2!");

        // outprint the blank spaces 
        System.out.println(word);



        while (true) {
            // ask user to input a letter
            System.out.println("Please enter a letter");
            String letter = input.nextLine();


            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter.charAt(0)) {
                    // storing the word for the user to guess
                    word = word.substring(0, i) + letter + word.substring(i + 1 + word.length());
                }
            }
            if 
            
                


                    
                        
                            
                        
                        System.out.println("");
                    }
                }


            }

        






    

