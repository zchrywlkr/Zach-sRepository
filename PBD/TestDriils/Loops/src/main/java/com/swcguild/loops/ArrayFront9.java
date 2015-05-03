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
public class ArrayFront9 {
//    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4. 
//
//ArrayFront9({1, 2, 9, 3, 4}) -> true
//ArrayFront9({1, 2, 3, 4, 9}) -> false
//ArrayFront9({1, 2, 3, 4, 5}) -> false

public static boolean ArrayFront9(int[] numbers) {
    
    for(int i=0;i <numbers.length;i++){
        if(i<4&&numbers[i]==9){
            return true;
        }
    }
    return false;
}
    
}
