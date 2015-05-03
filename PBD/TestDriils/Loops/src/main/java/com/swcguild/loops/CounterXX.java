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
public class CounterXX {

//    Count the number of "xx" in the given string. 
//    We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
//
//CountXX("abcxx") -> 1
//CountXX("xxx") -> 2
//CountXX("xxxx") -> 3
    public static int CountXX(String str) {
        int number = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (Character.toString(str.charAt(i)).equals("x") && Character.toString(str.charAt(i + 1)).equals("x")) {
                number++;
            }
        }
        return number;
    }
}
