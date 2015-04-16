/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Questions {
    public static void main(String[] args) {
        String object = "";
        String answer1 = "";
        String answer2 = "";
        Scanner sc = new Scanner(System.in);
        String guess = "";
        
        System.out.println("two questions");
        System.out.println("Think of an object and i will trie to guess it");
        object = sc.nextLine();
        System.out.println("is it an animal, vegetable, or mineral");
        answer1 = sc.nextLine();
        System.out.println("Is it bigger then a breadbox");
        answer2= sc.nextLine();
        
        if(answer1.equals("animal")){
            if(answer2.equals("yes")){
                guess = "moose";
            }else{
                guess = "squirrel";
                    }
        }else if(answer1.equals("vegetable")){
            if(answer2.equals("yes")){
                guess = "watermelon";
            }else{
                guess = "carrot";
            }            
        }else{
            if(answer2.equals("yes")){
                guess = "camaro";
            }else{
                guess = "paper clip";
            }
        }
    }
}