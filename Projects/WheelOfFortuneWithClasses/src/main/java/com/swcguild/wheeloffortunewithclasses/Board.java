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
public class Board {
    private String[] onTheBoard;
    String vowels[] = {"a","e","i","o","u"};
    String wrongLetters = "";

    public Board(String phrase) {
        String onTheBoard[] = new String[phrase.length()];
        
        for (int i = 0; i < phrase.length(); i++) {
            if (!Character.toString(phrase.charAt(i)).equals(" ")) {
                onTheBoard[i] = "_";
            } else {
                onTheBoard[i] = " ";
            }
        }
        this.onTheBoard = onTheBoard;
    }
    public void printPhrase() {
        System.out.println();
        for (String letter : onTheBoard) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
    
    public int makeGuess(String phrase){
        
        int correct = 0;
        String guess = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter letter");
            guess = sc.nextLine();
            
        } while (guess.equals("a")||guess.equals("e")||guess.equals("i")||guess.equals("o")||guess.equals("u"));

        for(int i = 0; i < phrase.length(); i ++){
            if(Character.toString(phrase.charAt(i)).equals(guess)){
               onTheBoard[i] = guess;
               correct++;
            }
        }
        if(correct != 0){
            System.out.println("you got " + correct+ " (hit enter)");
        }else{
            System.out.println("Wrong  (hit enter)");
            wrongLetters += " " + guess;
        }
        sc.nextLine();
        return correct;
    }
    
    public int makeVowelGuess(String phrase){
        int correct = 0;
        String guess = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter vowel");
            guess = sc.nextLine();
            
        } while (!guess.equals("a")&&!guess.equals("e")&&!guess.equals("i")&&!guess.equals("o")&&guess.equals("u"));

        for(int i = 0; i < phrase.length(); i ++){
            if(Character.toString(phrase.charAt(i)).equals(guess)){
               onTheBoard[i] = guess;
               correct++;
            }
        }
        if(correct != 0){
            System.out.println("you got " + correct+ " (hit enter)");
        }else{
            System.out.println("Wrong  (hit enter)");
            wrongLetters += " " + guess;
        }
        sc.nextLine();
        return correct;
    }
    
    
    
}
