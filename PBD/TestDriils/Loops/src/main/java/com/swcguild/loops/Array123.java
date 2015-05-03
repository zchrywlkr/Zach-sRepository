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
public class Array123 {
//    Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 
//
//Array123({1, 1, 2, 3, 1}) -> true
//Array123({1, 1, 2, 4, 1}) -> false
//Array123({1, 1, 2, 1, 2, 3}) -> true

public static boolean Array123(int[] numbers) {
    boolean one = false;
    boolean two = false;
    boolean three = false;
    
    for(int num: numbers){
        if(num ==1){
            one = true;
        }else if(num==2){
            two = true;
        }else if(num==3){
            three = true;
        }
    }
    return (one&&two&&three);
}
}
