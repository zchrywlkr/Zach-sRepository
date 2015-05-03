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
public class LongInMiddle {
//    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). 
//
//LongInMiddle("Hello", "hi") -> "hiHellohi"
//LongInMiddle("hi", "Hello") -> "hiHellohi"
//LongInMiddle("aaa", "b") -> "baaab"

public static String LongInMiddle(String a, String b) {
    StringBuilder sb = new StringBuilder();
    if(a.length()>b.length()){
        sb.append(b+a+b);
    }else{
        sb.append(a+b+a);
    }
    return sb.toString();
}
    
}
