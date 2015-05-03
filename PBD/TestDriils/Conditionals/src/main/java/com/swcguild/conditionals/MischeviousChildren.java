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
public class MischeviousChildren {
    public static boolean inTrouble(boolean asmile, boolean bsmile){
        if((asmile && bsmile) || (!asmile && !bsmile)){
            return true;            
        }else{
            return false;
        }
    }
    
}
