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
public class Front3 {
//    Given a string, we'll say that the 
//    front is the first 3 chars of the string. If the string 
//            length is less than 3, the front is whatever is there. 
//            Return a new string which is 3 copies of the front. 
//
//Front3("Microsoft") -> "MicMicMic"
//Front3("Chocolate") -> "ChoChoCho"
//Front3("at") -> "atatat"

public static String Front3(String str) {
    int length = 3;
    if(str.length() < length){
        length = str.length();
    }
    StringBuilder sb = new StringBuilder();
    
    sb.append(str.substring(0, length));
    sb.append(str.substring(0, length));
    sb.append(str.substring(0, length));
    
    return sb.toString();
}
}
