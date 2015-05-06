/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine.dao;

import com.swcguild.vendingmachine.dto.Items;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class VendingMachine {
    private HashMap<Integer,Items> inventory = new HashMap<>();
    String DELIMITER = "::";

    public String printInventory() {
        StringBuilder sb = new StringBuilder();
        for(Items item: inventory.values()){
            sb.append(item.getId()).append(" ").append(item.getName()).append(" $").append(item.getCost()).append(" ").append(item.getNumber()).append("\r");
        }
        return sb.toString();
    }
    public HashMap<Integer,Items> getInventory() {
        return inventory;
    }
    public void setInventory(HashMap<Integer,Items> inventory) {
        this.inventory = inventory;
    }
    public double buy(int input) {
       inventory.get(input).setNumber( inventory.get(input).getNumber()-1);
       return inventory.get(input).getCost();
    }
    
    public void save() throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter("vm.txt"));
        for(Items item: inventory.values()){
            out.println(item.getId()+DELIMITER+item.getName()+DELIMITER+item.getCost()+DELIMITER+item.getNumber());
        }
    }
    
    public void load() throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("vm.txt")));
        String line ="";
        String array[] = new String[4];
        while(sc.hasNext()){
            line = sc.nextLine();
            array = line.split(DELIMITER);
            inventory.put(Integer.parseInt(array[0]), new Items(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3])));
        }
    }

    public VendingMachine() {
    }
    
}
