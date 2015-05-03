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
public class Multiple3or5 {
    
//    Return true if the given non-negative number is 
//    a multiple of 3 or a multiple of 5. Use the % "mod" operator
//
//Multiple3or5(3) -> true
//Multiple3or5(10) -> true
//Multiple3or5(8) -> false

public static boolean Multiple3or5(int number) {
    if(number%3 == 0|| number%5 == 0){
        return true;
    }else{
        return false;
    }

}
}
