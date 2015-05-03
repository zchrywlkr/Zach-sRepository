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
public class RotateLeft2 {
//    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. 
//
//Rotateleft2("Hello") -> "lloHe"
//Rotateleft2("java") -> "vaja"
//Rotateleft2("Hi") -> "Hi"

public static String Rotateleft2(String str) {
    try{
       StringBuilder sb =new StringBuilder();
    sb.append(str.substring(2, str.length()));
    sb.append(str.substring(0, 2)); 
    return sb.toString();
    }catch(Exception e){
        return str;
    }
    

}
    
}
