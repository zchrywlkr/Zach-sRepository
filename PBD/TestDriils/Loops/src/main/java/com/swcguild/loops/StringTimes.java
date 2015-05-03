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
public class StringTimes {
    
//    Given a string and a non-negative int n, return a larger string
// that is n copies of the original string. 
//
//StringTimes("Hi", 2) -> "HiHi"
//StringTimes("Hi", 3) -> "HiHiHi"
//StringTimes("Hi", 1) -> "Hi"

public static String StringTimes(String str, int n) {
    String temp = str;
    for(int i = 1; i<n; i++){
        str += temp;
    }
    return str;
    }
}
