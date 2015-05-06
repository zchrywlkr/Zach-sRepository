/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.numberguessingcounter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GuessCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = 1+r.nextInt(9);
        int guess = 0;
        int count = 0;
        do {
            System.out.println("choose a number between 1 & 10");
            System.out.print("your guess: ");
            guess = sc.nextInt();
            count ++;
                        
        } while (guess != number);
            
        System.out.println("Correct!");
        System.out.println("it only took you " + count + " tries");
       
        
        
        
    }
    
}
