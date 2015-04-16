/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Adventure {
    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Are you going to \"write code\" or \"not");
        userInput = sc.nextLine();
        if(userInput.equals("write code")){
            System.out.println("do you want to keep \"writing\" or \" not \"");
            userInput = sc.nextLine();
            if(userInput.equals("writing")){
                System.out.println("do you want to keep \"writing\" or \" not \"");
                userInput = sc.nextLine();
                if(userInput.equals("writing")){
                    System.out.println("too much coding you die");
                    
            }else{
                    System.out.println("you go outside the sunlight blinds you and you walk into the street and die");
                }
        }
        
    }
    
}
