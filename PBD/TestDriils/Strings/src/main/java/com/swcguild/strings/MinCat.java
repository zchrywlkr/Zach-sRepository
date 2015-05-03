/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.strings;

/**
 *
 * @author apprentice
 */
public class MinCat {
//    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length. 
//
//MinCat("Hello", "Hi") -> "loHi"
//MinCat("Hello", "java") -> "ellojava"
//MinCat("java", "Hello") -> "javaello"

public static String MinCat(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int length = a.length();
    if(b.length()<a.length()){
        length = b.length();
    }
    sb.append(a.substring(a.length()-length, a.length()));
    sb.append(b.substring(b.length()-length, b.length()));
    return sb.toString();
}
    
}
