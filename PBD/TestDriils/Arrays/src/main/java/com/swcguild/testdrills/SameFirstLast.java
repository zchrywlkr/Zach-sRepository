//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. 
//
//SameFirstLast({1, 2, 3}) -> false
//SameFirstLast({1, 2, 3, 1}) -> true
//SameFirstLast({1, 2, 1}) -> true
 
package com.swcguild.testdrills;

/**
 *
 * @author apprentice
 */
public class SameFirstLast {
    public static boolean Same(int[] numbers){
        if(numbers[0] == numbers[numbers.length-1]){
            return true;
        }else{
            return false;
        }
    }
    
}
