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
public class Middle2 {
//    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2. 
//
//MiddleTwo("string") -> "ri"
//MiddleTwo("code") -> "od"
//MiddleTwo("Practice") -> "ct"

public static String MiddleTwo(String str ) {
    StringBuilder sb = new StringBuilder();
    int middle = str.length()/2;
    sb.append(str.substring(middle-1, middle+1));
    return sb.toString();
}
    
}
