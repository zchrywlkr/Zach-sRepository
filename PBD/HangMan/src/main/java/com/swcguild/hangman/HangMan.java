/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hangman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HangMan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = word();
        String letters[] = new String[word.length()];
        String guess = " ";
        int win = 0;
        int count = 0;
        String misses = "";

        letters = initialize(letters);

        do {
            printGame(letters, count,misses);
            System.out.println("enter your guess");
            guess = sc.nextLine();

            if (correct(letters, word, guess) != 0) {
                win += correct(letters, word, guess);
                System.out.println("you are correct");
                System.out.println("Hit enter to continue");
                letters = guess(letters, word, guess);
                sc.nextLine();
            } else {
                misses += " "+ guess;
                count++;
            }

        } while (win < word.length() && count < 9);

        printGame(letters, count,misses);
        if (win == word.length()) {
            System.out.println("you win");
        }else {
            System.out.println("\ryou lose");
        }

    }

    public static void printGame(String[] letters, int count, String misses) {
        String head = " ";
        String body = " ";
        String rarm = " ";
        String larm = " ";
        String rleg = " ";
        String lleg = " ";

        if (count > 0) {
            head = "O";
            if (count > 1) {
                body = "|";
                if (count > 3) {
                    rarm = "\\";
                    if (count > 4) {
                        larm = "/";
                        if (count > 5) {
                            rleg = "\\";
                        }
                        if (count > 8) {
                            lleg = "/";
                        }
                    }
                }
            }

        }

        System.out.println("\r\r\r\r\r\r\r\r");
        System.out.println("\t\t______      misses");
        System.out.println("\t\t|    |      " + misses);
        System.out.println("\t\t" + head + "    |");
        System.out.println("\t       " + larm + body + rarm + "   |");
        System.out.println("\t\t" + body + "    |");
        System.out.println("\t       " + lleg + " " + rleg + "   |");
        System.out.println("\t\t     |");

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }

    }

    public static String word() {
        Random r = new Random();
        int number = 1 + r.nextInt(16);
        switch (number) {
            case 1:
                return "abruptly";

            case 2:
                return "affix";

            case 3:
                return "askew";

            case 4:
                return "axiom";

            case 5:
                return "azure";

            case 6:
                return "bagpipes";

            case 7:
                return "banjo";

            case 8:
                return "croquet";

            case 9:
                return "cobweb";

            case 10:
                return "daiquiri";

            case 11:
                return "disavow";

            case 12:
                return "duplex";

            case 13:
                return "foxglove";

            case 14:
                return "gazebo";

            case 15:
                return "injury";

        }
        return "pneumonoultramicroscopicsilicovolcanoconiosis";
        

    }

    public static String[] initialize(String[] letters) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = "_";
        }
        return letters;
    }

    public static String[] guess(String[] letters, String word, String guess) {

        for (int i = 0; i < word.length(); i++) {
            if (Character.toString(word.charAt(i)).equals(guess)) {
                letters[i] = guess;
            }
        }
        return letters;
    }

    public static int correct(String[] letters, String word, String guess) {
        int correctLetters = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toString(word.charAt(i)).equals(guess)) {
                correctLetters++;
            }
        }
        return correctLetters;
    }
}
