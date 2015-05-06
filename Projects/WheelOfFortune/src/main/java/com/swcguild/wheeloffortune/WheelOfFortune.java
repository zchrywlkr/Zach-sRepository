/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.wheeloffortune;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WheelOfFortune {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String phrase = getPhrase();
        String phraseArray[] = new String[phrase.length()];
        int correctLetters = 0;
        int finishedPhrase = 0;
        int player = 0;
        String guess = "";
        String vowels[] = {"a","e","i","o","u"};
        double money[] = {0,0,0};
        String wrongLetter = "";
                        
        finishedPhrase=(phrase.length())-getNumberOfSpaces(phrase);
        phraseArray = setArray(phrase);
        printPhrase(phraseArray);
        
        do {
            System.out.println("player " + (player+1) +"'s turn:");
            System.out.println("you have $"+ money[player]);
            System.out.println("Hit enter to spin the wheel");
            
            sc.nextLine();
            result = spin();
            System.out.println("you got a " + result*100);

            System.out.println("Enter letter(1) or buy vowel(2) or guess phrase(3) \"" + vowels[0]+vowels[1]+vowels[2]+vowels[3]+vowels[4]+"\"");
            guess = sc.nextLine();
            
            switch(guess){
                case "1": 
                    
            }
            
            if(checkCorrect(phrase,guess)!= 0){
                System.out.print("Correct");
                correctLetters += checkCorrect(phrase,guess);
                phraseArray = makeGuess(phrase, phraseArray,guess);
                
                money[player] += result*100;
                System.out.println("new total is: $" + money[player]);
                sc.nextLine();
            }else{
                
                player = (player+1)%3;
            }
            printPhrase(phraseArray);
            
            
        } while (correctLetters < finishedPhrase); 
    }
    public static int spin() throws InterruptedException {
        Random r = new Random();
        int spin = 10 + r.nextInt(30);
        int wheel[] = new int[10];
        int result = 0;
        for (int i = 0; i < 10; i++) {
            wheel[i] = i;
        }
        for (int i = 10; i < spin; i++) {
            result = wheel[i % 10];
            Thread.sleep(300);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("              " + wheel[i % 10] + "               ");
            System.out.println("            " + wheel[(i + 9) % 10] + " | " + wheel[(i + 1) % 10] + "                    ");
            System.out.println("          " + wheel[(i + 8) % 10] + "   |   " + wheel[(i + 2) % 10] + "                    ");
            System.out.println("          " + wheel[(i + 7) % 10] + "       " + wheel[(i + 3) % 10] + "                    ");
            System.out.println("            " + wheel[(i + 6) % 10] + "   " + wheel[(i + 4) % 10] + "                    ");
            System.out.println("              " + wheel[(i + 5) % 10] + "               ");
        }
        return (result);
    }
    public static String getPhrase() {
        Random r = new Random();
        switch (1 + r.nextInt(11)) {
//            case 1:
//                return "oliver twist by charles dickens";
//
//            case 2:
//                return "green eggs and ham by dr seuss";
//
//            case 3:
//                return "jurassic park by michael crichton";
//
//            case 4:
//                return " la confidential by james ellroy";
//
//            case 5:
//                return "les miserable by victor hugo moby dick by herman melville";
//
//            case 6:
//                return "the catcher in the rye by jd salinger";
//
//            case 7:
//                return "the davinci code by dan brown";
//
//            case 8:
//                return "the odyssey by homer";
//
//            case 9:
//                return "safe haven by nicholas sparks";
//            case 10:
//                return "how The grinch stole christmas by dr seuss";
            default: return "hi";
        }
    }
    public static String[]setArray(String phrase){
        String phraseArray[] = new String[phrase.length()];
        for(int i = 0; i< phrase.length(); i++){
            if(!Character.toString(phrase.charAt(i)).equals(" ")){
                phraseArray[i] = "_";
            }else{
                phraseArray[i] = " ";
            }
        }
        return phraseArray;
    }
    public static void printPhrase(String[] phraseArray){
            System.out.println();
        for(String letter: phraseArray){
            System.out.print(letter+ " ");
    }
        System.out.println();
    }
    public static String[] makeGuess(String phrase, String[] phraseArray, String guess){
        
        for(int i = 0; i < phrase.length(); i ++){
            if(Character.toString(phrase.charAt(i)).equals(guess)){
               phraseArray[i] = guess;
            }
        }
        return phraseArray;
    }
    public static int checkCorrect(String phrase, String guess) {
        int correctLetters = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.toString(phrase.charAt(i)).equals(guess)) {
                correctLetters++;
            }
        }
        return correctLetters;
    }
    public static int getNumberOfSpaces(String phrase){
        int spaces = 0;
        for(int i = 0; i < phrase.length();i++){
            if(Character.toString(phrase.charAt(i)).equals(" ")){
               spaces++;
            }
        }
        return spaces;
    }
}