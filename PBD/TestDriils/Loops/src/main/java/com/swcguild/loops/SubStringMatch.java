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
public class SubStringMatch {
//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings. 
//
//SubStringMatch("xxcaazz", "xxbaaz") -> 3
//SubStringMatch("abc", "abc") -> 2
//SubStringMatch("abc", "axc") -> 0

public static int SubStringMatch(String a, String b) {
    int num = 0;
    int length =a.length()-1;
    if(a.length()>b.length()){
        length = b.length()-1;
    }
    
    for(int i=0; i< length; i++){
        if(Character.toString(a.charAt(i)).equals(Character.toString(b.charAt(i)))){
            if(Character.toString(a.charAt(i+1)).equals(Character.toString(b.charAt(i+1)))){
              num++;
        }
        }
    }
    return num;
}
    
}
