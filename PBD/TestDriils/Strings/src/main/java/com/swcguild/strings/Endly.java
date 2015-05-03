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
public class Endly {
//    Given a string, return true if it ends in "ly". 
//
//EndsWithLy("oddly") -> true
//EndsWithLy("y") -> false
//EndsWithLy("oddy") -> false

public static boolean EndsWithLy(String str) { 
    StringBuilder sb = new  StringBuilder();
    try{
        sb.append(str.substring(str.length()-2, str.length()));
    }catch(Exception e){
        return false;
    }
    System.out.println(sb);
    if(sb.toString().equals("ly")){
        return true;
    }else{
        return false;
    }
}
    
}
