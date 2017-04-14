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

        while (true) {
            //get a word from user
            System.out.println("Welcome to Hangman!");
            System.out.println("Player 1: Enter a word for Player 2 to guess: ");
            String word = input.nextLine();
            
            // quit if word is empty
            if (word.isEmpty() == true) {
                System.out.println("Thank you for playing");
                break;
            }
            // creating a string for the word inputed by player 1
            String word1 = word;

            // the number of lives player 2 has to guess the word
            int lives = 6;

            // clear the screen for player 2
            for (int i = 1; i <= 20; i++) {
                System.out.println("\n\n\n\n");
            }

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
            word = word.replace("z", "_");
            word = word.replace("_", "-");

            // welcome player 2 
            System.out.println("Welcome to Hangman Player 2!");

            // outprint the blank spaces 
            System.out.println(word);

            //loop
            while (!(word1.equals(word))) {
                // ask player 2 to input a letter
                System.out.println("Please enter a letter");
                String letter = input.nextLine();

                // if player 2 does not input anything, exit the game
                if (letter.isEmpty()) {
                    System.out.println("Thank you for playing");
                    break;
                }

                // if the user guesses a correct letter, the letter will replace the blank in the corresponding position  
                boolean mistake = true;
                for (int i = 0; i < word.length(); i++) {
                    if (word1.charAt(i) == letter.charAt(0)) {
                        mistake = false;
                        // storing the word for the user to guess
                        word = word.substring(0, i) + letter + word.substring(i + 1, word.length());

                    }
                }
                // if guessed letter by Player 2 is wrong, take one life, until there are no more
                System.out.println(word);
                if (mistake == true) {
                    lives--;
                    System.out.println("You got it wrong. You have " + lives + " lives left");
                    if (lives == 0) {
                        System.out.println("You have lost");
                        System.out.println("Sorry, the word was " + word1);
                        System.exit(0);
                        break;

                    }

                }
            }

            // if Player 2 guesses Player 1's word(s) with more than 0 lives left, they win 
            if (!(lives == 0 && word1 == word)) {
                System.out.println("You win! Congratulations");
            }
        }
    }
}
