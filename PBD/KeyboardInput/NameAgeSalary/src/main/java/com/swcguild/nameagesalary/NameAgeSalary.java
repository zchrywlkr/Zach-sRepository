/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.nameagesalary;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class NameAgeSalary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String name;
        String age;
        String salary;
        double slry;
        
        System.out.println("Hello what is your name");
        name = sc.nextLine();
        System.out.println("Hi " + name +" how old are you");
        age = sc.nextLine();
        System.out.println("so you are " + age + " how much do you make" );
        salary = sc.nextLine();
        slry = Double.parseDouble(salary);
        System.out.println("you only make $" + slry + "?");
    }
    
}
