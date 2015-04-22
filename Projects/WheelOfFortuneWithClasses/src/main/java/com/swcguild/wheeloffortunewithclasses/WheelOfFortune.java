/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.wheeloffortunewithclasses;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WheelOfFortune {

    public static void play() {
        int money[] = new int[3];
        int player = 0;
        int correct = 0;
        String playOption;
        Scanner sc = new Scanner(System.in);
        Phrase phrase = new Phrase();
        Board board = new Board(phrase.getPhrase());
        Wheel wheel = new Wheel();
        
        
        while (!phrase.checkEnd()) {
            correct = 0;
            System.out.println("player " + (player + 1) + "'s turn");
            wheel.spin();
            if (!wheel.isBankrupt()&& !wheel.isLoseTurn()) {
                board.printPhrase();
                
                
                System.out.println("Buy a vowel (1) \tguess a letter(2) \tguess phrase (3)");
                playOption = sc.nextLine();
                
                if(playOption.equals("1") && money[player]>=250){
                    correct = board.makeVowelGuess(phrase.getPhrase()); 
                    money[player] -=250;
                }
                else if(playOption.equals("2")){
                    correct = board.makeGuess(phrase.getPhrase()); 
                }
                else{
                    if(phrase.guessPhrase()){
                        break;
                    }
                }
                
                if (correct != 0) {
                    money[player] = correct * wheel.getWinnings();
                    System.out.println("player "+(player+1) + " now has $"+money[player]);
                    phrase.addCorrect(correct);
                }else{
                    player = (player+1) % 3;
                }
            }else if(wheel.isBankrupt()){
                money[player] = 0;
                player = (player+1) % 3;
            }else{
                player = (player+1) % 3;
            }
        }
        System.out.println("player " + (player+1) + " has won with $" + money[player]);
    }
}
