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
public class Fix23 {
//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array. 
//
//Fix23({1, 2, 3}) ->{1, 2, 0}
//Fix23({2, 3, 5}) -> {2, 0, 5}
//Fix23({1, 2, 1}) -> {1, 2, 1}

    public static int[] Fix23(int[] numbers) {
        
        for(int i = 0; i< 2; i++){
            if(numbers[i] == 2 && numbers[i+1]==3){
                numbers[i+1]= 0;
            }
        }
        return numbers;
    }

}
