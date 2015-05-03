/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

/**
 *
 * @author apprentice
 */
public class NoTriples {
    
//    Given an array of ints, we'll say that a triple is a value appearing
//    3 times in a row in the array. Return true if the array does not contain any triples. 
//
//NoTriples({1, 1, 2, 2, 1}) -> true
//NoTriples({1, 1, 2, 2, 2, 1}) -> false
//NoTriples({1, 1, 1, 2, 2, 2, 1}) -> false

public static boolean NoTriples(int[] numbers) {
    for(int i = 0 ; i < numbers.length- 3; i ++){
        if(numbers[i] == numbers[i+1] && numbers[i] == numbers[i+2]){
            return false;
        }
    }
    return true;
    }
}
