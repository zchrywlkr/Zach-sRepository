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
public class FirstHalf {
//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
//
//FirstHalf("WooHoo") -> "Woo"
//FirstHalf("HelloThere") -> "Hello"
//FirstHalf("abcdef") -> "abc"

public static String FirstHalf(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.substring(0, str.length()/2));
    return sb.toString();

}
    
}
