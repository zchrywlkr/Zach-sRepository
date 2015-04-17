/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addingvaluesloop;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0;
        int sum=0;
        System.out.println("I will add up all the numbers");
        for(int i = 0; i < 5; i++){
            System.out.print("Number: ");
            number = sc.nextInt();
            sum += number;
            System.out.println("the total so far is "+ sum);
        }
    }
    
}
