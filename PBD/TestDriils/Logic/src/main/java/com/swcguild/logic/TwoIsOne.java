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
public class TwoIsOne {
//    Given three ints, a b c, return true if it is possible to add two of the ints to get the third. 
//
//TwoIsOne(1, 2, 3) → true
//TwoIsOne(3, 1, 2) → true
//TwoIsOne(3, 2, 2) → false

public static boolean TwoIsOne(int a, int b, int c) {
    return(a+b==c||a+c==b||b+c==a);
  
}
    
}
