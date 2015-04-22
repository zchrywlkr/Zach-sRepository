
package com.swcguild.wheeloffortunewithclasses;

import java.util.Random;
import java.util.Scanner;


public class Phrase {

    private String phrase = "";
    
    int numberCorrect =0;
    int numberOfLetters;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public Phrase() {
        Random r = new Random();
        switch (1 + r.nextInt(11)) {
            case 1:
                phrase = "oliver twist by charles dickens";
                break;

            case 2:
                phrase = "green eggs and ham by dr seuss";
                break;
            case 3:
                phrase = "jurassic park by michael crichton";
                break;
            case 4:
                phrase = " la confidential by james ellroy";
                break;
            case 5:
                phrase = "les miserable by victor hugo moby dick by herman melville";
                break;
            case 6:
                phrase = "the catcher in the rye by jd salinger";
                break;
            case 7:
                phrase = "the davinci code by dan brown";
                break;
            case 8:
                phrase = "the odyssey by homer";
                break;
            case 9:
                phrase = "safe haven by nicholas sparks";
                break;
            case 10:
                phrase = "how The grinch stole christmas by dr seuss";
                break;
            default:
                phrase = "hi";
                break;
        }
        
        numberOfLetters = phrase.length() - getNumberOfSpaces(phrase);

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
    public boolean checkEnd(){
        return (numberCorrect ==numberOfLetters );
    }
    public void addCorrect(int number){
        numberCorrect += number;
    }
    public boolean guessPhrase(){
        Scanner sc = new Scanner(System.in);
        boolean right;
        System.out.println("enter the phrase");
        String guess = sc.nextLine();
        
        if(guess.equals(phrase)){
            System.out.println("Correct");
            right = true;
        }else{
            System.out.println("Wrong");
            right = false;
        }
        System.out.println("Hit enter");
        sc.nextLine();
        return right;
    }
    
}
