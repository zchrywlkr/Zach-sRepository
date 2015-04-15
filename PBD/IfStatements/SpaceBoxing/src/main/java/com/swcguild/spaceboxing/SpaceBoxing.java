/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.spaceboxing;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planet ="";
        String weightString ="";
        double weight = 0;
        System.out.print("Please enter current earth weight: ");
        weightString = sc.nextLine();
        System.out.println("\rI have information for the following:");
        System.out.println("1. Venus\t2.Mars\t3.Jupiter\r4.Saturn\t5.Uranus\t6.Neptune");
        System.out.println("what planet are  you visiting");
        planet = sc.nextLine();
        
        weight = Double.parseDouble(weightString);
        
        switch(planet){
            case "1": weight = weight * .78;
                break;
            case "2":weight = weight *.39; 
                break;
            case "3": weight = weight *2.65;
                break;
            case "4": weight = weight *1.17;
                break;
            case "5": weight = weight *1.05;
                break;
            case "6": weight = weight *1.23;    
        };
        System.out.println("Your weight will be " + weight + " on that planet");
    }
    
}
