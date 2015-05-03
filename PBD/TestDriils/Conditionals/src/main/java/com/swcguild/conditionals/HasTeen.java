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
public class HasTeen {
//    We'll say that a number is "teen" if it is in the range 13..19 
//    inclusive. Given 3 int values, return true if 1 or more of them are teen. 
//
//HasTeen(13, 20, 10) -> true
//HasTeen(20, 19, 10) -> true
//HasTeen(20, 10, 12) -> false

public static boolean HasTeen(int a, int b, int c) {
    if((a>12&&a<20) ||(b>12&&b<20)||(c>12&&c<20) ){
        return true;
    }else{
        return false;
    }

}
}
