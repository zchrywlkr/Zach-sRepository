/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BlackJack {

    public static void main(String[] args) {
        int player = 0;
        int computer = 0;
        int card1 = 0;
        int card2 = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String playerChoice = "";

        card1 = 2 + r.nextInt(11);
        card2 = 2 + r.nextInt(11);
        System.out.println("you got" + card1 + " and " + card2);
        player = card1 + card2;
        card1 = 2 + r.nextInt(11);
        card2 = 2 + r.nextInt(11); //keeping the value of computers hiden card
        System.out.println("the computer has " + card1);
        computer = card1 + card2;

        System.out.println("\"hit\" \"Stay\"");
        playerChoice = sc.nextLine();

        while (playerChoice.equals("hit")) {
            card1 = 2 + r.nextInt(11);
            player += card1;
            System.out.println("you were dealt a " + card1 + " total is " + player);
            if (player > 21) {
                System.out.println("player bust");
                player = 0; // setting player to 0 to indicate automatic loss.
                break;
            }
            System.out.println("\"hit\" \"Stay\"");
            playerChoice = sc.nextLine();
        }
        System.out.println("Dealer's hidden card is a " + card2 + ", and the total is " + computer);
        while ((computer < 17) && (player != 0)) {
            card1 = 2 + r.nextInt(11);
            computer += card1;
            System.out.println("Dealer draws " + card1 + ", and the total is now " + computer);
            if (computer > 21) {
                System.out.println("dealer bust");
                computer = 0; // setting computer to 0 to indicate automatic loss.
                break;
            }
        }

        if (player == computer) {
            System.out.println("Tie!");
        } else if (player < computer) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Player wins!");
        }

    }

}
