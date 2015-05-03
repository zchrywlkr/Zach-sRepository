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
public class RotateRight2 {
//    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2. 
//
//RotateRight2("Hello") -> "loHel"
//RotateRight2("java") -> "vaja"
//RotateRight2("Hi") -> "Hi"
    public static String Rotate(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(str.length()-2,str.length()));
        sb.append(str.substring(0, str.length()-2));
        return sb.toString();
    }
//    
}
