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
public class MultipleEnding {
//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2. 
//
//MultipleEndings("Hello") -> "lololo"
//MultipleEndings("ab") -> "ababab"
//MultipleEndings("Hi") -> "HiHiHi"

public static String MultipleEndings(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.substring(str.length()-2));
    sb.append(str.substring(str.length()-2));
    sb.append(str.substring(str.length()-2));
    return sb.toString();
}
}
