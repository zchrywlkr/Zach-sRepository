/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.gendergame;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GenderGame {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String name = "";
        String lastName = "";
        String married = "n";
        int age = 0;
        String gender = "";
        
        System.out.print("What is your gender: M  or F  ");
        gender = sc.nextLine();
        System.out.print("enter first name: ");
        name = sc.nextLine();
        System.out.print("enter last name ");
        lastName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        if(age > 19){
                System.out.println("are you married");
                married = sc.nextLine();
        }
        
        if(gender.equals("m") && age>19){
            System.out.println("Mr " + name + " " + lastName);
        }else if(gender.equals("f") && married.equals("y")){
            System.out.println("Mrs " + name + " " + lastName);
        }else if(gender.equals("f")&& age>19){
            System.out.println("Ms. " + name + " " + lastName);
        }else{
            System.out.println(name + " " + lastName);
        }
    }
    
}
