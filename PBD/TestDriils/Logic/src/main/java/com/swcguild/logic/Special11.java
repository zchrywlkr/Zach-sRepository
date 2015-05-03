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
public class Special11 {
//    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator
//
//SpecialEleven(22) → true
//SpecialEleven(23) → true
//SpecialEleven(24) → false

    public static boolean SpecialEleven(int n) {
        return n%11 < 2;
    }

}
