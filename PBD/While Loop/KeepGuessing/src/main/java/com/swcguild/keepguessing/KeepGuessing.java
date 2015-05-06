/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.keepguessing;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class KeepGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int guess = 0;
        int number = 1+r.nextInt(9);
        System.out.println("im thinking of a number between 1 and 10");
        
        while(guess != number ){
            System.out.print("your guess ");
            guess = sc.nextInt();
            
            if(guess == number){
                System.out.println("you are right");
            }
        }
            
        
    }
    
}
