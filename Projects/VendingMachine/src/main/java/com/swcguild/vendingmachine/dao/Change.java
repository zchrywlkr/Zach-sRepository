/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine.dao;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class Change {
    
    public static String makeChange(double change){
    
    int quarters=0;
    
    int dimes = 0;
    
    int nickels = 0;
   
    int pennies = 0;
 
    
    while(change > 0){
        if(change >= .25){
            change-=.25;
            quarters += 1;
        }else if(change>=.1){
            change -= .1;
            dimes +=1;
        }else if(change>= .05){
            change -= .05;
            nickels+=1;
        }else{
            change -= .01;
            pennies += 1;
        }
        
    }   
    return("\rquarters: " + quarters + "\r dimes: " + dimes+ "\rnickel" + nickels + "\rpennies" + pennies );
}
}