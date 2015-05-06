/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasicsskillcheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WhatIsYourNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        
        System.out.println("enter number");
        userInput = sc.nextInt();
        
        for(int i = 0; i<= userInput; i++){
            System.out.println(i);
        }
        System.out.println("Thanks for playing");
    }
    
    
    
    
}
