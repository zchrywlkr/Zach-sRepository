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
public class MenuSystemWithIf {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String userChoice = "";
        
        System.out.println("O:open file");   
        System.out.println("S: save file");
        System.out.println("N: new file");
        System.out.println("X: exit");
            
        System.out.println("please choose one of above options");
        userChoice = sc.nextLine();
        
        if (userChoice.equals("O")){
            System.out.println("opening file");                    
        }else if(userChoice.equals("S")){
            System.out.println("Saveing file");
        }else if(userChoice.equals("N")){
            System.out.println("creating new file");
        }else if(userChoice.equals("X")){
            System.out.println("exit");
        }else{
            System.out.println("invalid choice");
        }
        
    }
    
}
