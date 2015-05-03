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
public class AreInOrder {
//    
//    Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a. 
//
//AreInOrder(1, 2, 4, false) → true
//AreInOrder(1, 2, 1, false) → false
//AreInOrder(1, 1, 2, true) → true

public static boolean AreInOrder(int a, int b, int c, boolean bOk) {
  return((a<b&&b<c)||(bOk&&b<c));
}
}
