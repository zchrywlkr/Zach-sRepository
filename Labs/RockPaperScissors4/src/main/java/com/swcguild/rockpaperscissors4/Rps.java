/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rockpaperscissors4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Rps {

    public static void main(String[] args) {
        int userChoice;
        int computerChoice;
        int numWins = 0;
        int numLosses = 0;
        int numTies = 0;
        String playAgain = "";
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rounds = 0;

        do {

            do {
                System.out.println("enter the number of rounds");
                rounds = sc.nextInt();
            } while ((rounds <= 0) || (rounds > 10));

            for (int i = 0; i < rounds; i++) {

                sc.nextLine();
                System.out.println("Please enter one of the following:");
                System.out.println("1: Rock\t2:Paper\t3:Scissors");
                userChoice = sc.nextInt();
                computerChoice = 1 + r.nextInt(3);
                System.out.println("I chose " + computerChoice);
                if (userChoice == computerChoice) {
                    System.out.println("Tie!");
                    numTies++;
                } else if (userChoice == 1) {
                    if (computerChoice == 2) {
                        System.out.println("I win!");
                        numLosses++;
                    } else {
                        System.out.println("You win...");
                        numWins++;
                    }
                } else if (userChoice == 2) {
                    if (computerChoice == 1) {
                        System.out.println("You win...");
                        numWins++;
                    } else {
                        System.out.println("I win!");
                        numLosses++;
                    }
                } else {
                    if (computerChoice == 1) {
                        System.out.println("I win!");
                        numLosses++;
                    } else {
                        System.out.println("You win...");
                        numWins++;
                    }

                }
            }
            System.out.println("You won " + numWins + " times.");
            System.out.println("You lost " + numLosses + " times.");
            System.out.println("We tied " + numTies + " times.");
            System.out.println("\rDo you want to play again \"yes\" \"no\"");
            sc.nextLine();
            playAgain = sc.nextLine();
        } while (playAgain.equals("yes"));
        System.out.println("Thanks for playing");
    }

}
