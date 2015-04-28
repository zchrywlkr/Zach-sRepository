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
public class HigherWins {
//    
//    Given an array of ints, figure out which is 
//larger between the first and last elements in the array, 
//and set all the other elements to be that value. Return the changed array. 
//
//HigherWins({1, 2, 3}) -> {3, 3, 3}
//HigherWins({11, 5, 9}) -> {11, 11, 11}
//HigherWins({2, 11, 3}) -> {3, 3, 3}

public static int[] HigherWins(int[] numbers) {
    
    int max = 0;
    int first = numbers[0];
    int last = numbers[numbers.length-1];
        if(first>last){
            max = first;
        }else{
            max = last;
        }        
    for(int i =0; i < numbers.length; i++){
        numbers[i] = max;
    }     
    return numbers;
}
}
