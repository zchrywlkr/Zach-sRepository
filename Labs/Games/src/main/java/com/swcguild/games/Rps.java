
package com.swcguild.games;
import java.util.Random;
import java.util.Scanner;
public class Rps implements GameBot{
    public void run() {
        int userChoice;
        int computerChoice;
        int result;
        int numWins = 0;
        int numLosses = 0;
        int numTies = 0;
        String playAgain = "";
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rounds = 0;
        do {
            numWins = 0;
            numLosses = 0;
            numTies = 0;
            do {
                System.out.println("enter the number of rounds");
                rounds = sc.nextInt();
            }while ((rounds <= 0) || (rounds > 10));
            for (int i = 0; i < rounds; i++) {
                sc.nextLine();
                System.out.println("Please enter one of the following:");
                System.out.println("1: Rock\t2:Paper\t3:Scissors");
                userChoice = sc.nextInt();
                computerChoice = 1 + r.nextInt(3);
                System.out.println("I chose " + computerChoice);
                
                result = rules(userChoice,computerChoice);
                
                switch(result) {
                    case 0: numTies++;
                            System.out.println("Tie!");
                            break;
                    case 1: numWins++;
                            System.out.println("You win...");
                            break;
                    case -1:numLosses++;
                            System.out.println("I win!");
                            break;
                    default:;
                }
                /*if (userChoice == computerChoice) {
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
                }*/
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
    
    public static int rules(int player, int computer) {
        // array containing rules.
        // row: computer, column: player
        // 1: player wins, 0: tie, -1:computer wins
        int[][] rules = {{0,1,-1},
                       {-1,0,1},
                       {1,-1,0}};  
    
        return rules[computer-1][player-1];
    }

    @Override
    public String name() {
        return "Rock Paper Scissors";
    }

}
