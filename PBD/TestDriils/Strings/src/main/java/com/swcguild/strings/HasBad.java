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
public class HasBad {
//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
//
//HasBad("badxx") -> true
//HasBad("xbadxx") -> true
//HasBad("xxbadxx") -> false

public static boolean HasBad(String str) {
    StringBuilder sb = new StringBuilder();
    try{
         sb.append(str.substring(0, 4));
        return sb.indexOf("bad") != -1;
    }catch(Exception e){
        return false;
    }
   

}
    
}
