/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.twomorequestions;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MoreQuestions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alive = "";
        String outside = "";
        System.out.println("does it belong inside or outside or both");
        alive = sc.nextLine();
        System.out.println("is it alive");
        outside = sc.nextLine();
        
        if(alive.equals("inside")&& outside.equals("alive")){
            System.out.println("is it a houseplant");
        }
        if(alive.equals("inside")&& outside.equals("not alive")){
            System.out.println("is it a shower curtain");
        }
        if(alive.equals("outside")&& outside.equals("alive")){
            System.out.println("is it a bison");
        }
        if(alive.equals("outside")&& outside.equals("not alive")){
            System.out.println("is it a billboard");
        }
        if(alive.equals("both")&& outside.equals("alive")){
            System.out.println("is it a dog");
        }
        if(alive.equals("both")&& outside.equals("not alive")){
            System.out.println("is it a cell phone");
        }
    }
    
}
