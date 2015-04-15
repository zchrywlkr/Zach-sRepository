/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.howoldareyouspecifically;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = 0;
        String name = "";
        System.out.println("Whats your name");
        name = sc.nextLine();
        System.out.println("ok "+name+" whats your age");
        age = sc.nextInt();
        if(age<16){
            System.out.println("you cant drive");
        }else if((age>=16) && (age<18)){
            System.out.println("you can drive and not vote");
        }else if((age>17) && (age <25)){
            System.out.println("you can vot but not rent a car");
        }else if(age>=25){
            System.out.println("You can do prety much anything");
        }
        
    }
    
      
}
