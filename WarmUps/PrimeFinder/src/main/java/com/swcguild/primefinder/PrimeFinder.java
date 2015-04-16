/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefinder;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PrimeFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean prime = true;
        String run = " ";
        int numPrimes = 0;

        do {

            do {
                System.out.println("enter number");
                number = sc.nextInt();
                sc.nextLine();
            } while (number < 1);

            do {
                for (int i = 2; i < number; i++) {
                    if ((number % i) == 0) {
                        prime = false;
                        break;
                    }

                }
                if (prime) {
                    System.out.println("number is prime " + number);
                    numPrimes++;
                }
                prime = true;
                number--;

            } while (number > 0);
            System.out.println("the number of primes was " + numPrimes);
            System.out.println("Go again\ry\tn");
            run = sc.nextLine();
            numPrimes = 0;

        } while (run.equals("y"));
        System.out.println("Good game!");

    }

}
