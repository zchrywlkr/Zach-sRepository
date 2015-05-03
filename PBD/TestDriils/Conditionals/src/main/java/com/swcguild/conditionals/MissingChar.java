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
public class MissingChar {
//    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (Don't check for bad index). 
//
//MissingChar("kitten", 1) -> "ktten"
//MissingChar("kitten", 0) -> "itten"
//MissingChar("kitten", 4) -> "kittn"

public static String MissingChar(String str, int n) {
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    sb.deleteCharAt(n);
    return sb.toString();
}
    
}
