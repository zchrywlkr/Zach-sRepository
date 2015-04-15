/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.switchpratice;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MenuWithSwitch {   
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String userInput;
        System.out.println("O:open file");   
        System.out.println("S: save file");
        System.out.println("N: new file");
        System.out.println("X: exit");
            
        System.out.println("please choose one of above options");
        userInput = sc.nextLine();
        
        switch(userInput){
            case "O":
            case "o":
                System.out.println("opening");
                break;
            case "S":
                System.out.println("Saveing");
                break;
            case "N":
                System.out.println("new file");
                break;
            case "X":
                System.out.println("exit");
                break; 
            default:
                System.out.println("invalid choice");
        }
    }
    
}
