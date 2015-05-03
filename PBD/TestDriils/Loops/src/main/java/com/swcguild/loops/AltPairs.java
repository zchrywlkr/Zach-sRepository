/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loops;

/**
 *
 * @author apprentice
 */
public class AltPairs {
//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 
//
//AltPairs("kitten") -> "kien"
//AltPairs("Chocolate") -> "Chole"
//AltPairs("CodingHorror") -> "Congrr"

public static String AltPairs(String str) {
    StringBuilder sb = new StringBuilder();
    
    try{
        sb.append(str.substring(0, 2));
        
    }catch(Exception e){
        return sb.toString();
    }
      try{
        sb.append(str.substring(4, 6));
        
    }catch(Exception e){
        return sb.toString();
    }
        try{
        sb.append(str.substring(8, 10));
        
    }catch(Exception e){
        return sb.toString();
    }
        return sb.toString();
}
    
}
