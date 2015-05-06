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
public class RPGSatcheel {
    public static void main(String[] args) {
        Sword weapon = new Sword();
        Sheild protection = new Sheild("large Sheild",30);
        Satchel bag = new Satchel(50);
        bag.addToSatchel(weapon);
        bag.addToSatchel(protection);
        System.out.println(bag.listItemsInSactchel());
        Potion magicPotion = new Potion();
        bag.addToSatchel(magicPotion);
        MagicSword sword2 = new MagicSword();
        bag.addToSatchel(sword2);
        
    }
    
}
