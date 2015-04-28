/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.testdrills;

/**
 *
 * @author apprentice
 */
public class App { 
    public static void main(String[] args) {
        int a[] = {5,11,9};
        int b[];
       b= RotateLeft.Rotate(a);
        for(int i = 0; i< b.length; i++){
            System.out.println(b[i]);
        }
    }
    
}
