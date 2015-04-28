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
public class RotateLeft {
    public static int[] Rotate(int[] numbers){
        int newNumbers[] = new int[numbers.length];
        
        for(int i = 0; i<numbers.length-1;i++){
            newNumbers[i] = numbers[i+1];
            }
        
            newNumbers[numbers.length - 1] = numbers[0];
            
        
        return newNumbers;
    }
    
}
