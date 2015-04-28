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
public class Unlucky1 {
//    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 
//
//Unlucky1({1, 3, 4, 5}) -> true
//Unlucky1({2, 1, 3, 4, 5}) -> true
//Unlucky1({1, 1, 1}) -> false

    public static boolean Unlucky1(int[] numbers) {
        if (numbers[0] == 1 && numbers[1] == 3) {
            return true;
        }
        if (numbers[1] == 1 && numbers[2] == 3) {
            return true;
        }
        if (numbers[numbers.length - 2] == 1 && numbers[numbers.length-1] == 3) {
            return true;
        }
        if (numbers[numbers.length - 3] == 1 && numbers[numbers.length-2] == 3) {
            return true;
        }
        return false;

    }
}
