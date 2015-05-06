/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hilolimited;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HiLo {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = 1+ r.nextInt(99);
        int guess = 0;
        int counter = 1;
        System.out.println("Im thinking of a number between 1 and 100 you have 7 guesses");  
        while (guess != number && counter <=7){
            System.out.print("Guess number " + counter + ": ");
            guess = sc.nextInt();
            if(guess > number){
                System.out.println("too high");
            }else if (guess < number){
                System.out.println("Guess is too low");
            }else if(guess == number){
                System.out.println("Correct you win");
                break;
            }
        counter++;
        }
        
        
        if(counter == 8){
            System.out.println("you lose");
        }
    }
    
}
