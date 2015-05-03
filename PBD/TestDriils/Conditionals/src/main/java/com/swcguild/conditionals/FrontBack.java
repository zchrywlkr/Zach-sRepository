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
public class FrontBack {
//    
//    Given a string, return a new string where the first and last chars have been exchanged. 
//
//FrontBack("code") -> "eodc"
//FrontBack("a") -> "a"
//FrontBack("ab") -> "ba"

    public static String FrontBack(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length()>1){
            sb.lastIndexOf(str);
        sb.append(str.charAt(str.length()-1));
        sb.append(str.substring(1, str.length()-1));
        sb.append(str.charAt(0));
        return sb.toString();
        }else{
            return str;
        }
       
    }
}
