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
public class EndUp {
//    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. 
//
//EndUp("Hello") -> "HeLLO"
//EndUp("hi there") -> "hi thERE"
//EndUp("hi") -> "HI"

    public static String EndUp(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length()<4){
            sb.append(str.toUpperCase());
            return sb.toString();
        }else{
            sb.append(str.substring(0, str.length() -3));
            sb.append(str.substring(str.length()-3).toUpperCase());
            return sb.toString();
        }
    }

}
