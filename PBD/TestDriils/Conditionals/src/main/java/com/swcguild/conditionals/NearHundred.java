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
public class NearHundred {
//    Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the C# Math class for absolute value
//
//NearHundred(103) -> true
//NearHundred(90) -> true
//NearHundred(89) -> false

public static boolean NearHundred(int n) {
    if(Math.abs(100-n)<= 10 || Math.abs(200-n)<= 10){
        return true;
    }else{
        return false;
    }

}
    
}
