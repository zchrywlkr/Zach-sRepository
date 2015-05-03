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
public class FrontAgain {
//    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited". 
//
//FrontAgain("edited") -> true
//FrontAgain("edit") -> false
//FrontAgain("ed") -> true

public static boolean FrontAgain(String str) {
    StringBuilder first2 = new StringBuilder();
    StringBuilder last2 = new StringBuilder();
    first2.append(str.substring(0, 2));
    last2.append(str.substring(str.length()-2, str.length()));
    return(first2.toString().equals(last2.toString()));
    
}
    
}
