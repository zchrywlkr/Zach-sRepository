/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

/**
 *
 * @author apprentice
 */
public class StringX {
//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed. 
//
//StringX("xxHxix") -> "xHix"
//StringX("abxxxcd") -> "abcd"
//StringX("xabxxxcdx") -> "xabcdx"

public static String StringX(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    for(int i =1; i< sb.length()-1; i++){
        if(Character.toString(sb.charAt(i)).equals("x")){
            sb.deleteCharAt(i);
            i--;
        }
    }
    return sb.toString();
}
}
