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
    String category ="";

    public Board(String phrase,String category) {
         this.category = category;
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
        System.out.println("Category is \""+ category+"\"");
        for (String letter : onTheBoard) {
            System.out.print(letter + " ");
        }
        System.out.print("\rWrong letters:" + wrongLetters);
        System.out.println();
    }
    
    public int makeGuess(String phrase){
        
        int correct = 0;
        String guess = "";
        Scanner sc = new Scanner(System.in);
        
            System.out.println("enter letter");
            guess = sc.nextLine();
            
         if (guess.equalsIgnoreCase("a")||guess.equalsIgnoreCase("e")||guess.equalsIgnoreCase("i")||guess.equalsIgnoreCase("o")||guess.equalsIgnoreCase("u")){
             return -1;
         }

        for(int i = 0; i < phrase.length(); i ++){
            if(Character.toString(phrase.charAt(i)).equalsIgnoreCase(guess)){
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
            
        } while (!guess.equalsIgnoreCase("a")&&!guess.equalsIgnoreCase("e")&&!guess.equalsIgnoreCase("i")&&!guess.equalsIgnoreCase("o")&&guess.equalsIgnoreCase("u"));

        for(int i = 0; i < phrase.length(); i ++){
            if(Character.toString(phrase.charAt(i)).equalsIgnoreCase(guess)){
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
