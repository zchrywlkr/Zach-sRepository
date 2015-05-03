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
public class FrontBack {
//    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n. 
//
//FrontAndBack("Hello", 2) -> "Helo"
//FrontAndBack("Chocolate", 3) -> "Choate"
//FrontAndBack("Chocolate", 1) -> "Ce"

public static String FrontAndBack(String str, int n) {
    StringBuilder sb = new StringBuilder();
    
    sb.append(str.substring(0, n));
    sb.append(str.substring(str.length()-n,str.length()));
    return sb.toString();
}
    
}
