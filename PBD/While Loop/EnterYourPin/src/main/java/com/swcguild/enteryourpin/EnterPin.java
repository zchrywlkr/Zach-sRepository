/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.enteryourpin;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class EnterPin {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("Welcome to the bank of Mitchell");
        System.out.println("enter your pin:");
        int entry = sc.nextInt();
        
        while (entry != pin){
            System.out.println("\nINCORRECT PIN! DIE!");
            System.out.println("ENTER YOUR PIN:");
            entry = sc.nextInt();
            
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW ACCESS TO YOUR ACCOUNT");
    }
    
}
