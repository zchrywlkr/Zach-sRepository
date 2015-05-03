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
public class LastDigit {
//    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. 
//
//LastDigit(23, 19, 13) → true
//LastDigit(23, 19, 12) → false
//LastDigit(23, 19, 3) → true

public static boolean LastDigit(int a, int b, int c){
    return((a%10==b%10|| a%10==c%10 || b%10==c%10));
    

}
}
