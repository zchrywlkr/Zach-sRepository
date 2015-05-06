/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dicedoubles;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Dice {
    public static void main(String[] args) {
        Random r= new Random();
        int dice1 = 0;
        int dice2=0;
        do {
            dice1 = 1+r.nextInt(5);
            dice2 = 1+r.nextInt(5);
            System.out.println("Roll #1: "+ dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("total is " + (dice1+dice2));
        } while (dice1 != dice2);
        
    }
    
}
