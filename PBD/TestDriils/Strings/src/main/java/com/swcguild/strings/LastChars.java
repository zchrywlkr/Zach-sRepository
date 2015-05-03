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
public class LastChars {
//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char. 
//
//LastChars("last", "chars") -> "ls"
//LastChars("yo", "mama") -> "ya"
//LastChars("hi", "") -> "h@"

public static String LastChars(String a, String b) {
    StringBuilder sb = new StringBuilder();
    if(a.equals("")){
        a ="@";
    }
    if(b.equals("")){
        b = "@";
    }
    sb.append(a.charAt(0));
    sb.append(b.charAt(b.length()-1));
    return sb.toString();
}
    
}
