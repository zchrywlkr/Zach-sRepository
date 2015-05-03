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
public class GotE {
//    Return true if the given string contains between 1 and 3 'e' chars. 
//
//GotE("Hello") -> true
//GotE("Heelle") -> true
//GotE("Heelele") -> false

public static boolean GotE(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    int e = 0;
    for(int i = 0; i< str.length(); i++){
        if(Character.toString(str.charAt(i)).equals("e")){
            e++;
        }
    }
    if(e>0 && e< 4){
        
        return true;
    }else{
       
        return false;
    }

}
}
