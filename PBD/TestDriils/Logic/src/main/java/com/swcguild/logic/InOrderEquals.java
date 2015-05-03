/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logic;

/**
 *
 * @author apprentice
 */
public class InOrderEquals {
//    Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. 
//
//InOrderEqual(2, 5, 11, false) → true
//InOrderEqual(5, 7, 6, false) → false
//InOrderEqual(5, 5, 7, true) → true

public static boolean InOrderEqual(int a, int b, int c, boolean equalOk) {
    return ((a<b && b<c)||(equalOk&&a<=b&&b<=c));
    
  
}
    
}
