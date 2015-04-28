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
public class MakePi {
    public static int[] makePi(int n){
        int pi[] = new int[n];
        int num = 0;
        String stringPI = Double.toString(Math.PI);
        for(int i = 0; i < n; i++){
            if(Character.toString(stringPI.charAt(i)).equals(".")){
                num = 1;
            }
            pi[i]= Integer.parseInt(Character.toString(stringPI.charAt(i+num)));
        }
        return pi;
    }
    
}
