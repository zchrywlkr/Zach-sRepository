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
public class HasEven {
//    Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 
//
//HasEven({2, 5}) -> true
//HasEven({4, 3}) -> true
//HasEven({7, 5}) -> false

    public static boolean HasEven(int[] numbers) {

        for (int number : numbers) {
            if(number%2 == 0){
                return true;
            }
        }
        return false;
    }

}
