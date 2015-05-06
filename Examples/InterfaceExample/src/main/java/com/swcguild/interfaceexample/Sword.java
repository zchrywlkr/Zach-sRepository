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
public class Sword implements Item{

    @Override
    public int getItemWeight() {
        return 15;
    }

    @Override
    public String getItemName() {
        return "Sword";
    }
    public void sharpen(){
        System.out.println("Sharpening");
    }
    
    public void swing(){
        System.out.println("swinging");
    }
    
}
