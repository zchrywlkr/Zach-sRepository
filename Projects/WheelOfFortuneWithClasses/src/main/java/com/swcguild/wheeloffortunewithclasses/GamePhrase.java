
package com.swcguild.wheeloffortunewithclasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GamePhrase {

    private String phrase = "";
    ArrayList<Phrase> phrases = new ArrayList<>();
    int numberCorrect = 0;
    int numberOfLetters;
    private final String DELIMITER ="::";
    private String category = "";

    public String getCategory() {
        return category;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public GamePhrase() throws FileNotFoundException {
        
        readFile();
        Random r = new Random();
        phrase = phrases.get(1 + r.nextInt(59)).getPhrase();
        category = phrases.get(1 + r.nextInt(59)).getCategory();
        
        
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
        
        if(guess.equalsIgnoreCase(phrase)){
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
    
    public void readFile() throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader (new FileReader("phrase.txt")));
        String[] currentToken;
        String nextLine;
        while(sc.hasNext()){
            nextLine = sc.nextLine();
            currentToken = nextLine.split(DELIMITER);
            Phrase newPhrase = new Phrase(currentToken[0],currentToken[1]);
            phrases.add(newPhrase);
        }
            
    }
    
}
