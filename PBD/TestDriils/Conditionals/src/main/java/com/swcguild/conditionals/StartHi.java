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
public class StartHi {
//    Given a string, return true if the string starts with "hi" and false otherwise. 
//
//StartHi("hi there") -> true
//StartHi("hi") -> true
//StartHi("high up") -> false

public static boolean StartHi(String str) {
    StringBuilder sb = new StringBuilder();
    if (str.equals("hi")){
        return true;
    }
    sb.append(str.subSequence(0, 3));
    if(sb.toString().equals("hi ")){
        return true;
    }else{
        return false;
    }
    
    

}
    
}
