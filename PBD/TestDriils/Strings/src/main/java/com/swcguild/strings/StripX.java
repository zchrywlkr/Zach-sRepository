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
public class StripX {
//    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
//
//StripX("xHix") -> "Hi"
//StripX("xHi") -> "Hi"
//StripX("Hxix") -> "Hxi"

    public static String StripX(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        
            if(Character.toString(sb.charAt(0)).equals("x")){
                sb.deleteCharAt(0);
            }
            if(Character.toString(sb.charAt(sb.length()-1)).equals("x")){
                sb.deleteCharAt(sb.length()-1);
            }
        return sb.toString();
    }

}
