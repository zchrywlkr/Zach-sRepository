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
public class BackAround {
//    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. 
//
//BackAround("cat") -> "tcatt"
//BackAround("Hello") -> "oHelloo"
//BackAround("a") -> "aaa"

public static String BackAround(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(str.length()-1));
    sb.append(str);
    sb.append(str.charAt(str.length()-1));
    return sb.toString();
    
}
}
