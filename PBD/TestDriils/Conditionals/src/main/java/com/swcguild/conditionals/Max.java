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
public class Max {
//   Given three int values, a b c, return the largest. 
//
//Max(1, 2, 3) -> 3
//Max(1, 3, 2) -> 3
//Max(3, 2, 1) -> 3

    public static int Max(int a, int b, int c) {
        if(a>b&&a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
}
