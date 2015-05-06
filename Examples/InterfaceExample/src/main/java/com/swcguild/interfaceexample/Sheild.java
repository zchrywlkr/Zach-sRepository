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
public class Sheild implements Item{
private String name="";
private int weight =0;

    public Sheild(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int getItemWeight() {
        return weight;
    }

    @Override
    public String getItemName() {
        return name;
    }
    public void block(){
        System.out.println("blockin");
    }
    
}
