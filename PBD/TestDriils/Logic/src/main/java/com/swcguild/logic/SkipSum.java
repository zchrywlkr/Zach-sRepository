/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

/**
 *
 * @author apprentice
 */
public class SkipSum {
    
//    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive are forbidden, so in that case just return 20. 
//
//SkipSum(3, 4) → 7
//SkipSum(9, 4) → 20
//SkipSum(10, 11) → 21

    public static int SkipSum(int a, int b) {
        if(a+b >= 10 && a+b <=19){
            return 20;
        }else{
            return a+b;
        }
    }
}
