/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring2.DAO;

import com.swcguild.flooring2.DTO.Tax;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TaxDAO {
    HashMap<String,Tax> taxMap = new HashMap<>();
    
    public void load() throws FileNotFoundException{
        String nextLine = "";
        String[] array = new String[2];
        Scanner sc = new Scanner(new BufferedReader(new FileReader("Taxes.txt")));
        sc.nextLine();
        while(sc.hasNext()){
            Tax tax = new Tax();
            nextLine = sc.nextLine();
            array = nextLine.split(",");
            tax.setState(array[0]);
            tax.setRate(Double.parseDouble(array[1]));
            taxMap.put(array[0], tax);
        }
    }
    
    public ArrayList<String> getStates(){
        ArrayList States = new ArrayList(taxMap.keySet());
        return States;
    }

    public Tax getTax(String state) {
        return taxMap.get(state);
    }
}
