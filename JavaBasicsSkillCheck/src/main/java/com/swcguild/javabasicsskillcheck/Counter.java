/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasicsskillcheck;

/**
 *
 * @author apprentice
 */
public class Counter {
    public static void main(String[] args) {
        to10();
        toN(3);
        toN(8);
        toN(200);
        
    }
    
    
    public static void to10(){
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }
    
    public static void toN(int n){
        for(int i = 0; i<=n; i++){
            System.out.println(i);
        }
    }
    
}
