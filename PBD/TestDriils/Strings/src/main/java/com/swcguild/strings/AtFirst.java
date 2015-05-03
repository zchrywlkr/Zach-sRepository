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
public class AtFirst {
//    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars. 
//
//AtFirst("hello") -> "he"
//AtFirst("hi") -> "hi"
//AtFirst("h") -> "h@"

public static String AtFirst(String str) {
    StringBuilder sb = new StringBuilder();
    if(str.length() >=2){
        sb.append(str.substring(0, 2));
    }else if(str.length() ==1){
        sb.append(str+"@");
    }else
        sb.append("@@");
    return sb.toString();

}
}
