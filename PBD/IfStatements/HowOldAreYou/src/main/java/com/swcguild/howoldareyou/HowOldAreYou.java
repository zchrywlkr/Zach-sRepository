/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.howoldareyou;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Hey whats your name: ");
        name = sc.nextLine();
        
        System.out.print("\nOk " + name + " how old are you: ");
        age = sc.nextInt();
        
        if(age<16){
            System.out.print("\nYou cant drive yet");
        }
        if(age<18){
            System.out.print("\nYou cant vote yet");
        }
        if(age<25){
            System.out.print("\nYou cant rent a car");
        }
        if(age >= 25 ){
            System.out.print("\nYou can do anthing thats legal");
        }
        
    }
    
}
