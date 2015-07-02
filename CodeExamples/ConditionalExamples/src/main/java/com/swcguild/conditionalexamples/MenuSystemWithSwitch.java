
package com.swcguild.conditionalexamples;

import java.util.Scanner;

/**
 *
 * @author warde
 */
public class MenuSystemWithSwitch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice = "";
        
        System.out.println("===============================");
        System.out.println("O: Open File");
        System.out.println("S: Save File");
        System.out.println("N: New File");
        System.out.println("X: Exit");
        System.out.println("===============================");
        
        System.out.println("Please choose one of the above options.");
        
        userChoice = sc.nextLine();

        switch (userChoice) {
            case "O":
            case "o":
                System.out.println("Opening File...");
                break;
            case "S":
                System.out.println("Saving File...");
                break;
            case "N":
                System.out.println("Creating New File...");
                break;
            case "X":
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

}
