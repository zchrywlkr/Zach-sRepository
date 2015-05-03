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
public class TakeOne {
//    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty. 
//
//TakeOne("Hello", true) -> "H"
//TakeOne("Hello", false) -> "o"
//TakeOne("oh", true) -> "o"

public static String TakeOne(String str, boolean fromFront) {
    StringBuilder sb = new StringBuilder();
    if(fromFront){
        sb.append(str.charAt(0));
    }else{
        sb.append(str.charAt(str.length()-1));
    }
    return sb.toString();

}
}
