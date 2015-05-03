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
public class StartOz {
//    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". 
//
//StartOz("ozymandias") -> "oz"
//StartOz("bzoo") -> "z"
//StartOz("oxx") -> "o"

    public static String StartOz(String str) {
        StringBuilder oz = new StringBuilder();
       
        
        if(Character.toString(str.charAt(0)).equals("o")){
            oz.append(str.charAt(0));
        }
        if(Character.toString(str.charAt(1)).equals("z")){
            oz.append(str.charAt(1));
        }
        return oz.toString();
    }
}
