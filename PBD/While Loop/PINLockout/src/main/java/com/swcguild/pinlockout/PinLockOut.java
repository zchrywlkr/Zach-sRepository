/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.pinlockout;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PinLockOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 12345;
        int tries = 0 ;
        int maxTries = 4;
        
        System.out.println("Welcome to the bank");
        System.out.print("Enter your pin: ");
        int entry = sc.nextInt();
        tries++;
        
        while(entry != pin && tries < maxTries){
            System.out.println("\nINCORRECT PIN. TRY AGAIN");
            System.out.print("enter your pin:");
            entry = sc.nextInt();
            tries++;
        }
        
        if(entry == pin){
            System.out.println("\n pin accepted you now have access");
        }else if (tries >=maxTries){
            System.out.println("You have  run out of tries. Account locked");
        }
        
    }
    
}
