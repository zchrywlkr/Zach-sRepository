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
public class IcyHot {
//    Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
//
//IcyHot(120, -1) -> true
//IcyHot(-1, 120) -> true
//IcyHot(2, 120) -> false

public static boolean IcyHot(int temp1, int temp2) {
    if((temp1<0 && temp2>100)|| (temp1>100 && temp2<0)){
        return true;
    }else{
        return false;
    }

}
    
}
