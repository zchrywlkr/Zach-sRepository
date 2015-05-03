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
public class RemoveDel {
//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged. 
//
//RemoveDel("adelbc") -> "abc"
//RemoveDel("adelHello") -> "aHello"
//RemoveDel("adedbc") -> "adedbc"

    public static String RemoveDel(String str) {
        StringBuilder del = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        del.append(str.subSequence(1, 4));
        if(del.toString().equals("del")){
            sb.append(str.charAt(0));
            sb.append(str.substring(4));
            return sb.toString();
        }else{
            return str;
        }
        
    }
}
