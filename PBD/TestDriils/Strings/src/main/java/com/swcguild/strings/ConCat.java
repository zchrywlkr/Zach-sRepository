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
public class ConCat {
//    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". 
//
//ConCat("abc", "cat") -> "abcat"
//ConCat("dog", "cat") -> "dogcat"
//ConCat("abc", "") -> "abc"

public static String ConCat(String a, String b) {
    StringBuilder sb = new StringBuilder();
    if(!a.equals("")&&!b.equals("")){
       if(Character.toString(a.charAt(a.length()-1)).equals(Character.toString(b.charAt(0)))){
        sb.append(a.substring(0, a.length()-1));
        sb.append(b);
    }else{
        sb.append(a);
        sb.append(b);
       }
    }else{
        sb.append(a);
        sb.append(b);
        
    }
    return sb.toString();
}
    
}
