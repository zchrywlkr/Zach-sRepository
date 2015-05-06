/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LuckySevens {
    public static void play() {
        Scanner keyboard = new Scanner(System.in);
        
        Random r = new Random();
        int dice1 = 0;
        int dice2 = 0;
        
        int money = 0;
        int moneyMax = 0;
        int numRolls = 0;
        int maxRolls = 0;
        
        
        System.out.println("Enter money to bet");
        money = keyboard.nextInt();
        
        do {
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            
            if((dice1 + dice2) == 7) {
                money += 4;
                if(money > moneyMax) {
                    moneyMax = money;
                    maxRolls = numRolls;
                    //System.out.println("money: " + money + ", rolls: " + numRolls);
                }
            } else {
                money -= 1;
            }
            numRolls++;
            
        } while (money > 0);
        System.out.println("You are broke after " + numRolls + " rolls.");
        System.out.println("You should have quit after " + maxRolls + " when you had $ " + moneyMax + ".");
        
            
    }
}
