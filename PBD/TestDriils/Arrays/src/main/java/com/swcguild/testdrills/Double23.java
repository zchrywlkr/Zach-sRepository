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
public class Double23 {
//    Given an int array, return true if the array contains 2 twice, or 3 twice. 
//
//Double23({2, 2, 3}) -> true
//Double23({3, 4, 5, 3}) -> true
//Double23({2, 3, 2, 2}) -> false

    public static boolean Double23(int[] numbers) {
        int num2 = 0;
        int num3 = 0;
        for (int number : numbers) {
            if (number == 2) {
                num2++;
            } else if (number == 3) {
                num3++;
            }
            
        }
        if (num2 == 2 || num3 == 2) {
                return true;
            }
        return false;

    }

}
