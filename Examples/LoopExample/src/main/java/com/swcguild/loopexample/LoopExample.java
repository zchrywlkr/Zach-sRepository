/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loopexample;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team;
        int userNumber = 0;
        do {
            System.out.println("What is your favorite team");
            team = sc.nextLine();
            
        } while (!team.equals("Ravens"));
        
        System.out.println("please enter a number");
        userNumber = sc.nextInt();
        while((userNumber < 10)&&(userNumber >= 0)){
            System.out.println(--userNumber);
            
        }
    }
    
}
