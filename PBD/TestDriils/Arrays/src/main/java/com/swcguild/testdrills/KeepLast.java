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
public class KeepLast {
//    Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's. 
//
//KeepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
//KeepLast({1, 2}) -> {0, 0, 0, 2}
//KeepLast({3}) -> {0, 3}

public static int[] KeepLast(int[] numbers) {
    
    int nums[] = new  int[numbers.length*2];
    for(int i =0; i < nums.length; i++){
        nums[i]=0;
    }
    nums[nums.length-1]= numbers[numbers.length-1];
    return nums;
}
    
}
