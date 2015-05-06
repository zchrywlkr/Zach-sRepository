/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interfaceexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Satchel {
    private int weightLimit;
    private int currentWeight = 0;
    
    HashMap<String,Item> itemMap = new HashMap<>();
    
    public Satchel(int weightLimit){
        this.weightLimit = weightLimit;
    }
    public boolean addToSatchel(Item item){
        if(item.getItemWeight()+ currentWeight > weightLimit){
            return false;
        }else{
            currentWeight+= item.getItemWeight();
            itemMap.put(item.getItemName(), item);
            return true;
        }
    }
    public Item removeFromSatchel(String itemName){
        Item temp = itemMap.remove(itemName);
        if(temp!=null){
            currentWeight -= temp.getItemWeight();
        }else{
            System.out.println("item no exist");
        }
        return temp;
        
    }
    
    public List<String> listItemsInSactchel(){
        Set<String> itemNames = itemMap.keySet();
        List<String> itemNameList= new ArrayList<>(itemNames);
        return itemNameList;
    }
}
