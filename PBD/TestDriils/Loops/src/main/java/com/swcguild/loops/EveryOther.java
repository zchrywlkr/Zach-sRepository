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
public class EveryOther {

//    Given a string, return a new string made of every 
//    other char starting with the first, so "Hello" yields "Hlo". 
//
//EveryOther("Hello") -> "Hlo"
//EveryOther("Hi") -> "H"
//EveryOther("Heeololeo") -> "Hello"
    public static String EveryOther(String str) {
        String everyOther="";
        for(int i = 1; i < str.length()+1; i++){
            if(i%2 != 0){
                everyOther+=Character.toString(str.charAt(i-1));
            }
        }
        return everyOther;
    }
}
