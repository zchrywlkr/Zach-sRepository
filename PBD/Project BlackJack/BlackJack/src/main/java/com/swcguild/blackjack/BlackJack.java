package com.swcguild.blackjack;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        int player = 0;
        int temp = 0;
        int computer = 0;
        int card1 = 0;
        int card2 = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String playerChoice = "";
        double money = 0;
        String playAgain = "";
        double bet = 0;
        int playerAces = 0;
        int computerAces = 0;
        System.out.println("how much money do you have");
        money = sc.nextDouble();
        sc.nextLine();
        do {
            System.out.println("How much money do you want to bet? ");
            bet = sc.nextDouble();
            sc.nextLine();
            card1 = 2 + r.nextInt(10);
            card2 = 2 + r.nextInt(10);
            if (card1 == 11) {
                playerAces++;
            }
            if (card2 == 11) {
                playerAces++;
            }
            player = card1 + card2;
            System.out.println("you have " + card1 + " and " + card2 + ", for a total of " + player);
            card1 = 2 + r.nextInt(10);
            card2 = 2 + r.nextInt(10); //keeping the value of computers hiden card
            if (card1 == 11) {
                computerAces++;
            }
            if (card2 == 11) {
                computerAces++;
            }
            System.out.println("the computer has " + card1);
            computer = card1 + card2;

            System.out.println("\"hit\" \"Stay\"");
            playerChoice = sc.nextLine();

            while (playerChoice.equals("hit") && (player != 0)) {
                temp = player;
                player = deal("player", player, playerAces);
                if (player <= temp) {
                    playerAces--;
                }
//                card1 = 2 + r.nextInt(11);
//                player += card1;
//                System.out.println("you were dealt a " + card1 + " total is " + player);
//                if (player > 21) {
//                    System.out.println("player bust");
//                    player = 0; // setting player to 0 to indicate automatic loss.
//                    break;
//                }
                if (player != 0) {
                    System.out.println("\"hit\" \"Stay\"");
                    playerChoice = sc.nextLine();
                }
            }
            System.out.println("Dealer's hidden card is a " + card2 + ", and the total is " + computer);
            while ((computer < 17) && (computer != 0) && (player != 0)) {
                temp = computer;
                computer = deal("dealer", computer, computerAces);
                if (computer <= temp) {
                    computerAces--;
                }
//                card1 = 2 + r.nextInt(11);
//                computer += card1;
//                System.out.println("Dealer draws " + card1 + ", and the total is now " + computer);
//                if (computer > 21) {
//                    System.out.println("dealer bust");
//                    computer = 0; // setting computer to 0 to indicate automatic loss.
//                    break;
//                }
            }
            if (player == computer) {
                System.out.println("Tie!");
            } else if (player < computer) {
                System.out.println("Computer wins!");
                money -= bet;
            } else {
                System.out.println("Player wins!");
                money += bet;
            }
            System.out.println("You have " + money + " left.  Play again? \"y\" \"n\"");
            playAgain = sc.nextLine();
        } while ((money > 0 && playAgain.equals("y")));
    }
    public static int deal(String player, int hand, int aces) {
        Random r = new Random();
        int card = 2 + r.nextInt(10);
        if (card == 11) { 
            if ((hand + card) > 21) {
                card = 1;
            }
        }
        hand += card;
        System.out.print(player + " is dealt a " + card);
        if (hand > 21) {
            if (aces > 0) {
                hand -= 10;
            } else {
                System.out.println(player + " bust");
                hand = 0; // setting player to 0 to indicate automatic loss.
            }
        }
        System.out.println(" total is " + hand);
        return hand;
    }
}
