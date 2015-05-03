/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionals;

/**
 *
 * @author apprentice
 */
public class Between10and20 {
//    Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
//
//Between10and20(12, 99) -> true
//Between10and20(21, 12) -> true
//Between10and20(8, 99) -> false

public static boolean Between10and20(int a, int b) {
    if((10<=a && a<=20)||(10<=b && b<=20)){
        return true;
    }else{
        return false;
    }

}
}
