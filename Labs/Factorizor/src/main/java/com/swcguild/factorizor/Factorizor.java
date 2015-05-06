/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.factorizor;

import java.util.Scanner;


public class Factorizor {
    public static void facotrize() {
        int numberUser = 0;
        int perfectTest = 1;
        boolean numberPrime = true;
        int factorCount = 0;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number to be factored: ");
        numberUser = sc.nextInt();
        
        for(int count = 2; count < numberUser; count++)
        {
            if(numberUser%count == 0)
            {
                System.out.println("Factor: " + count);
                perfectTest += count;
                numberPrime = false;
                factorCount++;
            }
        }
        if(numberUser == perfectTest)
        {
            System.out.println(numberUser + " is perfect.");
        } else {
            System.out.println(numberUser + " is not perfect.");
        }
        if(numberPrime)
        {
            System.out.println(numberUser + " is prime.");
        } else {
            System.out.println(numberUser + " is not prime.");
        }
        
        System.out.println("Total number of factors: " + factorCount);
        
    }
}
