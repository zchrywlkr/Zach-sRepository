/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interfaceexample;

/**
 *
 * @author apprentice
 */
public class MagicSword extends Sword implements MagicItem{

    @Override
    public int getItemSpellPower() {
        return 2;
    }
    
    
    
}
