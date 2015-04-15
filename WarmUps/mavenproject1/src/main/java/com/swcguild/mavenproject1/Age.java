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
public class Age {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String age = null;
        int ageint = 0;
        boolean repeat = true;

        System.out.println("What is your name? ");
        name = keyboard.next();

        while (repeat) {
            System.out.println("What is your age?");
            age = keyboard.next();
            try {
                ageint = Integer.parseInt(age);
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } 
        }

        if (ageint <= 18) {
            System.out.println("Hey you should be in school!");
        } else if (ageint < 65) {
            System.out.println("Time to go to work!");

        } else {
            System.out.println("Enjoy retirement!");
        }
    }

}
