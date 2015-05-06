/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.iterationii;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
       HashMap<String,String> nfl = new HashMap();
       nfl.put("Cleveland", "Browns");
       nfl.put("Pittsburgh", "Steelers");
       nfl.put("Cincinnati", "Bengals");
       nfl.put("Minneapolis", "Vikings");
       nfl.put("Kansas City", "Chiefs");
       nfl.put("Baltimore", "Ravens");
       
       for(String key: nfl.keySet()){
           System.out.println(key + " " + nfl.get(key));
       }
        System.out.println("\r\r");
       
        Iterator its = nfl.keySet().iterator();
        while(its.hasNext()){
            String keys = its.next().toString();
            System.out.println(keys + " " + nfl.get(keys));
        }
        System.out.println("\r\r");
        
       Iterator it = nfl.entrySet().iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       
        System.out.println();
       for(Entry team: nfl.entrySet()){
           System.out.println(team.getKey()+" " + team.getValue());
    }
    
    }
    
}
