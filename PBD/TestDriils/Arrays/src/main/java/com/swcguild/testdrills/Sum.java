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
public class Sum {
    public static int sums(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length;i++ ){
            sum += numbers[i];
        }
    return sum;    
    }
    
}
