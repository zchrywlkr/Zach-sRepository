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
public class SwapLast {
//    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign". 
//
//SwapLast("coding") -> "codign"
//SwapLast("cat") -> "cta"
//SwapLast("ab") -> "ba"

public static String SwapLast(String str) {
    StringBuilder sb = new StringBuilder();
    if(str.length()==2){
        sb.append(str.charAt(1));
        sb.append(str.charAt(0));
    }else{
         sb.append(str.substring(0, str.length()-2));
    sb.append(str.charAt(str.length()-1));
    sb.append(str.charAt(str.length()-2));
    
    }
   
    return sb.toString();
}
}
