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
public class FrontTimes {
//    
//Given a string and a non-negative int n, we'll say that the 
//front of the string is the first 3 chars, or whatever is 
//there if the string is less than length 3. Return n copies of the front; 
//
//FrontTimes("Chocolate", 2) -> "ChoCho"
//FrontTimes("Chocolate", 3) -> "ChoChoCho"
//FrontTimes("Abc", 3) -> "AbcAbcAbc"

    public static String FrontTimes(String str, int n) {
        String first3 = "";
        String returnString = "";
        if (str.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                first3 += str.charAt(i);
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                first3 += str.charAt(i);
            }
        }
        
        for(int i = 0; i < n; i++){
            returnString += first3;
        }
        return returnString;
    }
}