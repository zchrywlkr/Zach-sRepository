/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.littlequiz;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Quiz {
    public static void main(String[] args) {
        String answer = "";
        int score =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("are you ready to take the quiz?");
        
        System.out.println("What is the capital of alaska");
        System.out.print("\t1.Melbourne\r\t2.Anchorage\r\t3.Juneau\r");
        answer = sc.nextLine();
        if(answer.equals("2")){
            score++;
            System.out.println("Thats right");
        }else{
            System.out.println("Wrong");
        }
        System.out.println("Can you store vaalue cat in an int");
        System.out.println("\t1. Yes\r\t2. no\r");
        answer = sc.nextLine();
        if(answer.equals("2")){
            System.out.println("Right");
            score++;
        }else{
            System.out.println("Wrong");
        }
        System.out.println("what is 2+2");
        System.out.println("\t1. 5\r\t2. 4\r\t3. 3\r");      
        answer = sc.nextLine();
        if(answer.equals("2")){
            System.out.println("Right");
            score++;
        }else{
            System.out.println("wrong");
        }
        System.out.println("your done you got "+ score + " out of 3");
        
    }
    
}
