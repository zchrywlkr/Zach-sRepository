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
public class AreTheyTrue {
    public static void main(String[] args) {
        System.out.println(areTheyTrue(true,true));
        System.out.println(areTheyTrue(false,false));
        System.out.println(areTheyTrue(true,false));
        System.out.println(areTheyTrue(false,true));
        
    }
    
    public static String areTheyTrue(boolean bool1, boolean bool2){
        if(bool1&&bool2){
            return "both";
        }else if(!bool1&&!bool2){
            return "neither";
        }else{
            return "only one";
        }
    }
    
}
