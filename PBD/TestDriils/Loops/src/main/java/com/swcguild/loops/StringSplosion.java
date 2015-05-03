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
public class StringSplosion {
//   Given a non-empty string like "Code" return a string like "CCoCodCode".  
//    (first char, first two, first 3, etc)
//
//StringSplosion("Code") -> "CCoCodCode"
//StringSplosion("abc") -> "aababc"
//StringSplosion("ab") -> "aab"

    public static String StringSplosion(String str) {
        String slosion = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = "";
            for (int j = 0; j <= i; j++) {

                temp += Character.toString(str.charAt(j));
            }
            slosion += temp;
        }
        return slosion;
    }
}
