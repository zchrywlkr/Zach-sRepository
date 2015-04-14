/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.askingquestions;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AskingQuestions {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String age;
       
        String height;
        String weight;
        
        
        System.out.println("How old are you");
        age = sc.nextLine();
        
        System.out.println("how tall are you");
        height = sc.nextLine();
        
        System.out.println("how much do you weight");
        weight = sc.nextLine();
        
        System.out.println("you are " + age + " old " + height + " tall and " + weight + " heavy");
    }    
    
}
