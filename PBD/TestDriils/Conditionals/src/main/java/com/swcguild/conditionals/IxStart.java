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
public class IxStart {
//    
//    Return true if the given string begins with "*ix", the '*' can be anything, so "pix", "9ix" .. all count. 
//
//IxStart("mix snacks") -> true
//IxStart("pix snacks") -> true
//IxStart("piz snacks") -> false

public static boolean IxStart(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.substring(1, 3));
    if(sb.toString().equals("ix")){
        return true;
    }else{
        return false;
    }
}
}
