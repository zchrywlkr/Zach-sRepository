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
public class Potion implements MagicItem{

    @Override
    public int getItemSpellPower() {
        return 23;
    }

    @Override
    public int getItemWeight() {
        return 1;
    }

    @Override
    public String getItemName() {
        return "potion";
    }
    
    
    
}
