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
public class Closer {
//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
//
//Closer(8, 13) -> 8
//Closer(13, 8) -> 8
//Closer(13, 7) -> 0

public static int Closer(int a, int b) {
    int a10;
    int b10;  
    
    a10 = Math.abs(10-a);
    b10 = Math.abs(10-b);
    if(a10<b10){
        return a;
    }else if(b10<a10){
        return b;
    }else{
        return 0;
    }
}
    
}
