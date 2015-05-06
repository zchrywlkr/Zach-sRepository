/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.games.wof;

import com.swcguild.games.GameBot;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WheelOfFortune implements GameBot{

    @Override
    public void run() throws FileNotFoundException {
        int money[] = new int[3];
        int player = 0;
        int correct = 0;
        String playOption;
        Scanner sc = new Scanner(System.in);
        GamePhrase phrase = new GamePhrase();
        Board board = new Board(phrase.getPhrase(),phrase.getCategory());
        Wheel wheel = new Wheel();
        boolean repeat = true;

        while (!phrase.checkEnd()) {
            correct = 0;
            System.out.println("player " + (player + 1) + "'s turn");
            System.out.println("In the bank: " + money[player]);
            wheel.spin();
            if (!wheel.isBankrupt() && !wheel.isLoseTurn()) {
                    
                do {
                    repeat = false;
                    board.printPhrase();
                    System.out.println("Buy a vowel (1) \tguess a letter(2) \tguess phrase (3)");
                    playOption = sc.nextLine();

                    if (playOption.equals("1")) {
                        if(money[player] < 250 && !wheel.isFreePlay()){
                            System.out.println("you dont have the money try another option");
                            repeat = true;
                        }else{
                            correct = board.makeVowelGuess(phrase.getPhrase());
                            if(!wheel.isFreePlay()){
                                money[player] -= 250;
                            }
                        }
                        
                    } else if (playOption.equals("2")) {
                        correct = board.makeGuess(phrase.getPhrase());
                        if(correct == -1){  //returned if a vowel is guessed
                            System.out.println("try buying a vowel");
                            repeat = true;
                        }
                    } else if (playOption.equals("3")) {
                        if (phrase.guessPhrase()) {
                            break;
                        }else if(!wheel.isFreePlay()){
                            System.out.println("you lose your money");
                            money[player] = 0;
                        }
                    }else{
                        System.out.println("command not recognized hit enter to continue");
                        sc.nextLine();
                        repeat = true;
                    }
                } while (repeat);

                if (correct != 0) {
                    money[player] += correct * wheel.getWinnings();
                    System.out.println("player " + (player + 1) + " now has $" + money[player]);
                    phrase.addCorrect(correct);
                } else {
                    player = (player + 1) % 3;
                }
            } else if (wheel.isBankrupt()) {
                money[player] = 0;
                player = (player + 1) % 3;
            } else {
                player = (player + 1) % 3;
            }
        }
        System.out.println("player " + (player + 1) + " has won with $" + money[player]);
    }

    @Override
    public String name() {
        return "Wheel of Fortune";
    }
    

    }

