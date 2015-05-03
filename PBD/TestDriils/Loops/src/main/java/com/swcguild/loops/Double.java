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
public class Double {
//    Given a string, return true if the first instance of "x" in 
//    the string is immediately followed by another "x". 
//
//DoubleX("axxbb") -> true
//DoubleX("axaxxax") -> false
//DoubleX("xxxxx") -> true

    public static boolean DoubleX(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals("x") && Character.toString(str.charAt(i + 1)).equals("x")) {
                return true;
            }else if(Character.toString(str.charAt(i)).equals("x") && !Character.toString(str.charAt(i + 1)).equals("x")){
                return false;
            }
        }
        return false;
    }

}
