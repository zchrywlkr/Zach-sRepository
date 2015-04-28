/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.testdrills;

/**
 *
 * @author apprentice
 */
public class Reverses {
//    Given an array of ints length 3, return a new array with the
//    elements in reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 

    public static int[] Reverse(int[] numbers) {
        int j = 0;
        int newNumbers[] = new int[3];
        for(int i = 2; i >=0; i--,j++){
         newNumbers[j] = numbers[i];

            }

        return newNumbers;
    }

}
