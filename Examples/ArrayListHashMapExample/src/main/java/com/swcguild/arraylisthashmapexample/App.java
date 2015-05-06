/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arraylisthashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        
        myMap.put("java", "a great programming language");
        myMap.put("Akron", "where we are.");
        myMap.put("Browns", "a \"football team\" from Clevland");
        
        String whereAreWe= myMap.get("Akron");
        System.out.println(whereAreWe);
        
        String testString = myMap.get("Columbus");
        System.out.println(testString);
        
        boolean hasKey = myMap.containsKey("Columbus");
        System.out.println(hasKey);
        
        Set<String> myKeys = myMap.keySet();
        
        for(String currentKey: myKeys){
            System.out.println(currentKey);
        }
       Collection<String> myValues = myMap.values();
        
        for(String values : myValues){
            System.out.println(values);
        }
        
    }
    
    
    public static void arrayList() {
        ArrayList<String> mylist = new ArrayList<>();
        
        mylist.add("String1");
        mylist.add("String2");
        mylist.add("String3");
//        
        System.out.println(mylist.get(1));
        mylist.remove(1);
        System.out.println(mylist.get(1));
        
        mylist.add(1, "String2");
        //iterate through array using for loop
//        
//        for(int i= 0; i< mylist.size(); i++){
//            System.out.println(mylist.get(i));
//        }
//        System.out.println();
        for(String string: mylist){
            System.out.println(string);
        }
        
        mylist.stream().forEach((string) -> {
            System.out.println(string);
        });
        
        
        Iterator it = mylist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
    }
    
    
}
