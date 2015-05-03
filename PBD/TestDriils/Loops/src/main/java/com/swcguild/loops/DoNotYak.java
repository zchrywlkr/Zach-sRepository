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
public class DoNotYak {
//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap. 
//
//DoNotYak("yakpak") -> "pak"
//DoNotYak("pakyak") -> "pak"
//DoNotYak("yak123ya") -> "123ya"

public static String DoNotYak(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    for(int i =0; i< str.length()-2; i++){
        if(Character.toString(str.charAt(i)).equals("y")){
            if(Character.toString(str.charAt(i+2)).equals("k")){
                sb.delete(i, i+3);
            }
        }
    }
    return sb.toString();
}

}
