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
       
        String heightFeet;
        String weight;
        
        
        System.out.println("How old are you?");
        age = sc.nextLine();
        
        System.out.println("how many feet tall are you?");
        heightFeet = sc.nextLine();
        
        System.out.println("and how many inches?");
        String heightInches = sc.nextLine();
        
        System.out.println("how much do you weight?");
        weight = sc.nextLine();
        
        System.out.println("you are " + age + " old " + heightFeet +"'" +   heightInches + "'" + " tall and " + weight + " heavy");
    }    
    
}
